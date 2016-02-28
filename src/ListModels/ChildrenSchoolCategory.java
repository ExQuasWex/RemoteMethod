package ListModels;

/**
 * Created by reiner on 2/28/2016.
 */
public enum ChildrenSchoolCategory {

    GRADUATED{
        public String toString(){
            return "Graduated";
        }
    },
    VOCATIONAL{
        public String toString(){
            return "Vocational";
        }
    },
    INSCHOOL{
        public String toString(){
            return "In-School";
        }
    },
    SOME{
        public String toString(){
            return "Some";
        }
    },
    NONE {
        public String toString() {
            return "None";
        }
    }
}
