package zoho;
import java.util.Scanner;
public class fixbugloopcondition {
	public static void main(String[] args) {
		int sum = 0;
		for (int i=0; i<=5; i++ ) {
		sum += i;
		}
		System.out.println(sum);
		
	}

}
/*int sum = 0;

for (int i = 1; i < 5; i++) {
    sum += i;
}

System.out.println(sum); 
*/