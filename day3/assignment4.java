// write a java code using oops concept to simulate a simple calculator

package day3;

public class assignment4 {
    public class Calculator{

        public int add(int a, int b){
            return a + b;
        }

        public int subtract(int a, int b){
            return a - b;
        }

        public int multiply(int a, int b){
            return a * b;
        }

        public int divide(int a, int b){
            return a / b;
        }

        public int modulus(int a, int b){
            return a % b;
        }
    }


    public static void main(String[] args) {
        Calculator obj = new assignment4().new Calculator();
        
        System.out.println("Addition of two numbers is: " + obj.add(10, 20));
        System.out.println("Subtraction of two numbers is: " + obj.subtract(10, 20));
        System.out.println("Multiplication of two numbers is: " + obj.multiply(10, 20));
        System.out.println("Division of two numbers is: " + obj.divide(10, 20));
        System.out.println("Modulus of two numbers is: " + obj.modulus(10, 20));

    }
    
}
