package utility;

import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.regex.Pattern;

/**
 * Created by Didoy on 9/1/2015.
 */
public class Utility {

   private static  boolean isConfirmed;
    private static Alert alertBox ;

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

                        if (node.getClass().equals(GridPane.class) || node.getClass().equals(VBox.class) ||
                                node.getClass().equals(HBox.class) || node.getClass().equals(BorderPane.class)){

                                Pane childrenPane = (Pane) node;

                                    for (Node childrenNode : childrenPane.getChildren()){

                                        if (childrenNode.getClass().equals(TextField.class)){
                                            ((TextField) childrenNode).setText("");
                                        }else if(childrenNode.getClass().equals(ComboBox.class)){
                                            ((ComboBox) childrenNode).getSelectionModel().clearSelection();
                                        }
                                    }

                        }else if (node.getClass().equals(ScrollPane.class)){
                                    ScrollPane scrollPane =  ((ScrollPane) node);
                                    Pane pane1 =  (Pane)scrollPane.getContent();
                                    ClearComponents(pane1);
                        }
                        else{
                                for (Node childrenNode : mainpane.getChildren()){

                                    if (childrenNode.getClass().equals(TextField.class)){
                                        ((TextField) childrenNode).setText("");
                                    }else if (childrenNode.getClass().equals(ComboBox.class)){
                                        ((ComboBox) childrenNode).getSelectionModel().clearSelection();

                                    }

                                }

                        }

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

}