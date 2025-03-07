package day2;
public class loops {
    public static void main(String[] args) {
        int number =12343;
        int reverse = 0;
        while(number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
    }
}
