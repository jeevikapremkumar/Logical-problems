package zoho;
import java.util.Scanner;
public class Humanvsbottypingspeed {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the time (in sec) : ");
		int time = sc.nextInt();
		System.out.println("Enter the number of characters typed : ");
		int chars = sc.nextInt();
		
		double speed = (double) chars/time;
		if (speed >= 4.0) {
			System.out.println("Human Wins");
		}
		else {
			System.out.println("Bot Wins");
		}
		sc.close();
		
		
	}

}
