package AdminModel.Report.Parent;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Didoy on 2/26/2016.
 */
public class ResponseSpecificOverView implements Serializable {


    ArrayList monthLyPopulationList;
    ArrayList monthLyPovertyFactorList;

    public ResponseSpecificOverView(ArrayList monthLyPopulationList, ArrayList monthLyPovertyFactorList) {
        this.monthLyPopulationList = monthLyPopulationList;
        this.monthLyPovertyFactorList = monthLyPovertyFactorList;
    }

    public ArrayList getMonthLyPopulationList() {
        return monthLyPopulationList;
    }

    public ArrayList getMonthLyPovertyFactorList() {
        return monthLyPovertyFactorList;
    }
}
