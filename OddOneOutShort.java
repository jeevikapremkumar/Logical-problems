package zoho;
import java.util.Scanner;
public class OddOneOutShort {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the words: ");
		String[] words = sc.nextLine().split(" ");
		for (String word : words) {
			String reversed = new StringBuilder(word).reverse().toString();
			if (!word.equals(reversed))
				System.out.println("Odd one Out is : " + word);
		}
		sc.close();
		
	}

}
