package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by reiner on 11/23/2015.
 */
public interface ClientInterface extends Remote {

    public boolean imAlive() throws RemoteException;
}
