package utility;

import AdminModel.ResponseModel.BarangayFamily;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.*;

import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.prefs.Preferences;
import java.util.regex.Pattern;

/**
 * Created by Didoy on 9/1/2015.
 */
public class Utility {

   private static  boolean isConfirmed;
    private static Alert alertBox ;
    private static Preferences pref;
    private  static  String ip;
    private static String IPKEY = "serverip";

    public Utility(){

    }


    public static String getCurrentYear(){
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return  String.valueOf(year);
    }
    public static int getCurrentIntYear(){
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return  year;
    }



    public static void ClearComponents(Pane mainpane){
        for (Node node: mainpane.getChildren()){

            // for clearing standard panes
                        if (node.getClass().equals(GridPane.class) || node.getClass().equals(VBox.class) ||
                                node.getClass().equals(HBox.class) || node.getClass().equals(BorderPane.class)){

                                Pane childrenPane = (Pane) node;

                                    for (Node childrenNode : childrenPane.getChildren()){

                                        clearNodes(childrenNode);
                                        System.out.println("ClearComponents. Pane Classes");

                                    }

                        }else if (node.getClass().equals(ScrollPane.class)){
                                    ScrollPane scrollPane =  ((ScrollPane) node);
                                    Pane pane1 =  (Pane)scrollPane.getContent();
                                    ClearComponents(pane1);
                            System.out.println("ClearComponents. scrollpane");
                        }
                        else{
                                for (Node childrenNode : mainpane.getChildren()){

                                    clearNodes(childrenNode);
                                    System.out.println("ClearComponents. Node Classes");

                                }

                        }

        }

    }

    private static void clearNodes(Node childrenNode){

        if (childrenNode.getClass().equals(TextField.class)) {
                ((TextField) childrenNode).setText("");

        } else if (childrenNode.getClass().equals(ComboBox.class)) {
                ((ComboBox) childrenNode).getSelectionModel().clearSelection();
        } else if(childrenNode.getClass().equals(DatePicker.class)){
                ((DatePicker) childrenNode).setValue(null);

        }else {
            System.out.println(childrenNode.getClass());
        }
    }

    public static String getCurrentDate(){
        LocalDate currentDate = LocalDate.now();

        return currentDate.toString();
    }

    public static int getCurrentMonth(){
        java.util.Date date = new java.util.Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int month = cal.get(Calendar.MONTH);

        return month + 1;
    }


    public static LocalDate StringToLocalDate(String date){
        LocalDate localDate = LocalDate.parse(date);

        return localDate;
    }

    public static void closeConnection(Connection connection){

        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void showMessageBox(String message, Alert.AlertType alertType){

        if (!Platform.isFxApplicationThread()){
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    alertBox = new Alert(alertType);
                    alertBox.setTitle("Information");
                    alertBox.setContentText(message);
                    alertBox.setHeaderText(null);
                    alertBox.show();
                }
            });
        }else {
                    alertBox = new Alert(alertType);
                    alertBox.setTitle("Information");
                    alertBox.setContentText(message);
                    alertBox.setHeaderText(null);
                    alertBox.show();
        }

    }

    /*
            Not thread safe! make sure to
            only use this method when it will run on
            FX thread


     */
    public static boolean showConfirmationMessage(String message, Alert.AlertType alertType)  {
        isConfirmed = false;

       if (Platform.isFxApplicationThread()){
                       alertBox = new Alert(alertType);

                       alertBox.setTitle("Information Message");
                       alertBox.setHeaderText(message);
                       alertBox.setContentText(null);

                        Optional result = alertBox.showAndWait();

                       if (result.get() == ButtonType.OK) {
                           isConfirmed = true;
                           System.out.println("thread true");
                       } else {
                           isConfirmed = false;
                           System.out.println("thread false");
                       }
       }

        return isConfirmed;
    }

    public static  int convertStringMonth(String Month){
        int month = 0;

        switch (Month){
            case "January": month =  1;
                break;
            case "February": month =  2;
                break;
            case "March": month =  3;
                break;
            case "April": month =  4;
                break;
            case "May": month =  5;
                break;
            case "June": month =  6;
                break;
            case "July": month =  7;
                break;
            case "August": month =  8;
                break;
            case "September": month =  9;
                break;
            case "October": month =  10;
                break;
            case "November": month =  11;
                break;
            case "December": month =  12;
                break;

        }

        return month;
    }



    public static List readObject()  {
        // default deserialization
        List list = null;

        try {
            FileInputStream fis = new FileInputStream("t.tmp");
            ObjectInputStream ois = new ObjectInputStream(fis);

             list = (List) ois.readObject();

//            barangayFamily.setName((String) list.get(0));
//            barangayFamily.setSpouseName((String) list.get(1));
//            barangayFamily.setDate((String) list.get(2));
//            barangayFamily.setID((Integer) list.get(3));
//            barangayFamily.setSelection((Boolean) list.get(4));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }


    public static boolean WriteObject( ArrayList list) {
        boolean isSave = false;
        // default serialization
        try {
            FileOutputStream fos = new FileOutputStream("t.tmp");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(list);

            oos.close();
            isSave = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        // write the object
        return isSave;
    }

    // save ip address from preference
    public static void SavePreference(String ipAdd){
        ip = ipAdd;
        pref.put(IPKEY, ip);
    }

    // get ip address from preference
    public static String getPreference(){

        if (pref == null){
            createPreference();
        }

        try {
            ip = pref.get(IPKEY, ip);
        }catch (NullPointerException ex){
            ip = "";
            ex.printStackTrace();
        }
            return ip;
    }


    public static void  createPreference(){
        pref =  Preferences.userRoot().node(String.valueOf(Utility.class));
    }


}