package utility;

import AdminModel.ResponseModel.BarangayFamily;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
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
    private static boolean isvalidate = false;


    private static ObservableList<Node>  errorNodeList = FXCollections.observableArrayList();

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

                                    }

                        }else if (node.getClass().equals(ScrollPane.class)){
                                    ScrollPane scrollPane =  ((ScrollPane) node);
                                    Pane pane1 =  (Pane)scrollPane.getContent();
                                    ClearComponents(pane1);
                        }
                        else{
                                for (Node childrenNode : mainpane.getChildren()){

                                    clearNodes(childrenNode);

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

            if (connection != null){
                connection.close();
            }
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


    public static boolean Validate(FamilyNodes familyNodes){

        //top pane
         TextField dateField  = familyNodes.getDateField();
         DatePicker datePicker = familyNodes.getDatePicker();
         TextField Name = familyNodes.getName();
         TextField SpouseName = familyNodes.getSpouseName();
         TextField agefield = familyNodes.getAgefield();
         TextField addressF = familyNodes.getAddressF();
         TextField yrResidency = familyNodes.getYrResidency();
         TextField numofChildrenF = familyNodes.getNumofChildrenF();
         String surveyedyr = familyNodes.getSurveyedyr();

         ComboBox maritalCBox = familyNodes.getMaritalCBox();
         ComboBox barangayCb = familyNodes.getBarangayCb();
         ComboBox genderCB = familyNodes.getGenderCB();

        // bottoom
         ComboBox underEmployedCBox = familyNodes.getUnderEmployedCBox();
         ComboBox otherIncomeCbox = familyNodes.getOtherIncomeCbox();
         ComboBox ownershipCbox = familyNodes.getOwnershipCbox();
         ComboBox below8kCbox = familyNodes.getBelow8kCbox();
         ComboBox occupancyCBox = familyNodes.getOccupancyCBox();
         ComboBox childrenSchlCBox = familyNodes.getChildrenSchlCBox();


            int  yrNow = Calendar.getInstance().get(Calendar.YEAR);
            String residencyYr = yrResidency.getText().trim();
            String name = Name.getText().trim() + " ";
            String spousename = SpouseName.getText().trim();
            String age = agefield.getText();
            String address =  addressF.getText();
            String maritalStatus = null;



        if (datePicker.getValue() != null){
            surveyedyr = datePicker.getValue().toString();
        }

        ////////---- Year of residency ----////////

        if(datePicker.getValue() == null ) {
            showErrorMessage("Please add surveyed year in year field", "Error Information", datePicker);

        }else  if (!Pattern.matches("^\\d{4}-\\d{2}-\\d{2}$",surveyedyr)){
            showErrorMessage("Invalid Surveyed Year", "Error Information", datePicker);
            System.out.println(yrNow);

        } else if (datePicker.getValue().isAfter(LocalDate.parse(Utility.getCurrentDate()))) {
            System.out.println(yrNow);
            showErrorMessage("Invalid surveyed datee, the date you insert is later than the current date", "Error Information", datePicker);

        }
        ////////---- Year of residency ----////////
        else if (residencyYr.equals("")) {
            showErrorMessage("Please add year of residency in residency field", "Error Information", yrResidency);
        }
        else if (!Pattern.matches("^[\\d]{4}+",residencyYr)){
            showErrorMessage("Invalid year of residency", "Error Information", yrResidency);
        }
        else if (Integer.parseInt(residencyYr) > yrNow){
            showErrorMessage("Invalid year of residency, year of residency is later than the current year", "Error Information",yrResidency);
        }
        ////////---- Marital Status ----////////
        else if (maritalCBox.getSelectionModel().isEmpty()){
            showErrorMessage("Please select marital status", "Error Information",maritalCBox);
        }
        ////////---- Barangay ----////////
        else if (barangayCb.getSelectionModel().isEmpty()){
            showErrorMessage("Please select barangay", "Error Information",barangayCb);
        }
        ////////---- Gender ----////////
        else if (genderCB.getSelectionModel().isEmpty()){
            showErrorMessage("Please select Gender", "Error Information",genderCB);
        }                    ////////---- Age ----////////
        else if (age.equals("")){
            showErrorMessage("Please add Age in age field", "Error Information", agefield);
        }
        ////////---- Name ----////////
        else if (Name.getText().trim().equals("") ){

            showErrorMessage("Please add name in name fields", "Error Information", Name);
        }
        else if (!Pattern.matches("^[A-Za-z\\s]+",name)){

            showErrorMessage("Please remove any digit or any special character in name fields", "Error Information", Name);
        }
        ////////---- Spouse Name ----////////
        else if (SpouseName.getText().trim().equals("") && (maritalCBox.getSelectionModel().getSelectedItem().toString().equals("Married")||
                maritalCBox.getSelectionModel().getSelectedItem().toString().equals("Live-in"))){

            showErrorMessage("Please add spouse name in spouse name fields", "Error Information", SpouseName);

        }
        ////////---- Address ----////////
        else if (address.trim().equals("")) {
            showErrorMessage("Please add address in address field", "Error Information", addressF);
        }
        else if (!Pattern.matches("^[a-zA-Z0-9\\.\\-\\s]+",address)){
            showErrorMessage("Invalid Address in address field","Error Information",addressF);
        }else if (otherIncomeCbox.getSelectionModel().isEmpty()){
            showErrorMessage("Other income resource option is empty", "Error Information", otherIncomeCbox);
        }else if (below8kCbox.getSelectionModel().isEmpty()){
            showErrorMessage("Below eight thousand option is empty","Error Information",below8kCbox);

        }else if (ownershipCbox.getSelectionModel().isEmpty()){
            showErrorMessage("Ownership option is empty","Error Information",ownershipCbox);

        }
        else if (occupancyCBox.getSelectionModel().isEmpty()){
            showErrorMessage("Occupancy option is empty","Error Information",occupancyCBox);

        }
        else if (underEmployedCBox.getSelectionModel().isEmpty() && occupancyCBox.getSelectionModel().getSelectedItem().equals("Employed")){
            showErrorMessage("UnderEmployed option is empty","Error Information",underEmployedCBox);

        }
        else if (childrenSchlCBox.getSelectionModel().isEmpty()){
            int children = Integer.parseInt(numofChildrenF.getText());
            if (children == 0){
                isvalidate = true;
            }else if (children >= 1){
                showErrorMessage("Children in school option is empty","Error Information",childrenSchlCBox);
            }

        }
        else {
            isvalidate = true;
        }

        return isvalidate;

    }

    private static void showErrorMessage(String msg,String title,Node node) {

        isvalidate = false;

        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle(title);
        alert.setContentText(msg);

        errorNodeList.add(node);

        // adding some red highligt color
        for (Node nodes : errorNodeList) {
            if (nodes.getClass().equals(ComboBox.class) ){
                nodes.getStyleClass().add("combo-box-error");

            }else{
                nodes.getStyleClass().add("text-field-error");
            }
        }

        /*
         adding mouse event listeners to nodes
         which removes the red highlighten or focused
          */
        for (Node nodee : errorNodeList){
            nodee.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    if (nodee.getClass().equals(ComboBox.class) ){
                        nodee.getStyleClass().remove("combo-box-error");
                        errorNodeList.remove(nodee);

                    }else {
                        nodee.getStyleClass().remove("text-field-error");
                        errorNodeList.remove(nodee);

                    }
                }
            });

            // return to normal color after being focused
            nodee.focusedProperty().addListener(new ChangeListener<Boolean>() {
                @Override
                public void changed(ObservableValue<? extends Boolean> observable, Boolean outFocused, Boolean Focused) {
                    if (Focused){
                        if (nodee.getClass().equals(ComboBox.class) ){
                            nodee.getStyleClass().remove("combo-box-error");
                            errorNodeList.remove(nodee);

                        }else {
                            nodee.getStyleClass().remove("text-field-error");
                            errorNodeList.remove(nodee);

                        }
                    }
                }
            });
        }

        alert.show();
    }
    // 2016-02-01 becomes 02
    public static String DateToMonth(String date) {
        String month;
        month = date.substring(5, date.length() - 3);
        return month;
    }

    // Convert 2 digit numbers to String month value ex. 01 = January
    public static String rebirtDigitalMonth(String Month) {

        String month = null;

        switch (Month) {
            case "01":
                month = "January";
                break;
            case "02":
                month = "February";
                break;
            case "03":
                month = "March";
                break;
            case "04":
                month = "April";
                break;
            case "05":
                month = "May";
                break;
            case "06":
                month = "June";
                break;
            case "07":
                month = "July";
                break;
            case "08":
                month = "August";
                break;
            case "09":
                month = "September";
                break;
            case "10":
                month = "October";
                break;
            case "11":
                month = "November";
                break;
            case "12":
                month = "December";
                break;

        }

        return month;
    }
    // convert January to 01 so on..
    public static String DigitalizeMonth(String month){

        switch (month) {
            case "January":
                month = "01";
                break;
            case "February":
                month = "02";
                break;
            case "March":
                month = "03";
                break;
            case "April":
                month = "04";
                break;
            case "May":
                month = "05";
                break;
            case "June":
                month = "06";
                break;
            case "July":
                month = "07";
                break;
            case "August":
                month = "08";
                break;
            case "September":
                month = "09";
                break;
            case "October":
                month = "10";
                break;
            case "November":
                month = "11";
                break;
            case "December":
                month = "12";
                break;
        }
            return month;

    }
   // 2016-02-01 = 2016-02
    public static String subStringDate(String date ){
        String modDate = date.substring(0, date.length() - 3);
        return modDate;
    }

    // month = Alphabet month such as January
    public static String concatinateYearAndMonth(String year, String month){
        String Month = DigitalizeMonth(month);
        String Date = year + "-" + Month;
        return Date;
    }


}