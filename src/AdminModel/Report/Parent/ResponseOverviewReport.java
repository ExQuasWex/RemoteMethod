package AdminModel.Report.Parent;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Didoy on 1/15/2016.
 */
public class ResponseOverviewReport implements Serializable {

private ArrayList factorList;
private ArrayList povertyList;

    public ResponseOverviewReport(ArrayList factorList, ArrayList povertyList) {
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
