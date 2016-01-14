package RMI;

import AdminModel.BarangayData;
import AdminModel.OverViewReportObject;
import AdminModel.Params;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Didoy on 11/25/2015.
 */
public interface AdminInterface extends Remote {
    public ArrayList getBarangayData() throws RemoteException;
    public boolean checkConnectDB()throws RemoteException;

    // ================= admin report methods  ======================== //
    public OverViewReportObject getOverViewData(Params params, String type) throws RemoteException;

    public ArrayList getCompareOverViewData(Params params, String type) throws RemoteException;

    public ArrayList getCompareSpecificData(Params params, String type) throws RemoteException;

    public ArrayList getSpecificOverViewData(Params params, String type) throws RemoteException;

    public ArrayList getSpecific(Params params, String type) throws RemoteException;


}
