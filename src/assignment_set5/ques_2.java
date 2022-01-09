//Concatenation of Array
package assignment_set5;

import java.util.Arrays;
import java.util.Scanner;

public class ques_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[]{1,2,1};
        System.out.println("output= "+ Arrays.toString(getConcatenation(arr)));
    }

    static int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] ans = new int[2*length];
        for (int i = 0; i < length; i++) {
            ans[i] = nums[i];
            ans[i + length] = nums[i];
        }
        return ans;
    }
}