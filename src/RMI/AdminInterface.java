package RMI;

import AdminModel.Params;
import AdminModel.Report.Parent.ResponseCompareOverview;
import AdminModel.Report.Parent.ResponseOverviewReport;
import AdminModel.Report.Parent.ResponseSpecific;
import AdminModel.Report.Parent.ResponseSpecificOverView;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 * Created by Didoy on 11/25/2015.
 */
public interface AdminInterface extends Remote {
    public ArrayList getBarangayData() throws RemoteException;
    public boolean checkConnectDB()throws RemoteException;

    // ================= admin report methods  ======================== //
    public ResponseOverviewReport getOverViewData(Params params, String type) throws RemoteException;

    public ResponseCompareOverview getCompareOverViewData(Params params, String type) throws RemoteException;

    public ResponseCompareOverview getCompareSpecificData(Params params, String type) throws RemoteException;

    public ResponseSpecificOverView getSpecificOverViewData(Params params, String type) throws RemoteException;

    public ResponseSpecific getSpecific(Params params, String type) throws RemoteException;

    public ArrayList getYears() throws RemoteException;

    public ArrayList getFamilyBarangay(Params params) throws  RemoteException;

    public ArrayList getActiveAccounts( ) throws  RemoteException;


}
