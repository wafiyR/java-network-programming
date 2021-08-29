package dad.nw.lab;


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
		String hostName = "ulearn.utem.edu.my";  //declare variable type string, remove https://
		InetAddress address = InetAddress.getByName(hostName);  //change to hostName
		System.out.println("Hostname: " + address.getHostName());		
		
		}catch(UnknownHostException e) {
			
			System.out.println("Could not find https://ulearn.utem.edu.my");
	}	

		
	}	

}


//Error produced before fix

/*
 *hostName cannot be resolved to a variable
 *InetAddress cannot be resolved to a type
 *InetAddress cannot be resolved   
 *hostname cannot be resolved to a variable		
 */
 