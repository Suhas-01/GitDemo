package java_revision;

import java.util.Scanner;

public class a01_Palindrome_string_reversal {
	public static void main(String args[]) {
		String original, reverse = ""; // Objects of String class
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string/number to check if it is a palindrome");
		original = in.nextLine();
		System.out.println("character at 2nd place is = "+original.charAt(2));
		int length = original.length();
		for (int i = length - 1; i >= 0; i--)
			//System.out.println(reverse);
			reverse = reverse + original.charAt(i);
			System.out.println(reverse);
		if (original.equals(reverse))
			System.out.println("Entered string/number is a palindrome.");
		else
			System.out.println("Entered string/number isn't a palindrome.");
	}

}
