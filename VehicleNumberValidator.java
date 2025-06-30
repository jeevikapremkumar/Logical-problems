package zoho;
import java.util.Scanner;
public class VehicleNumberValidator {
	public  static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the code: ");
		String code = sc.nextLine();
		if (code.matches("[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}"))
			System.out.println("Valid");
		else {
			System.out.println("Invalid");
		}
		sc.close();
			
			
		
	}

}
