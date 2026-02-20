import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version : 1.0");
        System.out.println("System initiated successfully\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }
        boolean isPalindromeReverse = input.equals(reversed);
        System.out.println("Reversed string: " + reversed);
        System.out.println("Is it palindrome? (Reverse Method) : " + isPalindromeReverse);
        System.out.println("Is it a palindrome? : " + isPalindrome);
        char[] chars = input.toCharArray();
        boolean isPalindromeCharArray = true;
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindromeCharArray = false;
                break;
            }
            start++;
            end--;
        }
        System.out.println("Is it palindrome? (Char Array Method) : " + isPalindromeCharArray);
        sc.close();
    }
}