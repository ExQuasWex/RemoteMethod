package AdminModel.ResponseModel;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Created by Didoy on 2/1/2016.
 */
public class BarangayFamily implements Serializable {


    private static final long serialVersionUID = 287267931340084560L;

    private int ID;
    private String Name;
    private String spouseName;
    private String Date;


    public BarangayFamily() {

    }

    public BarangayFamily(int ID, String name, String spouseName, String date) {
        this.ID = ID;
        Name = name;
        this.spouseName = spouseName;
        Date = date;
    }



    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }
}
