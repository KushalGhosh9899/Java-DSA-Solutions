//Program for program finding out simple interest
package com.company;

import java.util.Scanner;

public class assignment_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the Principal Amount = ");
        int p = input.nextInt();
        System.out.printf("Enter the Time = ");
        int t = input.nextInt();
        System.out.printf("Enter the Rate = ");
        int r = input.nextInt();
        int simple_interest = p*(1+r*t);
        System.out.printf("Simple Interest = "+simple_interest);
    }
}
