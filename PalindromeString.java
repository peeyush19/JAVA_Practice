// Program to check if a string is a palindrome or not
// Logic: A string is a palindrome if it reads the same backward as forward. For example, "madam" and "racecar" are palindromes.

import java.util.Scanner;

public class PalindromeString {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Checking if a string is a palindrome:");
    
    String str = sc.nextLine();
    str = str.toLowerCase(); // Convert the string to lowercase for case-insensitive comparison
    String reversedStr = "";

    // Reverse the string
    for (int i = str.length() - 1; i >= 0; i--) {
      reversedStr += str.charAt(i);
    }

    // Check if the original string is equal to the reversed string
    if (str.equals(reversedStr)) {
      System.out.println(str + " is a palindrome.");
    } else {
      System.out.println(str + " is not a palindrome.");
    }
  }
}
