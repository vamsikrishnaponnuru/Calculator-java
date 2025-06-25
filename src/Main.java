import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float ans = 0;

        while (true) {
            System.out.print("Enter operator (+, -, *, /, %) or X to exit: ");
            char ch = s.next().trim().charAt(0);

            if (ch == 'X' || ch == 'x') {
                System.out.println("Exiting calculator...");
                break;
            }

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                System.out.print("Enter first number: ");
                float num1 = s.nextFloat();

                System.out.print("Enter second number: ");
                float num2 = s.nextFloat();

                switch (ch) {
                    case '+': ans = num1 + num2; break;
                    case '-': ans = num1 - num2; break;
                    case '*': ans = num1 * num2; break;
                    case '/':
                        if (num2 != 0) {
                            ans = num1 / num2;
                        } else {
                            System.out.println("Error: Division by zero.");
                            continue;
                        }
                        break;
                    case '%': ans = num1 % num2; break;
                }

                System.out.println("Result: " + ans);
            } else {
                System.out.println("Invalid operator. Try again.");
            }
        }
    }
}
