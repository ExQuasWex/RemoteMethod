package utility;

import javafx.application.Platform;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Optional;
import java.util.regex.Pattern;

/**
 * Created by Didoy on 9/1/2015.
 */
public class Utility {

    public Utility(){
    }

    public boolean confirmExit(){
        boolean bol = false;

        Alert alertBox = new Alert(Alert.AlertType.CONFIRMATION);
        alertBox.setTitle("Confirmation Window");
        alertBox.setHeaderText("Are you sure you would like to exit?");
        alertBox.setContentText(null);

        Optional<ButtonType> result = alertBox.showAndWait();

        if (result.get() == ButtonType.OK){
            bol = true;
        }else{
            bol = false;
            alertBox.close();
        }
        return bol;
    }

    public static void ClearComponents(Pane mainpane){
        for (Node node: mainpane.getChildren()){

                        if (node.getClass().equals(GridPane.class) || node.getClass().equals(VBox.class) ||
                                node.getClass().equals(HBox.class) || node.getClass().equals(BorderPane.class)){

                                Pane childrenPane = (Pane) node;

                                    for (Node childrenNode : childrenPane.getChildren()){

                                        if (childrenNode.getClass().equals(TextField.class)){
                                            ((TextField) childrenNode).setText("");
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
        java.util.Date date= new java.util.Date();
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

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Alert alertBox = new Alert(alertType);
                alertBox.setTitle("Information");
                alertBox.setContentText(message);
                alertBox.setHeaderText(null);
                alertBox.show();
            }
        });



    }



}
