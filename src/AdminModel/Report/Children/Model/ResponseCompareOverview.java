package AdminModel.Report.Children.Model;

import java.io.Serializable;

/**
 * Created by Didoy on 1/26/2016.
 */
public class ResponseCompareOverview implements Serializable{

    private int UnresolvePopulationYearOne;
    private int UnresolvePopulationYeartwo;

    public ResponseCompareOverview(int unresolvePopulationYearOne, int unresolvePopulationYeartwo) {
        UnresolvePopulationYearOne = unresolvePopulationYearOne;
        UnresolvePopulationYeartwo = unresolvePopulationYeartwo;
    }

    public int getUnresolvePopulationYearOne() {
        return UnresolvePopulationYearOne;
    }

    public int getUnresolvePopulationYeartwo() {
        return UnresolvePopulationYeartwo;
    }
}
