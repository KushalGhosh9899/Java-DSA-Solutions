//Write a function to check if a given triplet is a Pythagorean triplet or not.
package assignment_4;

import java.util.Scanner;

public class ques_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the first side = ");
        int side1 = input.nextInt();
        System.out.printf("Enter the second side = ");
        int side2 = input.nextInt();
        System.out.printf("Enter the third side = ");
        int side3 = input.nextInt();
        checkPythagoras(side1,side2,side3);
    }
    public static void checkPythagoras(int side1, int side2, int side3){
        int maxnum=findMax(side1, side2, side3);
        if(maxnum==side1){
            if( (side2 * side2) + (side3 * side3) == (side1 * side1)){
                System.out.printf("Yes it is pythagorean triplet");
            }
            else
                System.out.printf("No it is not pythagorean triplet");
        }
        else if(maxnum == side2){
            if( (side1 * side1) + (side3 * side3) == (side2 * side2)){
                System.out.printf("Yes it is pythagorean triplet");
            }
            else
                System.out.printf("No it is not pythagorean triplet");

        }
        else{
            if( (side2 * side2) + (side1 * side1) == (side3 * side3)){
                System.out.printf("Yes it is pythagorean triplet");
            }
            else
                System.out.printf("No it is not pythagorean triplet");

        }
    }
    public static int findMax(int num1, int num2, int num3){
        int maxnum=0;
        if(num1>num2){
            if(num1>num3){
                maxnum = num1;
            }
            else{
                maxnum = num3;
            }
        }
        else if(num2>num1){
            if(num2>num3){
                maxnum = num2;
            }
            else{
                maxnum = num3;
            }
        }
        return maxnum;
    }
}
