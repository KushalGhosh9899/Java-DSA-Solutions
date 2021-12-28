//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package assignment_set2;

import java.util.Scanner;

public class assignment_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the first operand = ");
        int num1 = input.nextInt();
        System.out.printf("Enter the second operand = ");
        int num2 = input.nextInt();
        System.out.printf("Enter the operator = ");
        char operator = input.next().charAt(0);
        if(operator == '+'){
            System.out.printf("Result is "+(num1+num2));
        }
        else if(operator == '-'){
            System.out.printf("Result is "+(num1-num2));
        }
        else if(operator == '*'){
            System.out.printf("Result is "+(num1*num2));
        }
        else{
            System.out.printf("Result is "+(num1/num2));
        }

    }
}
