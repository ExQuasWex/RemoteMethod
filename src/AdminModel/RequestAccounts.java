package AdminModel;

import java.io.Serializable;

/**
 * Created by Didoy on 12/31/2015.
 */
public class RequestAccounts implements Serializable{

    private String name;
    private int id;

    public RequestAccounts(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
