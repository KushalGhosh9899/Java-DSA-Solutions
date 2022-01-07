//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user

package assignment_4;

import java.util.Scanner;

public class ques_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the First Number = ");
        int num1 = input.nextInt();
        System.out.printf("Enter the Second Number = ");
        int num2 = input.nextInt();
        System.out.printf("Enter the Third Number = ");
        int num3 = input.nextInt();
        System.out.println("Maximum number is = "+findMax(num1,num2,num3));
        System.out.printf("Minimum number is = "+findMin(num1,num2,num3));
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
    public static int findMin(int num1, int num2, int num3){
        int minnum=0;
        if(num1<num2){
            if(num1<num3){
                minnum = num1;
            }
            else{
                minnum = num3;
            }
        }
        else if(num2<num1){
            if(num2<num3){
                minnum = num2;
            }
            else{
                minnum = num3;
            }
        }
        return minnum;
    }

}
