import java.util.Scanner;

public class LargestPalindromeInStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = sc.nextLine();
        String largestPalindrome = "";
        
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String sub = input.substring(i, j);
                if (isPalindrome(sub) && sub.length() > largestPalindrome.length()) {
                    largestPalindrome = sub;
                }
            }
        }
        
        System.out.println("Largest Palindrome Substring: " + largestPalindrome);
    }

    public static boolean isPalindrome(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}