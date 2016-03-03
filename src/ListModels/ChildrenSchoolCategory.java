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
    SCHOOL{
        public String toString(){
            return "School";
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
