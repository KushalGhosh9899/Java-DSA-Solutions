//To find Armstrong Number between two given number.
package com.company;

import java.util.Scanner;

public class assignment_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the First Number = ");
        int num1 = input.nextInt();
        System.out.printf("Enter the Second Number = ");
        int num2 = input.nextInt();
        System.out.println("Armstrong Number between "+num1+" and "+num2+" is :-");
        while(num1<=num2){
            isArmstrong(num1);
            num1++;
        }
    }

    static void isArmstrong(int realnum) {
        int remainder=0,num=0,numcpy=realnum,i=0;
        while(realnum!=0){
            remainder=realnum%10;
            realnum=realnum/10;
            num= num +(remainder * remainder * remainder);
            i++;
        }
        if(num==numcpy){
            System.out.printf(num+", ");
        }
    }
}
