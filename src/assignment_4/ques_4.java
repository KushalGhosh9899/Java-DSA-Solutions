//Write a program to print the sum of two numbers entered by user by defining your own method.
package assignment_4;

import java.util.Scanner;

public class ques_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the first number = ");
        int num1 = input.nextInt();
        System.out.printf("Enter the second number = ");
        int num2 = input.nextInt();
        System.out.printf("Sum of two numbers is = "+sum(num1,num2));
    }
    public static int sum(int num1, int num2){
        return (num1+num2);
    }
}
