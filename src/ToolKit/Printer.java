package ToolKit;

import javafx.print.PrinterJob;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.stage.Window;
import utility.Utility;

/**
 * Created by reiner on 3/6/2016.
 */
public class Printer {

    public static PrinterJob getPrinter(){
        PrinterJob printer = PrinterJob.createPrinterJob();

        return printer;
    }

    public static void Print(Node node, Window window){

        PrinterJob printer =    getPrinter();
        if(printer.showPrintDialog(window) && printer.printPage(node)){
            printer.endJob();
            Utility.showMessageBox("Successfully completed printing", Alert.AlertType.ERROR);

        }else {
            Utility.showMessageBox("Unable to print Data", Alert.AlertType.ERROR);
        }
    }
}
