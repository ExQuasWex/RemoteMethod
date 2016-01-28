package AdminModel.Report.Children.Model;

import java.io.Serializable;

/**
 * Created by Didoy on 11/25/2015.
 */
public class ResponsePovertyRate implements Serializable {

    String barangayName;
    int UnresolvePopulation;

    public ResponsePovertyRate(String barangayName, int UnresolvePopulation) {
        this.barangayName = barangayName;
        this.UnresolvePopulation = UnresolvePopulation;
    }

    public String getBarangayName() {
        return barangayName;
    }

    public void setBarangayName(String barangayName) {
        this.barangayName = barangayName;
    }

    public int getUnresolvePopulation() {
        return UnresolvePopulation;
    }

    public void setUnresolvePopulation(int unresolvePopulation) {
        UnresolvePopulation = unresolvePopulation;
    }
}
