package clientModel;

import java.io.Serializable;

/**
 * Created by Didoy on 2/24/2016.
 */
public class ClientEntries implements Serializable {

    private int id = 0;
    private String familyName;
    private String date;

    public ClientEntries(int id, String familyName, String date) {
        this.id = id;
        this.familyName = familyName;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
