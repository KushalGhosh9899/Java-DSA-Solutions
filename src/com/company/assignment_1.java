//Program for finding out Odd or Even number
package com.company;

import java.util.Scanner;

public class assignment_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Scanner Class for taking input
        System.out.print("Enter the Number = ");
        int num = input.nextInt();//Stores the input value into num value

        //condition loop for checking even or odd
        if((num%2)==0){
            System.out.println("The number is Even");
        }
        else{
            System.out.println("The number is Odd");
        }
    }
}
