package zoho;
import java.util.Scanner;
public class SumofEvenNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N: ");
		int N=sc.nextInt();
		int sum = 0;
		for(int i = 2; i<=N; i+=2) {
			sum +=i;
		}
		System.out.println("The sum is: " +sum);
		sc.close();
	}

}
