package zoho;
import java.util.Scanner;
public class SecondLargestFinder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for(int num : arr) {
			if(num > first) {
				second = first;
				first = num;
			}
			else if(num > second && num != first) {
				second = num;
			}
		}
		if(second == Integer.MIN_VALUE)
			System.out.println("No second largest number found");
		else
			System.out.println("Second Largest: " + second);
		
		
		
	}

}
