package RMI;

import clientModel.family;
import clientModel.StaffInfo;
import clientModel.StaffRegister;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;

/**
 * Created by Didoy on 8/24/2015.
 */
public interface RemoteMethods extends Remote {

    public StaffInfo Login(String user, String pass)throws RemoteException;
    public boolean checkDatabase() throws  RemoteException, SQLException;
    public boolean getAdminKeyCode(String keycode) throws  RemoteException;
    public boolean register(StaffRegister staffRegister) throws  RemoteException;
    public boolean getUsername(String username) throws  RemoteException;
    public void Logout(int accountID) throws  RemoteException;
    public boolean addFamilyInfo(family family) throws RemoteException;

}
