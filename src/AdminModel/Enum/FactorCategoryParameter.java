package AdminModel.Enum;

/**
 * Created by reiner on 3/2/2016.
 */
public enum FactorCategoryParameter {


    UNEMPLOYED {
        public String toString(){
            return "Unemployed";
        }
    },
    NO_OTHER_INCOME {
        public String toString(){
            return "No other Income";
        }
    },
    BELOW_THREASHOLD{
        public String toString(){
            return "Below City Threshold";
        }
    },
    UNDEREMPLOYED{
        public String toString(){
            return "UnderEmployed";
        }
    },
    NO_HOME{
        public String toString(){
            return "No Home";
        }
    }
}
