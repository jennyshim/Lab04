import java.util.Scanner;

public class SciCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double calcTotal = 0.0;
        int numOfCalc = 0;
        int menu = 0;
        double current = 0.0;
        System.out.println("Current Result: " + current);
        printMenu();
        System.out.println("Enter Menu Selection: ");
        menu = myScanner.nextInt();
        while (menu != 0) {
            if (menu < 0 || menu > 7) {
                System.out.println("Error: Invalid selection!");
                System.out.println("Enter Menu Selection: ");
                menu = myScanner.nextInt();
            }
            if (menu == 7) {
                if (numOfCalc == 0) {
                    System.out.println("Error: No calculations yet to average!\n");
                    System.out.println("Enter Menu Selection: ");
                    menu = myScanner.nextInt();
                    /*if (menu < 0 || menu > 7) {
                        System.out.println("Error: Invalid selection!");
                        System.out.println("Enter Menu Selection: ");
                        menu = myScanner.nextInt();

                    }*/
                } else {
                    System.out.println("Sum of calculations: " + calcTotal);
                    System.out.println("Number of calculations: " + numOfCalc);
                    System.out.print("Average of calculations: ");
                    System.out.printf("%.2f", (calcTotal / numOfCalc));
                    System.out.println("\n\nEnter Menu Selection: ");
                    menu = myScanner.nextInt();
                    if (menu < 0 || menu > 7) {
                        System.out.println("Error: Invalid selection!\n");
                        System.out.println("Enter Menu Selection: ");
                        menu = myScanner.nextInt();
                    }

                }
            }
            if (menu == 0) {
                break;
            }
            System.out.println("Enter first operand: ");
            double first = myScanner.nextDouble();
            System.out.println("Enter second operand: ");
            double second = myScanner.nextDouble();
            if (menu == 1) {
                current = first + second;
                calcTotal += current;
                numOfCalc++;
            } else if (menu == 2) {
                current = first - second;
                calcTotal += current;
                numOfCalc++;
            } else if (menu == 3) {
                current = first * second;
                calcTotal += current;
                numOfCalc++;
            } else if (menu == 4) {
                current = first / second;
                calcTotal += current;
                numOfCalc++;
            } else if (menu == 5) {
                current = Math.pow(first, second);
                calcTotal += current;
                numOfCalc++;
            } else {
                current = Math.log(second) / Math.log(first);
                calcTotal += current;
                numOfCalc++;
            }
            System.out.println("\nCurrent Result: " + current);
            printMenu();
            System.out.println("Enter Menu Selection: ");
            menu = myScanner.nextInt();
        }
        System.out.println("Thanks for using this calculator. Goodbye!");
    }


    public static void printMenu() {
        System.out.println("\nCalculator Menu");
        System.out.println("---------------");
        System.out.println("0. Exit Program\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exponentiation\n6. Logarithm\n7. Display Average\n");
    }
}