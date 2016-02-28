package Remote.Method.FamilyModel;

import PriorityModels.PriorityLevel;

import java.io.Serializable;
import java.time.LocalDate;

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
    private LocalDate dateissued;
    private int month;
    private PriorityLevel priorityLevel;


    public FamilyPoverty(){

    }

    public FamilyPoverty(String hasotherIncome, String isbelow8k, String ownership, String occupancy, String isunderEmployed, String childreninSchool, LocalDate dateissued, int month) {
        this.hasotherIncome = hasotherIncome;
        this.isbelow8k = isbelow8k;
        this.ownership = ownership;
        this.occupancy = occupancy;
        this.isunderEmployed = isunderEmployed;
        this.childreninSchool = childreninSchool;
        this.dateissued = dateissued;
        this.month = month;
    }

    public LocalDate getDateissued() {
        return dateissued;
    }

    public void setDateissued(LocalDate dateissued) {
        this.dateissued = dateissued;
    }

    public PriorityLevel getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(PriorityLevel priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public LocalDate getYear() {
        return dateissued;
    }

    public void setYear(LocalDate year) {
        this.dateissued = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
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
