package zoho;
import java.util.Scanner;
public class CurrencyNoteChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values: ");
		int  values = sc.nextInt();
		if(values == 10 || values == 20 || values == 50 || values == 100 || values == 200 || values == 500 || values == 2000) {
			System.out.println("Accepted");
		}
		else {
			System.out.println("Not Accepted");
		}
		sc.close();
	
	}

}
