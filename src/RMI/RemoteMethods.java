package RMI;

import AdminModel.RequestAccounts;
import Family.Family;
import clientModel.StaffInfo;
import clientModel.StaffRegister;
import javafx.collections.ObservableList;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Didoy on 8/24/2015.
 */
public interface RemoteMethods extends Remote {

    public StaffInfo Login(String user, String pass, String ip, int port, String REMOTE_ID) throws RemoteException;
    public boolean checkDatabase() throws  RemoteException, SQLException;
    public boolean register(StaffRegister staffRegister) throws  RemoteException;
    public boolean getUsername(String username) throws  RemoteException;
    public void Logout(int accountID, String username) throws  RemoteException;
    public boolean addFamilyInfo(Family family) throws RemoteException;
    public boolean  updateStaffInfo(StaffInfo staffInfo, String oldUsername) throws RemoteException;
    public ArrayList searchedList(String name) throws RemoteException;
    public int getPendingAccounts() throws RemoteException;
    public ArrayList getRequestAccounts() throws RemoteException;
    public boolean Approve(RequestAccounts ra) throws RemoteException;
    public boolean ApproveAdmin(RequestAccounts ra) throws RemoteException;
    public boolean Reject(RequestAccounts ra) throws RemoteException;


}
