package zoho;
import java.util.Scanner;
public class Agegroupclassifier {
	public  static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the age: ");
	int age = sc.nextInt();
	if (age < 13) {
		System.out.println("child");
	}
	else if (age >= 13 && age <= 19) {
		System.out.println("Teen");
	}
	else if (age >=20 && age<= 59 ) {
		System.out.println("Adult");
	}
	else {
		System.out.println("Senior");
	}
	sc.close();
	}
	


}
