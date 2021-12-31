//Take integer inputs till the user enters 0 and print the sum of all numbers
package assignment_3;

import java.util.Scanner;

public class ques24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i=0,num,sum=0;
        while(i==0){
            System.out.printf("Enter the number = ");
            num = input.nextInt();
            if(num==0){
                break;
            }
            else{
                sum=sum+num;
            }
        }
        System.out.printf("Sum of all the numbers is = "+sum);
    }
}
