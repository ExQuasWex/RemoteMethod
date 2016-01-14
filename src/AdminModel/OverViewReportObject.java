package AdminModel;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Didoy on 1/15/2016.
 */
public class OverViewReportObject implements Serializable {

private ArrayList factorList;
private ArrayList povertyList;

    public OverViewReportObject(ArrayList factorList, ArrayList povertyList) {
        this.factorList = factorList;
        this.povertyList = povertyList;
    }

    public ArrayList getFactorList() {
        return factorList;
    }

    public void setFactorList(ArrayList factorList) {
        this.factorList = factorList;
    }

    public ArrayList getPovertyList() {
        return povertyList;
    }

    public void setPovertyList(ArrayList povertyList) {
        this.povertyList = povertyList;
    }
}
