package zoho;
import java.util.Scanner;
public class Fixbuginfiniteloopissue {
	public static void main(String[] args) {
		int i = 0;
		while( i < 5) {
			System.out.println(i);
			i++;
		}
	}

}
/*
int i = 0;
while (i < 5) {
    System.out.println(i);
    // i++;  ← missing
}
*/