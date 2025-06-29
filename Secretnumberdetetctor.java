package zoho;
import java.util.Scanner;

public class Secretnumberdetetctor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int number = sc.nextInt();

        int sum = 0;
        int temp = number;

        
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        
        int lastDigit = number % 10;

        
        if (sum % 3 == 0 && lastDigit % 2 == 0) {
            System.out.println("Suspicious");
        } else {
            System.out.println("Safe");
        }

        sc.close();
    }
}
