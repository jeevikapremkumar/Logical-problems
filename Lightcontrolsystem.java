package zoho;
import java.util.Scanner;
public class Lightcontrolsystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the motion: ");
		System.out.println("Enter the hour: ");
		String motion = sc.next();
		int hour = sc.nextInt();
		if (motion.equalsIgnoreCase("yes") && (hour > 18 || hour < 6)) {
			System.out.println("ON");
		}
		else {
			System.out.println("OFF");
		}
		
		sc.close();
	}

}
