public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";   // Hardcoded string
        String reverse = "";

        // Reverse the string
        for(int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        // Check palindrome
        if(word.equals(reverse)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}