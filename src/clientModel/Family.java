package clientModel;

import java.io.Serializable;

/**
 * Created by reiner on 10/19/2015.
 */
public class Family implements Serializable {

    private FamilyInfo familyinfo;
    private FamilyPoverty familypoverty;

    public Family(FamilyInfo familyinfo, FamilyPoverty familypoverty) {
        this.familyinfo = familyinfo;
        this.familypoverty = familypoverty;
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
