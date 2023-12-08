import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        
        double maximum = (num1 > num2) ? num1 : num2;

        System.out.println("The maximum number is: " + maximum);

    }
}