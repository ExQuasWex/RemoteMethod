package clientModel;

import java.io.Serializable;

/**
 * Created by Didoy on 10/14/2015.
 */
public class StaffInfo implements Serializable {

    private boolean isAccountExist;
    private int accountID;
    private String status;
    private String name;
    private String username;
    private String password;
    private String address;
    private String contact;
    private String role;
    private int entries;

    /*
    Status represents if the account is already online in other terminal

     */

    public StaffInfo(boolean isAccountExist,int accountID, String status,String role, String name,String username, String password, String address, String contact, int entries){
        this.isAccountExist = isAccountExist;
        this.accountID = accountID;
        this.status = status;
        this.name = name;
        this.username = username;
        this.password = password;
        this.address = address;
        this.contact = contact;
        this.entries = entries;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

    public boolean isAccountExist() {
        return isAccountExist;
    }

    public void setAccountExist(boolean isRegistered) {
        this.isAccountExist = isRegistered;
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

