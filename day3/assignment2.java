// write a simple java program to implement simple calculator
// constraints:
// 1. it should take two numbers as input
// 2. it should take an operator as input
// 3. it should perform the operation based on the operator
// 4. it should print the result

package day3;

import java.util.Scanner;

public class assignment2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("do you want to continue [y/n]");
            char ch = sc.next().charAt(0);
            if (ch == 'n') {
                flag = false;
                break;
            }
            System.out.println("Enter first number");
            int num1 = sc.nextInt();
            System.out.println("Enter second number");
            int num2 = sc.nextInt();
            System.out.println("Enter operator");
            char operator = sc.next().charAt(0);

            switch (operator) {
                case '+':
                    System.out.println("Addition of two numbers is: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("Subtraction of two numbers is: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Multiplication of two numbers is: " + (num1 * num2));
                    break;
                case '/':
                    System.out.println("Division of two numbers is: " + (num1 / num2));
                    break;
                case '%':
                    System.out.println("Modulus of two numbers is: " + (num1 % num2));
                    break;

                default:
                    System.out.println("Invalid operator");
                    break;
            }
        }
        sc.close();

    }

}
