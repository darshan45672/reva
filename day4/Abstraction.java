package day4;

public class Abstraction {
    public abstract class Sum {
        public abstract int add(int a, int b);
        public abstract int add(int a, int b, int c);
        public abstract double add(double a, double b);
    }
    
    class SumInherit extends Sum {
        public int add(int a, int b){
            return a + b;
        }
        public int add(int a, int b, int c){
            return a + b + c;
        }
        public double add(double a, double b){
            return a + b;
        }
    }
    public static void main(String[] args) {
        Abstraction outer = new Abstraction();
        SumInherit sum = outer.new SumInherit();

        System.out.println("Sum of 2 and 3 is: " + sum.add(2, 3));
        System.out.println("Sum of 2, 3 and 4 is: " + sum.add(2, 3, 4));  
        System.out.println("Sum of 2.5 and 3.5 is: " + sum.add(2.5, 3.5));
    }
}
