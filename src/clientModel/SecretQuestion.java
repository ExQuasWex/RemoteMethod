package clientModel;

/**
 * Created by Didoy on 9/23/2015.
 */
public enum SecretQuestion {

    PET{
        public String toString(){
            return "What is the name of your first Pet?";
        }
    },

    TVSHOW{
        public String toString(){
            return "What is your Favorite TV show?";
        }
    },
    BOOK{
        public String toString(){
            return "What is your Favorite Book?";
        }
    }
}
