package lab5DAD;

//import required package for Java networking
import java.io.IOException;
import java.net.InetAddress;

public class InetAddressDemo {

    public static void main(String[] args) {

        try {
            InetAddress[] addresses = InetAddress.getAllByName("ftmk.utem.edu.my");  //get all the address from same hostname

            for (InetAddress address : addresses) {
                if (address.isReachable(5000)) {    //use isReachable method
                    System.out.println("Connected " + address);
                }
                else {
                    System.out.println("Failed " + address);
                }
            }
        }

        // UnknownHostException is direct subchild of IOException
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}


//Output
/*
 * Connected ftmk.utem.edu.my/103.198.52.156
 * Failed ftmk.utem.edu.my/64:ff9b:0:0:0:0:67c6:349c
 */
