package zoho;

import java.util.Scanner;

public class magicmirrorword {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String word = sc.nextLine();
		if (isPalindrome(word) && word.length() > 3) {
			System.out.println("Mirror Accepts");
		}
		else {
			System.out.println("Mirror Rejects");
		}
		sc.close();
		
		
	}
	public static boolean isPalindrome (String str) {
		int left =0;
		int right = str.length() -1;
		while(left<right) {
			if (str.charAt(left)!= (str.charAt(right))) {
			return false;
		}
		left++;
		right--;
	}
	return true;
	}

}
