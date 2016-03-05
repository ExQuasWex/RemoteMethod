package ToolKit;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.DirectoryChooser;
import javafx.util.Callback;
import utility.Utility;

import java.io.File;
import java.util.Optional;

/**
 * Created by reiner on 3/3/2016.
 */
public class MessageBox {

private static  boolean isConfirmed = false;
private static String option = "";
private static DirectoryChooser directoryChooser = new DirectoryChooser();

    public static boolean  confirmMessageWithPassword(String text, String title, String officialPassword){

        DialogPane dialogPane = new DialogPane();
        Dialog dialog = new Dialog();

        Text textHeader = new Text(text);
        PasswordField passwordField  = new PasswordField();

        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);

        vBox.getChildren().addAll(textHeader, passwordField);
        vBox.setSpacing(10);

        dialogPane.setContent(vBox);

        dialog.setDialogPane(dialogPane);
        dialog.setTitle(title);
        dialog.setContentText(text);


        ButtonType okButtonType = new ButtonType("OK", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(okButtonType, ButtonType.CANCEL);

        dialog.setResultConverter(new Callback() {
            @Override
            public Object call(Object param) {

                ButtonType type = (ButtonType) param;
                    if (type == okButtonType){
                        String password = passwordField.getText();
                        return password;
                    }
                return null;
            }
        });

       Optional response =  dialog.showAndWait();
        passwordField.requestFocus();

        if (response.isPresent()){

            if (response.get().equals(officialPassword)){
                isConfirmed = true;
            }
        }

        return  isConfirmed;

    }

    public static String showHistoryDialog(String text, String title){
        ObservableList opList = FXCollections.observableArrayList();
        opList.add("A");
        opList.add("B");
        opList.add("C");

        DialogPane dialogPane = new DialogPane();
        dialogPane.setPrefSize(300, 200);
        Dialog dialog = new Dialog();

        Text textHeader = new Text(text);
        ComboBox comboBox = new ComboBox();
        comboBox.setPromptText("Options");

        comboBox.setItems(opList);

        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);

        vBox.getChildren().addAll(textHeader, comboBox);
        vBox.setSpacing(10);

        dialogPane.setContent(vBox);

        dialog.setDialogPane(dialogPane);
        dialog.setTitle(title);
        dialog.setContentText(text);

        ButtonType okButtonType = new ButtonType("OK", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(okButtonType, ButtonType.CANCEL);

        dialog.setResultConverter(new Callback() {
            @Override
            public Object call(Object param) {

                ButtonType type = (ButtonType) param;
                if (type == okButtonType){
                    return okButtonType;

                }
                return null;
            }
        });

            Optional<ButtonType> response =  dialog.showAndWait();

            if (response.isPresent()){
                if (response.get() == okButtonType){
                    option = (String) comboBox.getSelectionModel().getSelectedItem();
                   if (option == null){
                       Utility.showMessageBox("PLease select description in optionlist", Alert.AlertType.INFORMATION);
                       option = null;
                   }
                }else {
                    option = null;
                }
            }

        return  option;
    }

    public static String showImportDatabaseDialog(){
        String path = "";

        DialogPane dialogPane = new DialogPane();
        dialogPane.setPrefSize(500, 200);
        Dialog dialog = new Dialog();

        Text textHeader = new Text("Please Select Database Directory");

        TextField textField = new TextField();
        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(10);
        vBox.setFillWidth(false);

        vBox.getChildren().addAll(textHeader, textField);

        dialogPane.setContent(vBox);

        dialog.setDialogPane(dialogPane);
        dialog.setTitle("Information Message");
        dialog.setContentText("Select Database Directory");

        ButtonType select = new ButtonType("Select Database Directory", ButtonBar.ButtonData.OK_DONE);
        ButtonType okButtonType = new ButtonType("OK", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(okButtonType,select, ButtonType.CANCEL);

        dialog.setResultConverter(new Callback() {
            @Override
            public Object call(Object param) {

                ButtonType type = (ButtonType) param;
                if (type == okButtonType){
                    return okButtonType;
                }else if (type == select) {
                    return select;
                }
                return null;
            }
        });

        Optional<ButtonType> response =  dialog.showAndWait();

        if (response.isPresent()){
            if (response.get() == okButtonType){
                path = textField.getText().trim();
            }else if (response.get() == select){
                File file = directoryChooser.showDialog(dialog.getOwner());
                    if (file == null){
                            Utility.showMessageBox("Invalid Database Directory path, Server Shutting Down", Alert.AlertType.ERROR);
                            System.exit(0);
                    }else {
                            if (file.isDirectory()){
                                path = file.getPath();
                            }else {
                                Utility.showMessageBox("Invalid Database Directory path", Alert.AlertType.ERROR);
                            }
                        }
                    dialog.show();
                }
        }

        return  path;

    }


}
