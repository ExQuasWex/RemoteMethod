package ToolKit;

import javafx.print.PageLayout;
import javafx.print.PageOrientation;
import javafx.print.Paper;
import javafx.print.PrinterJob;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.transform.Scale;
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
    Node tobePrintNode = node;
        Scale scale = null;

        if (node == null){
            Utility.showMessageBox("Cane print empty node", Alert.AlertType.ERROR);

        }else {

                PrinterJob printer = getPrinter();

                if (printer != null) {

                    PageLayout pageLayout = printer.getPrinter().getDefaultPageLayout();
                    double scaleX = pageLayout.getPrintableWidth() / tobePrintNode.getBoundsInParent().getWidth();
                    double scaleY = pageLayout.getPrintableHeight() / tobePrintNode.getBoundsInParent().getHeight();
                    double minimumScale = Math.min(scaleX, scaleY);
                     scale = new Scale(minimumScale, minimumScale);

                    tobePrintNode.getTransforms().add(scale);

                    if (printer.showPrintDialog(window) && printer.printPage(pageLayout, tobePrintNode)) {
                        printer.endJob();
                        Utility.showMessageBox("Successfully completed printing", Alert.AlertType.ERROR);
                    }
                  } else {
                 Utility.showMessageBox("Unable to print Data", Alert.AlertType.ERROR);
                    }
            tobePrintNode.getTransforms().remove(scale);

        }
    }
}
