
// there's a class of bca students and they have to give a test
// the test has 5 questions and each question has 4 options
// the students have to select one option for each question
// the correct answer for each question is stored in an array
// the students have to select the correct answer for each question
// the students will get 4 marks for each correct answer
// the students will get -1 for each wrong answer
// the students will get 0 for each question not attempted
// write a program to take the answers from the students and calculate the total marks



package day3;

import java.util.Scanner;


public class assignment3 {
    public static void main(String[] args) {
        char[] correctAnswers = { 'A', 'B', 'C', 'D', 'A' };
        char[] studentAnswers = new char[5];
        int marks = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your answers for the 5 questions (A, B, C, D):");

        for (int i = 0; i < studentAnswers.length; i++) {
            System.out.print("Question " + (i + 1) + ": ");
            studentAnswers[i] = scanner.next().charAt(0);
        }

        for (int i = 0; i < correctAnswers.length; i++) {
            if (correctAnswers[i] == studentAnswers[i]) {
                marks += 4;
            } else if (studentAnswers[i] == ' ') {
                marks += 0;
            } else {
                marks -= 1;
            }
        }

        System.out.println("Total marks: " + marks);
        scanner.close();
    }
}
