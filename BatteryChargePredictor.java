package zoho;
import java.util.Scanner;
public class BatteryChargePredictor {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the current battery percentage: ");
		int current = sc.nextInt();
		System.out.println("Enter the charging speed (in percentage) : ");
		int speed = sc.nextInt();
		int remaining = 100 - current;
		int minutes = (int)Math.ceil((double)remaining/speed);
		System.out.println("Minutes needed : " + minutes);
		sc.close();
	}
	

}
