package RMI;

import Remote.Method.FamilyModel.Family;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 * Created by reiner on 11/23/2015.
 */
public interface ClientInterface extends Remote {

    public boolean imAlive() throws RemoteException;
    public void notifyClient(ArrayList familyList) throws RemoteException;
}
