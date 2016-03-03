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
    ILLEGAL_SETTLERS{
        public String toString(){
            return "Illegal Settlers";
        }
    }
}
