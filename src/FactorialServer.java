import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class FactorialServer {

	static int calcFactorial(int no) {
		if (no == 1 || no == 0) {
			return 1;
		}

		return (no * FactorialServer.calcFactorial(no - 1));

	}

	public static void main(String[] args) throws Exception {

		// server
		
		System.out.println("Server started .... ");

		ServerSocket ssoc = new ServerSocket(1111);
		
		Socket soc = ssoc.accept(); // waiting ...
		
		Scanner sc = new Scanner(soc.getInputStream()); // client data received ..
		
		int data = sc.nextInt();
		
		PrintWriter prt = new PrintWriter(soc.getOutputStream(),true);
		
		prt.println(FactorialServer.calcFactorial(data)); // data sent ...
		
		
		

	}

}
