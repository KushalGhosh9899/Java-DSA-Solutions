//Write a program to print the factorial of a number by defining a method named 'Factorial'
package assignment_4;

import java.util.Scanner;

public class ques_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number = ");
        int num = input.nextInt();
        System.out.printf("Factorial of a number is "+findFactorial(num));
    }
    public static int findFactorial(int num){
        int factorial=1;
        for (int i=2;i<=num;i++){
            factorial=factorial*i;
        }
        return factorial;
    }
}
