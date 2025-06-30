package zoho;
import java.util.Scanner;
public class Roomtemperatureadjustor {
	public  static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter current room temper: ");
		int current = sc.nextInt();
		if (current < 20) {
			System.out.println("Decrease temper");
		}
		else if (current > 28) {
			System.out.println("Increase temper");
		}
		else {
			System.out.println("Perfect");
		}
		sc.close();
		
	}

}
