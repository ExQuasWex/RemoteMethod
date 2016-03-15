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
    private int barangayID = 0;
    private int totalResolution = 0;

    private String name;
    private String Lastname;
    private String Middlename;

    private String spouseName;
    private String age;
    private String maritalStatus;
    private String barangay;
    private String gender;
    private String address;
    private int clientID;

    private int familyId;

    public int getTotalResolution() {
        return totalResolution;
    }

    public void setTotalResolution(int totalResolution) {
        this.totalResolution = totalResolution;
    }

    public int getBarangayID() {
        return barangayID;
    }

    public void setBarangayID(int barangayID) {
        this.barangayID = barangayID;
    }

    public int getFamilyId() {
        return familyId;
    }

    public void setFamilyId(int familyId) {
        this.familyId = familyId;
    }


    public FamilyInfo(String inputDate, LocalDate surveyedYr, int residencyYr, int numofChildren, int barangayID,
                      int totalResolution, String name, String lastname, String middlename, String spouseName,
                      String age, String maritalStatus, String barangay, String gender, String address,
                      int clientID, int familyId) {
        this.inputDate = inputDate;
        this.surveyedYr = surveyedYr;
        this.residencyYr = residencyYr;
        this.numofChildren = numofChildren;
        this.barangayID = barangayID;
        this.totalResolution = totalResolution;
        this.name = name;
        Lastname = lastname;
        Middlename = middlename;
        this.spouseName = spouseName;
        this.age = age;
        this.maritalStatus = maritalStatus;
        this.barangay = barangay;
        this.gender = gender;
        this.address = address;
        this.clientID = clientID;
        this.familyId = familyId;
    }

    public FamilyInfo(String inputDate, LocalDate surveyedYr, int residencyYr,
                      int numofChildren, String name, String lastname, String middlename,
                      String spouseName, String age, String maritalStatus, String barangay,
                      String gender, String address, int clientID, int familyId) {
        this.inputDate = inputDate;
        this.surveyedYr = surveyedYr;
        this.residencyYr = residencyYr;
        this.numofChildren = numofChildren;
        this.name = name;
        Lastname = lastname;
        Middlename = middlename;
        this.spouseName = spouseName;
        this.age = age;
        this.maritalStatus = maritalStatus;
        this.barangay = barangay;
        this.gender = gender;
        this.address = address;
        this.clientID = clientID;
        this.familyId = familyId;
    }

    public FamilyInfo(String inputDate, LocalDate surveyedYr, int residencyYr,
                      int numofChildren, String name, String lastname, String middlename,
                      String spouseName, String age, String maritalStatus, String barangay,
                      String gender, String address, int clientID) {
        this.inputDate = inputDate;
        this.surveyedYr = surveyedYr;
        this.residencyYr = residencyYr;
        this.numofChildren = numofChildren;
        this.name = name;
        Lastname = lastname;
        Middlename = middlename;
        this.spouseName = spouseName;
        this.age = age;
        this.maritalStatus = maritalStatus;
        this.barangay = barangay;
        this.gender = gender;
        this.address = address;
        this.clientID = clientID;
    }

    public FamilyInfo(int residencyYr, int familyId, int numofChildren,
                      String name, String lastname, String middlename, String spouseName,
                      String maritalStatus, String age, String gender) {
        this.residencyYr = residencyYr;
        this.familyId = familyId;
        this.numofChildren = numofChildren;
        this.name = name;
        Lastname = lastname;
        Middlename = middlename;
        this.spouseName = spouseName;
        this.maritalStatus = maritalStatus;
        this.age = age;
        this.gender = gender;
    }

    public FamilyInfo(){

    }



    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getMiddlename() {
        return Middlename;
    }

    public void setMiddlename(String middlename) {
        Middlename = middlename;
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
