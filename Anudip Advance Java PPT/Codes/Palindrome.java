public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        int length = str.length();
        String reversed = "";

        for (int i = length - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        if (str.equals(reversed)) {
            System.out.println("The string '" + str + "' is a palindrome.");
        } else {
            System.out.println("The string '" + str + "' is not a palindrome.");
        }
    }
}
