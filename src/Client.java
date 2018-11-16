import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("Client !! ");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to calculate the factoral .. : ");
		
		int number  = sc.nextInt();
		
		Socket soc = new Socket("localhost", 1111);
		
		PrintWriter prt = new PrintWriter(soc.getOutputStream(),true);
		
		prt.println(number); // sent ..
		
		Scanner servSc = new Scanner(soc.getInputStream()); // received ..
		
		int result = servSc.nextInt();
		
		System.out.println("The factorial is "+result);
		
		
		
		
		
		
		
		
		
	}

}
