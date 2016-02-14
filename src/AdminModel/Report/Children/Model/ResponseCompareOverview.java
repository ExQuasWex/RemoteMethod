package AdminModel.Report.Children.Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Didoy on 1/26/2016.
 */
public class ResponseCompareOverview implements Serializable {

    private int UnresolvePopulationYearOne;
    private int UnresolvePopulationYeartwo;
    private ArrayList povertyFactorOneList;
    private ArrayList povertyFactorTwoList;


    public ResponseCompareOverview(int unresolvePopulationYearOne, int unresolvePopulationYeartwo, ArrayList povertyFactorOneList, ArrayList povertyFactorTwoList) {
        UnresolvePopulationYearOne = unresolvePopulationYearOne;
        UnresolvePopulationYeartwo = unresolvePopulationYeartwo;
        this.povertyFactorOneList = povertyFactorOneList;
        this.povertyFactorTwoList = povertyFactorTwoList;
    }

    public void setUnresolvePopulationYearOne(int unresolvePopulationYearOne) {
        UnresolvePopulationYearOne = unresolvePopulationYearOne;
    }

    public void setUnresolvePopulationYeartwo(int unresolvePopulationYeartwo) {
        UnresolvePopulationYeartwo = unresolvePopulationYeartwo;
    }

    public int getUnresolvePopulationYearOne() {
        return UnresolvePopulationYearOne;
    }

    public int getUnresolvePopulationYeartwo() {
        return UnresolvePopulationYeartwo;
    }

    public ArrayList getPovertyFactorOneList() {
        return povertyFactorOneList;
    }

    public void setPovertyFactorOneList(ArrayList povertyFactorOneList) {
        this.povertyFactorOneList = povertyFactorOneList;
    }

    public ArrayList getPovertyFactorTwoList() {
        return povertyFactorTwoList;
    }

    public void setPovertyFactorTwoList(ArrayList povertyFactorTwoList) {
        this.povertyFactorTwoList = povertyFactorTwoList;
    }
}
