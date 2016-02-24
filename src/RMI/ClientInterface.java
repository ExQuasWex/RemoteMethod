package RMI;

import Remote.Method.FamilyModel.Family;
import clientModel.ClientEntries;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 * Created by reiner on 11/23/2015.
 */
public interface ClientInterface extends Remote {

    public boolean imAlive() throws RemoteException;
    public void notifyClient(ArrayList familyList) throws RemoteException;
    public void setClientEntriesMaxSize(int size) throws RemoteException;
    public void addClientEntry(ClientEntries clientEntries) throws RemoteException;



}
