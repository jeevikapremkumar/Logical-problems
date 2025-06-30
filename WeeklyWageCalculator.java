package zoho;
import java.util.Scanner;
public class WeeklyWageCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the working days: ");
		int days = sc.nextInt();
		int[] hours = new int[days];
		int totalHours = 0;
		System.out.println("Enter hours worked each day: ");
		for(int i=0;i<days;i++) {
		hours[i] = sc.nextInt();
		totalHours += hours[i];
		
	}
		System.out.println("Enter the hourly rate: ");
		int rate  = sc.nextInt();
		
		int totalwage = rate* totalHours;
		System.out.println("Total Wage : " + totalwage);
		sc.close();
	}
	
	

}
