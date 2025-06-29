package zoho;
import java.util.Scanner;

public class AlienLanguageTranslator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sentence: ");
        String sentence = sc.nextLine();
        String translated = "";

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            switch (ch) {
                case 'a': case 'A': translated += '@'; break;
                case 'e': case 'E': translated += '#'; break;
                case 'i': case 'I': translated += '!'; break;
                case 'o': case 'O': translated += '$'; break;
                case 'u': case 'U': translated += '%'; break;
                default: translated += ch; break;
            }
        }

        System.out.println("Translated sentence: " + translated);
        sc.close();
    }
}


