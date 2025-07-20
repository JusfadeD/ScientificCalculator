import java.util.Scanner;
import java.util.InputMismatchException;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean looping = true;
        while (looping) {
            displaymenu();
            System.out.print("Enter your choice: ");
            int choice;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, Please enter an integer");
                sc.nextLine();
                continue;
            }
            switch (choice) {
                case 0:
                    System.out.println("Goodbye! ");
                    looping = false;
                    break;
                case 1:
                    performaddition(sc);
                    break;

                case 2:
                    performsubtraction(sc);
                    break;
                case 3:
                    performMultiplication(sc);
                    break;
                case 4:
                    performDivision(sc);
                    break;
                case 5:
                    performsquareroot(sc);
                    break;
                case 6:
                    performpower(sc);
                    break;
                case 7:
                    performsine(sc);
                    break;
                default:
                    System.out.println("Invalid input, Please enter an integer");
            }
        }
        sc.close();
    }

    public static void displaymenu() {
        System.out.println("\n=== Scientific Calculator ===");
        System.out.println("0. Exit");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Sqaure root");
        System.out.println("6. Power (x^y)");
        System.out.println("7. Sine (sin x in degrees)");
        System.out.println("============");
    }

    public static void performaddition(Scanner sc) {
        try {
            System.out.println("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.println("Enter second number: ");
            double num2 = sc.nextDouble();
            double result = num1 + num2;
            System.out.println("The result is: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input, Please enter an integer");
            sc.nextLine();
        }
    }

    public static void performsubtraction(Scanner sc) {
        try {
            System.out.println("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.println("Enter second number: ");
            double num2 = sc.nextDouble();
            double result = num1 - num2;
            System.out.println("The result is: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input, Please enter an integer");
            sc.nextLine();
        }
    }

    public static void performMultiplication(Scanner sc) {
        try {
            System.out.println("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.println("Enter second number: ");
            double num2 = sc.nextDouble();
            double result = num1 * num2;
            System.out.println("The result is: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input, Please enter an integer");
            sc.nextLine();
        }
    }

    public static void performDivision(Scanner sc) {
        try {
            System.out.println("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.println("Enter second number: ");
            double num2 = sc.nextDouble();
            double result = num1 / num2;
            System.out.println("The result is: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input, Please enter an integer");
            sc.nextLine();
        }
    }
    public static void performsquareroot(Scanner sc){
        try {
            System.out.println("Enter a number: ");
            double num1 = sc.nextDouble();
            if (num1 < 0){
                System.out.println("Error: You can not choose 0");
            }
            else{
                double result = Math.sqrt(num1);
                System.out.println("The result is: " + result);
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input, Please enter a number ");
            sc.nextLine();
        }
    }
    public static void performpower(Scanner sc){
        try{
            System.out.println("Enter the base number: ");
            double base = sc.nextDouble();
            System.out.println("Enter the exponent");
            double exponent = sc.nextDouble();
            double result = Math.pow(base, exponent);
            System.out.println("The result is "+ result);
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input, Please enter a number.");
            sc.nextLine();
        }
    }
    public static void performsine(Scanner sc){
        try{
            System.out.println("Enter angle in degrees: ");
            double degrees = sc.nextDouble();
            double radians = Math.toRadians(degrees);
            double result = Math.sin(radians);
            System.out.println("The result is: " + result);
        } catch (InputMismatchException e){
            System.out.println("Invalid input, Please enter a number.");
            sc.nextLine();
        }
    }
}
