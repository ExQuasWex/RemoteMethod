package clientModel;

import java.io.Serializable;

/**
 * Created by reiner on 10/19/2015.
 */
public class Family implements Serializable {

    private familyInfo familyinfo;
    private FamilyPoverty familypoverty;

    public Family(familyInfo familyinfo, FamilyPoverty familypoverty) {
        this.familyinfo = familyinfo;
        this.familypoverty = familypoverty;
    }

    public familyInfo getFamilyinfo() {
        return familyinfo;
    }

    public void setFamilyinfo(familyInfo familyinfo) {
        this.familyinfo = familyinfo;
    }

    public FamilyPoverty getFamilypoverty() {
        return familypoverty;
    }

    public void setFamilypoverty(FamilyPoverty familypoverty) {
        this.familypoverty = familypoverty;
    }
}
