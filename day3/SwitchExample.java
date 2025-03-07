package day3;

public class SwitchExample {
    public static void main(String[] args) {
        int x = 5;

        switch (x) {
            case 1:
                System.out.println("x is 1");
                break;
            case 2:
                System.out.println("x is 2");
                break;
            case 3:
                System.out.println("x is 3");
                break;
            case 4:
                System.out.println("x is 4");
                break;
            case 5:
                System.out.println("x is 5");
                break;
            case 6:
                System.out.println("x is 6");
                break;
            default:
                System.out.println("x is not 1, 2, 3, 4, 5, or 6");
                break;
        }
    }
}
