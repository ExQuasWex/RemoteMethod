package global;

import java.io.Serializable;

/**
 * Created by Didoy on 1/20/2016.
 */


// holds remote ID and Port
public class Credentials implements Serializable {

    private String remoteID;
    private int remotePort;

    public Credentials(String remoteID, int remotePort) {
        this.remoteID = remoteID;
        this.remotePort = remotePort;
    }

    public String getRemoteID() {
        return remoteID;
    }

    public void setRemoteID(String remoteID) {
        this.remoteID = remoteID;
    }

    public int getRemotePort() {
        return remotePort;
    }

    public void setRemotePort(int remotePort) {
        this.remotePort = remotePort;
    }
}
