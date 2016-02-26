package AdminModel.Report.Children.Model;

import java.io.Serializable;

/**
 * Created by Didoy on 2/26/2016.
 */
public class ResponseMonthlyPovertyRate implements Serializable {

    String month;
    int population = 0;

    public ResponseMonthlyPovertyRate(String month, int population) {
        this.month = month;
        this.population = population;
    }

    public String getMonth() {
        return month;
    }

    public int getPopulation() {
        return population;
    }
}
