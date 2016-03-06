package AdminModel.ResponseModel;

import java.io.Serializable;

/**
 * Created by Didoy on 2/5/2016.
 */
public class ActiveAccounts implements Serializable{

    private int id;
    private String username;
    private String name;
    private String requestStatus;
    private String status;


    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ActiveAccounts(int id, String username, String name, String requestStatus, String status) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.requestStatus = requestStatus;
        this.status = status;

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
