package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Didoy on 8/24/2015.
 */
public interface RemoteMethods extends Remote {

    public boolean Login(String user, String pass)throws RemoteException;
    public boolean checkDatabase() throws  RemoteException;
}
