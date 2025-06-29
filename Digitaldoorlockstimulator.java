package zoho;

import java.util.Scanner;

public class Digitaldoorlockstimulator {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int presetcode = 1234;

System.out.println("Enter the number: ");

int enterednumber = sc.nextInt();

int reversed = reversenumber(enterednumber);

if(reversed == presetcode) {

System.out.println("unlocked");

}

else {

System.out.println("Access denied");

}

sc.close();

}

public static int reversenumber (int num) {

int reversed = 0;

while (num!=0) {

int digit = num % 10;

reversed = reversed * 10 + digit;

num/=10;

}

return reversed;

}




}
