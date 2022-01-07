//Define a method that returns the product of two numbers entered by user.
package assignment_4;

import java.util.Scanner;

public class ques_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the first number = ");
        int num1 = input.nextInt();
        System.out.printf("Enter the second number = ");
        int num2 = input.nextInt();
        System.out.printf("Product of two numbers is = "+product(num1,num2));
    }
    public static int product(int num1, int num2){
        return (num1*num2);
    }
}
