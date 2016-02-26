package AdminModel.Report.Children.Model;

import java.io.Serializable;

/**
 * Created by Didoy on 1/23/2016.
 */
public class ResponsePovertyFactor implements Serializable{


    private int Unemployed, Underemployed, NoOtherIncome,
    BelowMinimun, NoShelter;

    private String month;

    public ResponsePovertyFactor(int unemployed, int underemployed, int noOtherIncome, int belowMinimun, int noShelter, String month) {
        Unemployed = unemployed;
        Underemployed = underemployed;
        NoOtherIncome = noOtherIncome;
        BelowMinimun = belowMinimun;
        NoShelter = noShelter;
        this.month = month;
    }

    public ResponsePovertyFactor(int unemployed, int underemployed, int noOtherIncome, int belowMinimun, int noShelter) {
        Unemployed = unemployed;
        Underemployed = underemployed;
        NoOtherIncome = noOtherIncome;
        BelowMinimun = belowMinimun;
        NoShelter = noShelter;
    }

    public String getMonth() {
        return month;
    }

    public int getUnemployed() {
        return Unemployed;
    }

    public void setUnemployed(int unemployed) {
        Unemployed = unemployed;
    }

    public int getUnderemployed() {
        return Underemployed;
    }

    public void setUnderemployed(int underemployed) {
        Underemployed = underemployed;
    }

    public int getNoOtherIncome() {
        return NoOtherIncome;
    }

    public void setNoOtherIncome(int noOtherIncome) {
        NoOtherIncome = noOtherIncome;
    }

    public int getBelowMinimun() {
        return BelowMinimun;
    }

    public void setBelowMinimun(int belowMinimun) {
        BelowMinimun = belowMinimun;
    }

    public int getNoShelter() {
        return NoShelter;
    }

    public void setNoShelter(int noShelter) {
        NoShelter = noShelter;
    }
}
