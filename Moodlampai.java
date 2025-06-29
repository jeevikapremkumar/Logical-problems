package zoho;
import java.util.Scanner;

public class Moodlampai {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  the hour (0 to 23): " );
		int hour = sc.nextInt();
		if(hour >= 5 && hour<=11 ) {
			System.out.println("Yellow");
		}
		else if(hour >= 12 && hour <= 17) {
			System.out.println("Blue");
		}
		else {
			System.out.println("Purple");
		}
		sc.close();
	}
	

}
