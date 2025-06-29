package zoho;
import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password: ");
        String password = sc.nextLine();

        boolean isStrong = password.matches(".*[A-Z].*") && 
                           password.matches(".*[a-z].*") &&
                           password.matches(".*[0-9].*") &&
                           password.matches(".*[^a-zA-Z0-9].*");

        System.out.println(isStrong ? "Strong" : "Weak");

        sc.close();
    }
}
