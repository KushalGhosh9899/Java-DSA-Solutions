//Write a function that returns all prime numbers between two given numbers.
package assignment_4;

import java.util.Scanner;

public class ques_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the first number = ");
        int num1 = input.nextInt();
        System.out.printf("Enter the second number = ");
        int num2 = input.nextInt();
        while(num1!=num2){
            isPrime(num1);
            num1++;
        }
    }
    public static void isPrime(int num){
        int status =0;
        for(int i=2;i<=(num/2);i++){
            if((num % i)==0){
                status=1;
                break;
            }
        }
        if(status==0){
            System.out.printf(num+" ");
        }
    }
}
