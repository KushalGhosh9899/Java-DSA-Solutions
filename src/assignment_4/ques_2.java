//Define a program to find out whether a given number is even or odd.
package assignment_4;

import java.util.Scanner;

public class ques_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number = ");
        int num = input.nextInt();
        findOddorEven(num);
    }
    public static void findOddorEven(int num){
        if(num%2==0)
            System.out.printf("Number is Even");
        else
            System.out.printf("Number is Odd");
    }
}
