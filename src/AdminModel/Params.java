package AdminModel;

import java.io.Serializable;

/**
 * Created by Didoy on 1/13/2016.
 */
public class Params implements Serializable{

    private int Year;
    private int MaxYear;

    private int Month;
    private String Barangay1;
    private String Barangay2;

    private String xValue;


    String date;

    public int getMaxYear() {
        return MaxYear;
    }


    public void setMaxYear(int maxYear) {
        MaxYear = maxYear;
    }

    public Params() {
    }

    public Params(int year, int MaxYear, int month, String barangay1, String barangay2) {
        Year = year;
        this.MaxYear = MaxYear;
        Month = month;
        Barangay1 = barangay1;
        Barangay2 = barangay2;
    }

    public Params(String date , String barangay1) {
        this.date = date;
        this.Barangay1 = barangay1;

    }

    public Params(String date , String barangay1, String xValue) {
        this.date = date;
        this.Barangay1 = barangay1;
        this.xValue = xValue;
    }

    public String getxValue() {
        return xValue;
    }

    public void setxValue(String xValue) {
        this.xValue = xValue;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int month) {
        Month = month;
    }

    public String getBarangay1() {
        return Barangay1;
    }

    public void setBarangay1(String barangay1) {
        Barangay1 = barangay1;
    }

    public String getBarangay2() {
        return Barangay2;
    }

    public void setBarangay2(String barangay2) {
        Barangay2 = barangay2;
    }
}
