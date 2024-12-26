import java.util.Scanner;

public class LongestSubstring {
    String solution(String str) {
        String substr = ""; // Current substring being checked
        String large = "";  // Longest substring found so far

        for (int i = 0; i < str.length(); i++) {
            substr = ""; // Reset substr for each starting position
            for (int j = i; j < str.length(); j++) {
                char c = str.charAt(j);

                // If the character is already in the substring, break the loop
                if (substr.indexOf(c) != -1) {
                    break;
                }

                // Add character to the current substring
                substr += c;

                // Update the longest substring if necessary
                if (substr.length() > large.length()) {
                    large = substr;
                }
            }
        }
        return large;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = sc.nextLine();
        LongestSubstring s1 = new LongestSubstring();
        System.out.println("Longest Substring Without Repeating Characters: " + s1.solution(input));
    }
}
