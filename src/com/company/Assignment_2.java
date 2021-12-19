//Program for Take name as input and print a greeting message for that name
package com.company;

import java.util.Scanner;

public class Assignment_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter your name = ");
        String name = input.nextLine();

        System.out.println("Hello "+name);//Prints the name
    }
}
