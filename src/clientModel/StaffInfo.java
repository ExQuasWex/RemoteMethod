package clientModel;

import java.io.Serializable;

/**
 * Created by Didoy on 10/14/2015.
 */
public class StaffInfo implements Serializable {

    private boolean isValid;
    private int accountID;
    private String status;
    private String name;
    private String username;
    private String password;
    private String address;
    private String contact;
    private int entries;

    public StaffInfo(boolean isvalid,int accountID, String status, String name,String username, String password, String address, String contact, int entries){
        this.isValid = isvalid;
        this.accountID = accountID;
        this.status = status;
        this.name = name;
        this.username = username;
        this.password = password;
        this.address = address;
        this.contact = contact;
        this.entries = entries;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean isRegistered) {
        this.isValid = isRegistered;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getEntries() {
        return entries;
    }

    public void setEntries(int entries) {
        this.entries = entries;
    }
}

