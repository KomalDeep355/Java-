import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) { // Infinite loop to let users choose multiple operations
            System.out.println("\nChoose an option:");
            System.out.println("1. Even or Odd");
            System.out.println("2. Greetings");
            System.out.println("3. Simple Interest");
            System.out.println("4. Calculator");
            System.out.println("5. Largest of Two Numbers");
            System.out.println("6. Fibonacci Series");
            System.out.println("7. Check Palindrome");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    even_odd(input);
                    break;
                case 2:
                    greetings(input);
                    break;
                case 3:
                    simpleinterest(input);
                    break;
                case 4:
                    System.out.println("Enter first number:");
                    int num1 = input.nextInt();
                    System.out.println("Enter second number:");
                    int num2 = input.nextInt();
                    calculator(num1, num2, input);
                    break;
                case 5:
                    System.out.println("Enter first number:");
                    int a = input.nextInt();
                    System.out.println("Enter second number:");
                    int b = input.nextInt();
                    largestoftwonumbers(a, b);
                    break;
                case 6:
                    fibinaacoseries(input);
                    break;
                case 7:
                    System.out.println("Enter a word to check for palindrome:");
                    String word = input.next();
                    palindrome(word);
                    break;
                case 8:
                    System.out.println("Exiting the program.");
                    input.close();
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice. Please enter a number between 1-8.");
            }
        }
    }

    static void even_odd(Scanner input) {
        System.out.println("Enter number:");
        int num = input.nextInt();
        System.out.println((num % 2 == 0) ? "Number is even" : "Number is odd");
    }

    static void greetings(Scanner input) {
        System.out.println("Enter your name:");
        String name = input.next();
        System.out.println("Namaste " + name);
    }

    static void simpleinterest(Scanner input) {
        System.out.println("Enter principal amount:");
        float principal = input.nextFloat();

        System.out.println("Enter time (in years or months):");
        float time = input.nextFloat();

        System.out.println("Is the time entered in months? (yes/no)");
        String choice = input.next().toLowerCase();

        if (choice.equals("yes")) {
            time /= 12;
        }

        System.out.println("Enter rate of interest:");
        float rate = input.nextFloat();

        float si = (principal * time * rate) / 100;
        System.out.println("The simple interest is: " + si);
    }

    static void calculator(int num1, int num2, Scanner input) {
        System.out.println("Enter operator (+, -, *, /):");
        char op = input.next().charAt(0);
        int result = 0;

        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Enter a valid operator.");
                return;
        }
        System.out.println("The result is: " + result);
    }

    static void largestoftwonumbers(int num1, int num2) {
        System.out.println("The larger number is " + ((num1 > num2) ? num1 : num2));
    }

    static void fibinaacoseries(Scanner input) {
        System.out.println("Enter the value of n:");
        int n = input.nextInt();
        int a = 0, b = 1, count = 2;
        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println("The Fibonacci number at position " + n + " is: " + b);
    }

    static boolean isPalindrome(String word) {
        int i = 0, j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static void palindrome(String word) {
        System.out.println("\"" + word + "\" is " + (isPalindrome(word) ? "a palindrome." : "not a palindrome."));
    }
}

