package zoho;
import java.util.Scanner;
public class NoiseLevelMonitor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the noise values : ");
		String[] noise = sc.nextLine().split(" ");
		int sum =0;
		for (String s : noise) {
		sum += Integer.parseInt(s);
		}
		double average = (double) sum / noise.length;
		if(average > 80) {
			System.out.println("Too Loud");
		}
		else {
			System.out.println("Safe");
		}
		sc.close();
		
		
		
		
	}

}
