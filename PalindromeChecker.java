package zoho;
import java.util.Scanner;
public class PalindromeChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input: ");
		String input = sc.nextLine();
		String cleaned = input.replaceAll("\\s","").toLowerCase();
		String reversed = new StringBuilder(cleaned).reverse().toString();
		if(cleaned.equals(reversed)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Pallindrome");
		}
		
		sc.close();
		
	}

}
