package day3;

public class Assignment5 {  // Class name should start with uppercase

    public static class Calculator {
        private int a;
        private int b;
        private char operator;

        public Calculator(int a, int b, char operator) {
            this.a = a;
            this.b = b;
            this.operator = operator;
        }

        public void calculate() {
            switch (operator) {
                case '+':
                    System.out.println("Addition of two numbers is: " + (a + b));
                    break;
                case '-':
                    System.out.println("Subtraction of two numbers is: " + (a - b));
                    break;
                case '*':
                    System.out.println("Multiplication of two numbers is: " + (a * b));
                    break;
                case '/':
                    if (b == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        System.out.println("Division of two numbers is: " + (a / b));
                    }
                    break;
                case '%':
                    if (b == 0) {
                        System.out.println("Error: Modulus by zero is not allowed.");
                    } else {
                        System.out.println("Modulus of two numbers is: " + (a % b));
                    }
                    break;
                default:
                    System.out.println("Invalid operator");
                    break;
            }
        }

    }
    public static void main(String[] args) {
        Calculator obj = new Calculator(10, 20, '+');
        obj.calculate();
    }
}
