package RMI;

import AdminModel.BarangayData;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 * Created by Didoy on 11/25/2015.
 */
public interface AdminInterface extends Remote {
    public ArrayList getBarangayData() throws RemoteException;

}
