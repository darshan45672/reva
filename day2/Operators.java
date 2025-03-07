package day2;

public class Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 20;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.o ut.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println("a++ = " + (a++));
        System.out.println("b-- = " + (b--));
        System.out.println("++a = " + (++a));
        System.out.println("--b = " + (--b));

        // Relational Operators
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("b >= a = " + (b >= a));
        System.out.println("b <= a = " + (b <= a));

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!x = " + !x);

        // Bitwise Operators
        int c = 60; /* 60 = 0011 1100 */
        int d = 13; /* 13 = 0000 1101 */
        System.out.println("c & d = " + (c & d));
        System.out.println("c | d = " + (c | d));
        System.out.println("c ^ d = " + (c ^ d));
        System.out.println("~c = " + ~c);
        System.out.println("c << 2 = " + (c << 2));
        System.out.println("c >> 2 = " + (c >> 2));
        System.out.println("c >>> 2 = " + (c >>> 2));

        // Assignment Operators
        int e = 10;
        int f = 20;
        int g = 0; 

        System.out.println("g = e + f = " + (g = e + f));
        System.out.println("g += e = " + (g += e));
        System.out.println("g -= e = " + (g -= e));
        System.out.println("g *= e = " + (g *= e));
        System.out.println("g /= e = " + (g /= e));
        System.out.println("g %= e = " + (g %= e));
        System.out.println("g <<= e = " + (g <<= e));
        System.out.println("g >>= e = " + (g >>= e));
        System.out.println("g >>>= e = " + (g >>>= e));
        System.out.println("g &= e = " + (g &= e));
        System.out.println("g ^= e = " + (g ^= e));
        System.out.println("g |= e = " + (g |= e));
    }   
}