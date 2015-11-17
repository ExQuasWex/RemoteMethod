package Family;

import java.io.Serializable;

/**
 * Created by reiner on 10/19/2015.
 */
public class FamilyPoverty implements Serializable{

    private String hasotherIncome;
    private String isbelow8k;
    private String ownership;
    private String occupancy;
    private String isunderEmployed;
    private String childreninSchool;

    public FamilyPoverty(String hasotherIncome, String isbelow8k, String ownership, String occupancy, String isunderEmployed, String childreninSchool) {
        this.hasotherIncome = hasotherIncome;
        this.isbelow8k = isbelow8k;
        this.ownership = ownership;
        this.occupancy = occupancy;
        this.isunderEmployed = isunderEmployed;
        this.childreninSchool = childreninSchool;
    }

    public String getHasotherIncome() {
        return hasotherIncome;
    }

    public void setHasotherIncome(String hasotherIncome) {
        this.hasotherIncome = hasotherIncome;
    }

    public String getIsbelow8k() {
        return isbelow8k;
    }

    public void setIsbelow8k(String isbelow8k) {
        this.isbelow8k = isbelow8k;
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    public String getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(String occupancy) {
        this.occupancy = occupancy;
    }

    public String getIsunderEmployed() {
        return isunderEmployed;
    }

    public void setIsunderEmployed(String isunderEmployed) {
        this.isunderEmployed = isunderEmployed;
    }

    public String getChildreninSchool() {
        return childreninSchool;
    }

    public void setChildreninSchool(String childreninSchool) {
        this.childreninSchool = childreninSchool;
    }
}
