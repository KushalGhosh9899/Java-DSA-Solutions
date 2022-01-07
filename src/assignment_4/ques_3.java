//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
package assignment_4;

import java.util.Scanner;

public class ques_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the age = ");
        int age = input.nextInt();
        findEligibility(age);
    }
    public static void findEligibility(int age){
        if(age>=18)
            System.out.printf("You are eligible for casting Vote");
        else
            System.out.printf("You are not eligible for casting Vote");
    }
}
