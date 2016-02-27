package RMI;

import AdminModel.Params;
import AdminModel.RequestAccounts;
import Remote.Method.FamilyModel.Family;
import clientModel.ClientEntries;
import clientModel.StaffInfo;
import clientModel.StaffRegister;
import global.Credentials;
import global.SecretDetails;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Didoy on 8/24/2015.
 */
public interface RemoteMethods extends Remote {

    // use to login admin or encode/client
    public StaffInfo Login(String user, String pass, String ip, int port, String REMOTE_ID) throws RemoteException;

    // check if connected to the database
    public boolean checkDatabase() throws RemoteException, SQLException;

    // register admin or client/encoder
    public boolean register(StaffRegister staffRegister) throws RemoteException;

    //upon registration check if the username is already taken
    public boolean getUsername(String username) throws RemoteException;

    // logout admin or client/encoder
    public void Logout(int accountID, String username) throws RemoteException;

    // addFamily input
    public boolean addFamilyInfo(boolean instantSave, Family family) throws RemoteException;

    // update personal information and account
    public boolean updateStaffInfo(StaffInfo staffInfo, String oldUsername) throws RemoteException;

    // get Searched person
    public ArrayList searchedList(String name) throws RemoteException;

    // get the total pending acount
    public int getPendingAccounts() throws RemoteException;

    // get the list of request/pending accounts
    public ArrayList getRequestAccounts() throws RemoteException;

    // appprove pending/request account
    public boolean Approve(RequestAccounts ra) throws RemoteException;

    // appprove pending/request account as Admin
    public boolean ApproveAdmin(RequestAccounts ra) throws RemoteException;

    // Reject pending/request account
    public boolean Reject(RequestAccounts ra) throws RemoteException;

    // helps to identify if the search or notify was used in the server need to change
    public String getMethodIdentifiers()  throws RemoteException;

    public Credentials getCredentials(String username, String ipAddress) throws RemoteException;

    // Retrieving password
    public SecretDetails getSecurityQuestion(String hint1) throws  RemoteException;

    public boolean UpdateFamilyInformation(Family family) throws  RemoteException;

    public void getClientEntries(int ClientID) throws  RemoteException;


}
