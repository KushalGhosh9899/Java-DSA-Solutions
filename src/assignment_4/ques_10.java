//Write a function to find if a number is a palindrome or not. Take number as parameter.
package assignment_4;

import java.util.Scanner;

public class ques_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the Number = ");
        int num = input.nextInt();
        isPalindrome(num);
    }
    public static void isPalindrome(int num){
        int rem=0,numcpy=num,i=1,sum=0;

        //Find out how many digits are present
        while(num!=0){
            num=num/10;
            i*=10;
        }

        num=numcpy;

        while(num!=0){
            i/=10;
            rem=num%10;
            sum=sum+(rem*i);
            num=num/10;
        }

        if(sum==numcpy){
            System.out.printf("Number is Palindrome");
        }
        else
            System.out.printf("Number is not a Palindrome");
    }
}
