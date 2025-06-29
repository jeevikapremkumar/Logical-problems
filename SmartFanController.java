package zoho;
import java.util.Scanner;
public class SmartFanController {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the spped: ");
		int speed = sc.nextInt();
		if(speed <= 25) {
			System.out.println("Off");
		}
		else if(speed <=30) {
			System.out.println("Low");
		}
		else if(speed <= 35) {
			System.out.println("Medium");
		}
		else {
			System.out.println("High");
		}
		sc.close();
	}

}
