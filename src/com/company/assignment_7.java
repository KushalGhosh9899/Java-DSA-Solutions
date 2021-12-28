//To calculate Fibonacci Series up to n numbers.
package com.company;
import java.util.Scanner;

public class assignment_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the Number up to you wanted to print the series = ");
        int num = input.nextInt();
        System.out.println("Fibonacci Series of number "+ num +" is :-");
        int prevterm1 = 0;
        int prevterm2 = 1;
        int newnum = 0;
        System.out.print(prevterm1+", ");
        System.out.print(prevterm2);
        for (int i=1; newnum<num;i++){
            newnum=prevterm1+prevterm2;
            System.out.print(", "+newnum);
            prevterm1=prevterm2;
            prevterm2=newnum;
        }
    }
}
