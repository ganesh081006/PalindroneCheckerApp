public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";   // Hardcoded string
        String reversed = "";

        // Reverse the string using a for loop
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Compare original and reversed string
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}