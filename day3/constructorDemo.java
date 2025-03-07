package day3;

public class constructorDemo {

    public class InnerconstructorDemo{
        public int a;
        public int b;
        public char operator;

        public InnerconstructorDemo(int x, int y, char op){
            this.a = x;
            this.b = y;
            this.operator = op;
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
                    System.out.println("Division of two numbers is: " + (a / b));
                    break;
                case '%':
                    System.out.println("Modulus of two numbers is: " + (a % b));
                    break;

                default:
                    System.out.println("Invalid operator");
                    break;
            }
    }

    public static void main(String[] args) {
        InnerconstructorDemo obj = new constructorDemo().new InnerconstructorDemo(14, 2067, '+');
        obj.calculate();    
    }
}   
}
