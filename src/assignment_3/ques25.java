//Take integer inputs till the user enters 0 and print the largest number from all.
package assignment_3;

import java.util.Scanner;

public class ques25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i=0,num,greatestNum=0;
        while(i==0){
            System.out.printf("Enter the number = ");
            num=input.nextInt();
            if(num==0){
                break;
            }
            else{
                if(greatestNum<num){
                    greatestNum=num;
                }
            }
        }
        System.out.printf("Greatest number amongst all is "+greatestNum);
    }
}
