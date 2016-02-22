package Remote.Method.FamilyModel;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Created by reiner on 10/19/2015.
 */
public class FamilyInfo implements Serializable{

    private String inputDate;
    private LocalDate surveyedYr;
    private int residencyYr;
    private int numofChildren;

    private String name;
    private String spouseName;
    private String age;
    private String maritalStatus;
    private String barangay;
    private String gender;
    private String address;
    private int clientID;

    private int familyId;

    public FamilyInfo(int clientID, String inputDate, LocalDate surveyedYr, int residencyYr, int numofChildren, String name,
                      String spouseName, String age, String maritalStatus, String barangay, String gender, String address) {
       this.clientID = clientID;
        this.inputDate = inputDate;
        this.surveyedYr = surveyedYr;
        this.residencyYr = residencyYr;
        this.numofChildren = numofChildren;

        this.name = name;
        this.spouseName = spouseName;
        this.age = age;
        this.maritalStatus = maritalStatus;
        this.barangay = barangay;
        this.gender = gender;
        this.address = address;
    }

    public int familyId() {
        return familyId;
    }

    public void setfamilyId(int familyId) {
        this.familyId = familyId;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }


    public String getInputDate() {
        return inputDate;
    }

    public void setInputDate(String inputDate) {
        this.inputDate = inputDate;
    }

    public LocalDate getSurveyedYr() {
        return surveyedYr;
    }

    public void setSurveyedYr(LocalDate surveyedYr) {
        this.surveyedYr = surveyedYr;
    }

    public int getResidencyYr() {
        return residencyYr;
    }

    public void setResidencyYr(int residencyYr) {
        this.residencyYr = residencyYr;
    }

    public int getNumofChildren() {
        return numofChildren;
    }

    public void setNumofChildren(int numofChildren) {
        this.numofChildren = numofChildren;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getBarangay() {
        return barangay;
    }

    public void setBarangay(String barangay) {
        this.barangay = barangay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
