//Input currency in rupees and output in USD
package com.company;

import java.util.Scanner;

public class assignment_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the currency in Indian Rupees = ");
        int inrRupees = input.nextInt();
        float usdRupees = (float) (inrRupees*0.013);
        System.out.printf("Value of Rs "+ inrRupees + " is USD "+usdRupees);
    }
}
