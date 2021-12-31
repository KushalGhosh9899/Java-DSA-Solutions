//Input a number and print all the factors of that number
package assignment_3;

import java.util.Scanner;

public class ques23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number = ");
        int num = input.nextInt();
        for(int i=2;i<=num;i++){
            if((num%i)==0){
                System.out.printf(i+" ");
            }
        }
    }
}
