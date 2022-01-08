//Write a program that will ask the user to enter his/her marks (out of 100).
// Define a method that will display grades according to the marks entered
package assignment_4;

import java.util.Scanner;

public class ques_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the marks of your subject = ");
        int marks = input.nextInt();
        displayGrade(marks);
    }
    public static void displayGrade(int marks){
        if(marks>=91)
            System.out.printf("Grade AA");
        else if(marks>=81)
            System.out.printf("Grade AB");
        else if(marks>=71)
            System.out.printf("Grade BB");
        else if(marks>=61)
            System.out.printf("Grade BC");
        else if(marks>=51)
            System.out.printf("Grade CD");
        else if(marks>=41)
            System.out.printf("Grade DD");
        else
            System.out.printf("Fail");

    }
}
