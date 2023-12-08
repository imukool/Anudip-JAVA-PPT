import java.util.Scanner;

class Calculator {
    private double num1;
    private double num2;
    
    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public double add() {
        return num1 + num2;
    }
    
    public double subtract() {
        return num1 - num2;
    }
    
    public double multiply() {
        return num1 * num2;
    }
    
    public double divide() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Not valid");
            return Double.NaN; // Not a Number
        }
    }
}

public class CalculatorMenuWithObjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("Enter two numbers:");
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            
            Calculator calc = new Calculator(num1, num2);
            
            System.out.println("Select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println(calc.add());
                    break;
                case 2:
                    System.out.println(calc.subtract());
                    break;
                case 3:
                    System.out.println(calc.multiply());
                    break;
                case 4:
                    System.out.println(calc.divide());
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            
        } while (choice != 0);
        
        scanner.close();
    }
}
