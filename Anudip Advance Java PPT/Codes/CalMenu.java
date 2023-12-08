import java.util.Scanner;

public class CalMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("Enter two numbers:");
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            
            System.out.println("Select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Difference");
            System.out.println("3. Product");
            System.out.println("4. Division");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println(num1 + num2);
                    break;
                case 2:
                    System.out.println(num1 - num2);
                    break;
                case 3:
                    System.out.println(num1 * num2);
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println(num1 / num2);
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
            
        } while (choice != 0);
        
        scanner.close();
    }
}
