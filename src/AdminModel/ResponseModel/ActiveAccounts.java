package AdminModel.ResponseModel;

import java.io.Serializable;

/**
 * Created by Didoy on 2/5/2016.
 */
public class ActiveAccounts implements Serializable{

    private int id;
    private String username;
    private String name;


    public ActiveAccounts(int id, String username, String name) {
        this.id = id;
        this.username = username;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
