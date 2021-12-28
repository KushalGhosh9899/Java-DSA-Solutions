//Take 2 numbers as input and print the largest number
package assignment_set2;

import java.util.Scanner;

public class assignment_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the First Number = ");
        int num1 = input.nextInt();
        System.out.printf("Enter the Second Number = ");
        int num2 = input.nextInt();
        if(num1>num2){
            System.out.printf("First Number is Greater");
        }
        else if(num2>num1){
            System.out.printf("Second Number is Greater");
        }
        else{
            System.out.printf("Both Number are equal");
        }
    }
}
