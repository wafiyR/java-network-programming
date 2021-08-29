package dad.nw.lab;


/**
 * This exercise is to demonstrate the skill to debug the error produced
 * from this program.
 * 
 * @author emalianakasmuri
 *
 */
public class InetAddressDemo {
	
	/**
	 * Main entrance to any Java program
	 * @param args
	 */
	public static void main(String[] args) {
		
		hostName = "https://ulearn.utem.edu.my";
		InetAddress address = InetAddress.getByName(hostname);
		System.out.println("Hostname: " + address.getHostName());

	}

}
