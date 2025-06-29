package zoho;
import java.util.Scanner;
public class Elevatorlogic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of persons: ");
		int n = sc.nextInt();
		int [] weights = new int[n];
		int totalweight = 0;
		System.out.println("Enter the totalweight of person: (in kg)");
		for(int i=0;i<n;i++) {
			weights[i] = sc.nextInt();
			totalweight += weights[i];
		}
		if(totalweight <= 500) {
			System.out.println("Elevator goes up");
		}
		else {
			System.out.println("Overweight");
		}
		sc.close();
	}
	

}
