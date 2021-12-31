//Given an integer number n, return the difference between the product of its digits and the sum of its digits.
package assignment_3;

import java.util.Scanner;

public class ques22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number");
        int num = input.nextInt();
    }
    int subtractProductAndSum(int num) {
        int remainder=0,numcpy=num,i=0,sum=0,product=1;
        while(num!=0){
            remainder=num%10;
            sum=sum+remainder;
            product=product*remainder;
            num=num/10;
        }
        sum=product-sum;
        return sum;
    }
}
