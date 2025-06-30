package zoho;
import java.util.Scanner;
public class FixbugStringComparisonerror {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("userInput: ");
		String userInput = sc.nextLine();
		if(userInput.equalsIgnoreCase("yes")) {
			System.out.println("Confirmed");
		}
		else {
			System.out.println("Not Confirmed");
		}
		sc.close();
		
		
	}

}
/*
Scanner sc = new Scanner(System.in);
String userInput = sc.nextLine();

if (userInput == "yes") {       // ❌ Wrong way to compare strings
    System.out.println("Confirmed");
}
*/