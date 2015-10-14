package clientModel;

import java.io.Serializable;

/**
 * Created by Didoy on 10/14/2015.
 */
public class StaffInfo implements Serializable {

    private boolean isValid;
    private String name;
    private String username;
    private String password;
    private String address;
    private String contact;
    private int entries;

    public StaffInfo(boolean isvalid, String name,String username, String password, String address, String contact, int entries){
        this.isValid = isvalid;
        this.name = name;
        this.username = username;
        this.password = password;
        this.address = address;
        this.contact = contact;
        this.entries = entries;
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

