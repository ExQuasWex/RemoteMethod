package utility;

import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * Created by Didoy on 2/20/2016.
 */
public class FamilyNodes {

    //top pane
    private TextField dateField;
    private DatePicker datePicker;
    private TextField Name;
    private TextField SpouseName;
    private TextField agefield;
    private TextField addressF;
    private TextField yrResidency;
    private TextField numofChildrenF;
    private String surveyedyr;

    private ComboBox maritalCBox;
    private ComboBox barangayCb;
    private ComboBox genderCB;

    // bottom
    private ComboBox underEmployedCBox;
    private ComboBox otherIncomeCbox;
    private ComboBox ownershipCbox;
    private ComboBox below8kCbox;
    private ComboBox occupancyCBox;
    private ComboBox childrenSchlCBox;

    public FamilyNodes(TextField dateField, DatePicker datePicker, TextField name, TextField spouseName, TextField agefield, TextField addressF, TextField yrResidency, TextField numofChildrenF, String surveyedyr, ComboBox maritalCBox, ComboBox barangayCb, ComboBox genderCB, ComboBox underEmployedCBox, ComboBox otherIncomeCbox, ComboBox ownershipCbox, ComboBox below8kCbox, ComboBox occupancyCBox, ComboBox childrenSchlCBox) {
        this.dateField = dateField;
        this.datePicker = datePicker;
        Name = name;
        SpouseName = spouseName;
        this.agefield = agefield;
        this.addressF = addressF;
        this.yrResidency = yrResidency;
        this.numofChildrenF = numofChildrenF;
        this.surveyedyr = surveyedyr;
        this.maritalCBox = maritalCBox;
        this.barangayCb = barangayCb;
        this.genderCB = genderCB;
        this.underEmployedCBox = underEmployedCBox;
        this.otherIncomeCbox = otherIncomeCbox;
        this.ownershipCbox = ownershipCbox;
        this.below8kCbox = below8kCbox;
        this.occupancyCBox = occupancyCBox;
        this.childrenSchlCBox = childrenSchlCBox;
    }

    public TextField getDateField() {
        return dateField;
    }

    public DatePicker getDatePicker() {
        return datePicker;
    }

    public TextField getName() {
        return Name;
    }

    public TextField getSpouseName() {
        return SpouseName;
    }

    public TextField getAgefield() {
        return agefield;
    }

    public TextField getAddressF() {
        return addressF;
    }

    public TextField getYrResidency() {
        return yrResidency;
    }

    public TextField getNumofChildrenF() {
        return numofChildrenF;
    }

    public String getSurveyedyr() {
        return surveyedyr;
    }

    public ComboBox getMaritalCBox() {
        return maritalCBox;
    }

    public ComboBox getBarangayCb() {
        return barangayCb;
    }

    public ComboBox getGenderCB() {
        return genderCB;
    }

    public ComboBox getUnderEmployedCBox() {
        return underEmployedCBox;
    }

    public ComboBox getOtherIncomeCbox() {
        return otherIncomeCbox;
    }

    public ComboBox getOwnershipCbox() {
        return ownershipCbox;
    }

    public ComboBox getBelow8kCbox() {
        return below8kCbox;
    }

    public ComboBox getOccupancyCBox() {
        return occupancyCBox;
    }

    public ComboBox getChildrenSchlCBox() {
        return childrenSchlCBox;
    }
}
