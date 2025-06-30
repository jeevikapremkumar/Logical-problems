package zoho;
import java.util.Scanner;

public class CaseToggler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

           
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char)(ch + 32));
            }
            
            else if (ch >= 'a' && ch <= 'z') {
                result.append((char)(ch - 32));
            }
           
            else {
                result.append(ch);
            }
        }

        System.out.println("Toggled: " + result);
        sc.close();
    }
}

