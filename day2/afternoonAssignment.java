package day2;

public class afternoonAssignment {
    public static void main(String[] args) {
        double a = 10, b = 5, c = 30;

        // double res = --a + (b++ * --c) / --a + (a++ * ++b / c++);
        // System.out.println("res: " + res);
        System.out.println("a = " + a + " b = " + b + " c =" + c);
        double step1_1 = b++ * --c;
        System.out.println(step1_1);
        System.out.println("a = " + a + " b = " + b + " c =" + c);
        double step1_2 = a++ * ++b / c++;
        System.out.println(step1_2);
        System.out.println("a = " + a + " b = " + b + " c =" + c);
        double step2_1 = step1_1/--a;
        System.out.println(step2_1);
        System.out.println("a = " + a + " b = " + b + " c =" + c);
        double step3 = --a + step2_1 + step1_2;
        System.out.println(step3);
        System.out.println("a = " + a + " b = " + b + " c =" + c);

    }
}
