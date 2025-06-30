package zoho;
import java.util.Scanner;
public class ReverseWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence: ");
		String Sentence = sc.nextLine();
		String[] words = Sentence.split(" ");
		for(int i = words.length-1; i>=0; i--) {
		System.out.print(words[i] + " ");
		}
		sc.close();
		
	}

}
