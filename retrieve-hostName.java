//import the required package for Java networking
import java.net.InetAddress;
import java.net.UnknownHostException;


public class InetAddressDemo {
	
	/**
	 * Main entrance to any Java program
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {	//need to implement in try and catch
			InetAddress address = InetAddress.getByName("ftmk.utem.edu.my");  //remove http://
			System.out.println("Hostname: " + address.getHostName());
			System.out.println("Address: " + address.getHostAddress());
		
		
		}catch(UnknownHostException e) {
			
			System.out.println("Could not find  http://ftmk.utem.edu.my");
		
		}
		



	}	

}