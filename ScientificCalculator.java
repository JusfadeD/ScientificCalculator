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
                case 8:
                    performcosine(sc);
                    break;
                case 9:
                    performtangent(sc);
                    break;
                case 10:
                    performnaturallog(sc);
                    break;
                case 11:
                    performlog10(sc);
                    break;
                case 12:
                    performabsolute(sc);
                    break;
                case 13:
                    performround(sc);
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
        System.out.println("8. cosine (cosine x in degrees)");
        System.out.println("9. Tangent (tan x in degrees)");
        System.out.println("10. Natural Logarithm (ln x)");
        System.out.println("11. Logarithm Base 10 (log₁₀ x)");
        System.out.println("12. Absolute Value (|x|)");
        System.out.println("13. Round to Nearest Integer");




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
        }}
    public static void performcosine (Scanner sc){
        try{
            System.out.println("Enter angle in degrees: ");
            double degrees = sc.nextDouble();
            double radians = Math.toRadians(degrees);
            double result = Math.cos(radians);
            System.out.println("The result is: " + result);}
            catch (InputMismatchException e) {
                System.out.println("Invalid input, Please enter a number.");
                sc.nextLine();
            }

        }
    public static void performtangent(Scanner sc){
        try {
            System.out.println("Enter angle in degrees: ");
            double degrees = sc.nextDouble();

            // Check for undefined tangent angles (odd multiples of 90°)
            if ((degrees % 180 == 90) || (degrees % 180 == -90)) {
                System.out.println("Error: Tangent is undefined at " + degrees + "°.");
            } else {
                double radians = Math.toRadians(degrees);
                double result = Math.tan(radians);
                System.out.println("The result is: " + result);
            }
        } catch (InputMismatchException e){
            System.out.println("Invalid input, Please enter a number.");
            sc.nextLine();
        }
    }
    public static void performnaturallog(Scanner sc){
        try {
            System.out.println("Enter a positive number: ");
            double num = sc.nextDouble();

            if (num <= 0) {
                System.out.println("Error: Natural log is undefined for zero or negative numbers.");
            } else {
                double result = Math.log(num);
                System.out.println("The result is: " + result);
            }
        } catch (InputMismatchException e){
            System.out.println("Invalid input, Please enter a number.");
            sc.nextLine();
        }
    }
    public static void performlog10(Scanner sc){
        try {
            System.out.println("Enter a positive number: ");
            double num = sc.nextDouble();

            if (num <= 0) {
                System.out.println("Error: Base-10 log is undefined for zero or negative numbers.");
            } else {
                double result = Math.log10(num);
                System.out.println("The result is: " + result);
            }
        } catch (InputMismatchException e){
            System.out.println("Invalid input, Please enter a number.");
            sc.nextLine();
        }
    }
    public static void performabsolute(Scanner sc){
        try {
            System.out.println("Enter a number: ");
            double num = sc.nextDouble();
            double result = Math.abs(num);
            System.out.println("The result is: " + result);
        } catch (InputMismatchException e){
            System.out.println("Invalid input, Please enter a number.");
            sc.nextLine();
        }
    }
    public static void performround(Scanner sc){
        try {
            System.out.println("Enter a number: ");
            double num = sc.nextDouble();
            long result = Math.round(num);
            System.out.println("The result is: " + result);
        } catch (InputMismatchException e){
            System.out.println("Invalid input, Please enter a number.");
            sc.nextLine();
        }
    }


}

