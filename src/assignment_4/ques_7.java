//Define a method to find out if a number is prime or not.
package assignment_4;

import java.util.Scanner;

public class ques_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number = ");
        int num = input.nextInt();
        isPrime(num);
    }
    public static void isPrime(int num){
        int num1,status=0;
        num1=num/2;
        for (int i=2;i<=num1;i++){
            if(num%i==0){
                status=1;
                break;
            }
        }
        if(status==1)
            System.out.printf("Number is not Prime");
        else
            System.out.printf("Number is Prime");

    }
}
