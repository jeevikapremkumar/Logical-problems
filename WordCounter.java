package zoho;
import java.util.Scanner;
public class WordCounter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Word: ");
		String Word = sc.nextLine().trim();
		if(Word.isEmpty()) {
			System.out.println("Thw word count is: 0");
			
		}
		else {
			String [] words = Word.split("\\s+");
			System.out.println("The word count is: "+ words.length);
		}
		sc.close();
		
	}

}
