package Remote.Method.FamilyModel;

import java.sql.Date;

/**
 * Created by reiner on 3/3/2016.
 */
public class FamilyHistory {

    int id ;
    int familyid;
    String date;
    String  adminName;
    String action;
    boolean isRevoke;
    String revokeDescription;

    // this constructor used for after fetching history data of family
    public FamilyHistory(int id, int familyid, String date, String  adminName,
                         String action, boolean isRevoke, String revokeDescription) {
        this.id = id;
        this.familyid = familyid;
        this.date = date;
        this.adminName = adminName;
        this.action = action;
        this.isRevoke = isRevoke;
        this.revokeDescription = revokeDescription;

    }
    public FamilyHistory (){

    }


    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFamilyid() {
        return familyid;
    }

    public void setFamilyid(int familyid) {
        this.familyid = familyid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public boolean isRevoke() {
        return isRevoke;
    }

    public void setRevoke(boolean isRevoke) {
        this.isRevoke = isRevoke;
    }

    public String getRevokeDescription() {
        return revokeDescription;
    }

    public void setRevokeDescription(String revokeDescription) {
        this.revokeDescription = revokeDescription;
    }
}
