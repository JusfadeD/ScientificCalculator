import java.util.Scanner;
import java.util.InputMismatchException;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean looping = true;
        while(looping){
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
                case 1:
                    performaddition(sc);
                    break;
                case 0:
                    System.out.println("Goodbye! ");
                    looping = false;
                    break;
                case 2:
                    performsubtraction(sc);
                    break;
                case 3:
                    performMultiplication(sc);
                    break;
                default:
                    System.out.println("Invalid input, Please enter an integer");
            }
        }
        sc.close();
    }
    public static void displaymenu(){
        System.out.println("\n=== Scientific Calculator ===");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("0. Exit");
        System.out.println("============");
    }
    public static void performaddition(Scanner sc){
        try{
            System.out.println("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.println("Enter second number: ");
            double num2 = sc.nextDouble();
            double result = num1 + num2;
            System.out.println("The result is: " + result);
        } catch (InputMismatchException e){
            System.out.println("Invalid input, Please enter an integer");
            sc.nextLine();
        }
    }
    public static void performsubtraction(Scanner sc){
        try{
            System.out.println("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.println("Enter second number: ");
            double num2 = sc.nextDouble();
            double result = num1 - num2;
            System.out.println("The result is: " + result);
        } catch (InputMismatchException e){
            System.out.println("Invalid input, Please enter an integer");
            sc.nextLine();
        }
    }
    public static void performMultiplication(Scanner sc){
        try{
            System.out.println("Enter first number: ");
            double num1 = sc.nextDouble();
            System.out.println("Enter second number: ");
            double num2 = sc.nextDouble();
            double result = num1 * num2;
            System.out.println("The result is: " + result);
        } catch (InputMismatchException e){
            System.out.println("Invalid input, Please enter an integer");
            sc.nextLine();
        }
    }
}
