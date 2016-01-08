package global;

/**
 * Created by Didoy on 11/17/2015.
 */
public class OnlineClient {

    private String username;
    private String Ipaddress;
    private  int port;
    private String REMOTE_ID;



    public OnlineClient(String User, String IpAddress, int port, String REMOTE_ID){
        this.username = User;
        this.Ipaddress = IpAddress;
        this.port = port;
        this.REMOTE_ID = REMOTE_ID;

    }

    public String getREMOTE_ID() {
        return REMOTE_ID;
    }

    public void setREMOTE_ID(String REMOTE_ID) {
        this.REMOTE_ID = REMOTE_ID;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIpaddress() {
        return Ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        Ipaddress = ipaddress;
    }
}
