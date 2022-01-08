//Write a function that returns the sum of first n natural numbers.
package assignment_4;

import java.util.Scanner;

public class ques_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the natural number = ");
        int num = input.nextInt();
        System.out.printf("Sum of natural number = "+findSum(num));
    }
    public static int findSum(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        return sum;
    }
}
