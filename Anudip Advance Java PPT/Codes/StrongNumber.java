import java.util.Scanner;

public class StrongNumber {
    // Function to calculate factorial of a number
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Function to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        return sum == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a number: ");
        int userInput = scanner.nextInt();

        // Check if the number is a strong number
        boolean isStrong = isStrongNumber(userInput);

        // Display the result
        if (isStrong) {
            System.out.println(userInput + " is a Strong number.");
        } else {
            System.out.println(userInput + " is not a Strong number.");
        }

        scanner.close();
    }
}
