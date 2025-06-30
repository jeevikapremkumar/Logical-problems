package zoho;
import java.util.Scanner;
public class CountNumbers {
	public static void main(String[]  args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int positive =0, negative =0, zero = 0;
		for(int num : arr) {
			if(num > 0) {
				positive++;
			}
			else if(num < 0) {
				negative++;
			}
			else {
				zero++;
			}
			System.out.println("positive: "+ positive);
			System.out.println("negative: "+ negative);
			System.out.println("zero: "+zero);
		}
		sc.close();
		
		
	}

}
