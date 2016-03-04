package Remote.Method.FamilyModel;

import java.io.Serializable;

/**
 * Created by reiner on 10/19/2015.
 */
public class Family implements Serializable {

    private FamilyInfo familyinfo;
    private FamilyPoverty familypoverty;
    private FamilyHistory familyHistory;

    public Family(FamilyInfo familyinfo, FamilyPoverty familypoverty) {
        this.familyinfo = familyinfo;
        this.familypoverty = familypoverty;
    }

    public Family(FamilyInfo familyinfo, FamilyPoverty familypoverty, FamilyHistory familyHistory) {
        this.familyinfo = familyinfo;
        this.familypoverty = familypoverty;
        this.familyHistory = familyHistory;
    }

    public FamilyHistory getFamilyHistory() {
        return familyHistory;
    }

    public void setFamilyHistory(FamilyHistory familyHistory) {
        this.familyHistory = familyHistory;
    }

    public FamilyInfo getFamilyinfo() {
        return familyinfo;
    }

    public void setFamilyinfo(FamilyInfo familyinfo) {
        this.familyinfo = familyinfo;
    }

    public FamilyPoverty getFamilypoverty() {
        return familypoverty;
    }

    public void setFamilypoverty(FamilyPoverty familypoverty) {
        this.familypoverty = familypoverty;
    }
}
