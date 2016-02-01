package global;

import java.io.Serializable;

/**
 * Created by Didoy on 2/1/2016.
 */
public class SecretDetails implements Serializable{

    int SecretID = 0;
    String secretAnswer = "";
    String password;

    public SecretDetails(int secretID, String secretAnswer, String password) {
        SecretID = secretID;
        this.secretAnswer = secretAnswer;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSecretID() {
        return SecretID;
    }

    public void setSecretID(int secretID) {
        SecretID = secretID;
    }

    public String getSecretAnswer() {
        return secretAnswer;
    }

    public void setSecretAnswer(String secretAnswer) {
        this.secretAnswer = secretAnswer;
    }
}
