package AdminModel.Report.Parent;

import AdminModel.Report.Children.Model.ResponsePovertyFactor;

import java.io.Serializable;

/**
 * Created by Didoy on 2/26/2016.
 */
public class ResponseSpecific implements Serializable{


    private int barangayPovertyPopulation;
    private ResponsePovertyFactor povertyFactor;

    public ResponseSpecific(int barangayPovertyPopulation, ResponsePovertyFactor povertyFactor) {
        this.barangayPovertyPopulation = barangayPovertyPopulation;
        this.povertyFactor = povertyFactor;
    }

    public int getBarangayPovertyPopulation() {
        return barangayPovertyPopulation;
    }

    public ResponsePovertyFactor getPovertyFactor() {
        return povertyFactor;
    }
}
