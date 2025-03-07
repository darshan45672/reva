// Nelia is student from Reva University
// She is learning Java from the basics
// She is doing her assignment on Java
// nelisa has 2 internal exams
// She has 6 subjects
// She has to calculate the total marks of 6 subjects
// She has to calculate the average marks of 6 subjects
// if the average marks is greater than 50 then she will pass the exam
// if the average marks is less than 50 then she will fail the exam
// if the average marks is equal to 50 then she will get second class   

package day3;

import java.util.*;

public class assignment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int ia1Mark1 = 0;
        int ia1Mark2 = 0;
        int ia1Mark3 = 0;
        int ia1Mark4 = 0;
        int ia1Mark5 = 0;
        int ia1Mark6 = 0;

        int ia1Total = ia1Mark1 + ia1Mark2 + ia1Mark3 + ia1Mark4 + ia1Mark5 + ia1Mark6;
        
        int ia2Mark1 = 0;
        int ia2Mark2 = 0;
        int ia2Mark3 = 0;
        int ia2Mark4 = 0;
        int ia2Mark5 = 0;
        int ia2Mark6 = 0;

        System.out.println("Enter ia1 marks1");
        ia1Mark1 = sc.nextInt();
        System.out.println("Enter ia1 marks2");
        ia1Mark2 = sc.nextInt();
        System.out.println("Enter ia1 marks3");
        ia1Mark3 = sc.nextInt();
        System.out.println("Enter ia1 marks4");
        ia1Mark4 = sc.nextInt();
        System.out.println("Enter ia1 marks5");
        ia1Mark5 = sc.nextInt();
        System.out.println("Enter ia1 marks6");
        ia1Mark6 = sc.nextInt();

        System.out.println("Enter ia2 marks1");
        ia2Mark1 = sc.nextInt();
        System.out.println("Enter ia2 marks2");
        ia2Mark2 = sc.nextInt();
        System.out.println("Enter ia2 marks3");
        ia2Mark3 = sc.nextInt();
        System.out.println("Enter ia2 marks4");
        ia2Mark4 = sc.nextInt();
        System.out.println("Enter ia2 marks5");
        ia2Mark5 = sc.nextInt();
        System.out.println("Enter ia2 marks6");
        ia2Mark6 = sc.nextInt();

        int ia2Total = ia2Mark1 + ia2Mark2 + ia2Mark3 + ia2Mark4 + ia2Mark5 + ia2Mark6;

        int ia1Average = ia1Total / 6;
        int ia2Average = ia2Total / 6;

        int totalAverage = (ia1Average + ia2Average )/ 2;

        if (totalAverage > 50) {
            System.out.println("Nelisha has Passed the exam with the average marks of " + totalAverage );
        }else if (totalAverage == 50) {
            System.out.println("Nelisha has got second class with the total average marks of " + totalAverage);            
        }else{
            System.out.println("Nelisha has failed the exam with the total average marks of " + totalAverage);
        }
    }
    
}
