package global;

/**
 * Created by Didoy on 11/17/2015.
 */
public class OnlineClient {

    private String username;
    private String Ipaddress;

    public OnlineClient(String User, String IpAddress){
        this.username = User;
        this.Ipaddress = IpAddress;
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
