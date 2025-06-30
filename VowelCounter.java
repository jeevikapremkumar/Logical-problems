package zoho;
import java.util.Scanner;
public class VowelCounter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String word = sc.nextLine().toLowerCase();
		int count = 0;
		for(char ch : word.toCharArray()) {
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
			
			
		}
		System.out.println("The count is: " + count);
		sc.close();
		
	}

}
