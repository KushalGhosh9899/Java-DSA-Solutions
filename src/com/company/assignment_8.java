//To find out whether the given String is Palindrome or not.
package com.company;

import java.util.Scanner;

public class assignment_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the string = ");
        String str = input.next();
        int strlength= str.length()-1,i=0;
        boolean isPalindrome = true;
        while(i<strlength){
            if(str.charAt(i)!=str.charAt(strlength)){
                isPalindrome=false;
                System.out.printf("String is not Palindrome");
                return;
            }
            i++;
            strlength--;
        }
        System.out.printf("String is Palindrome");
    }
}
