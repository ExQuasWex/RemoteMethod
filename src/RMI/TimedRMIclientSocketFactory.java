package RMI;

import global.OnlineClient;

import java.io.IOException;
import java.io.Serializable;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.rmi.server.RMIClientSocketFactory;
import java.util.Iterator;

/**
 * Created by reiner on 11/15/2015.
 */
public class TimedRMIclientSocketFactory implements RMIClientSocketFactory,Serializable {

    private int clientTimeout;
    private Iterator ite;

    public TimedRMIclientSocketFactory(int clientTimeout){
        this.clientTimeout = clientTimeout;
    }

@Override
    public Socket createSocket(String host, int port) throws IOException {
        Socket socket = new Socket();
            socket.connect(new InetSocketAddress(host,port),clientTimeout );
     return socket;
    }


}
