//Build Array from Permutation
package assignment_set5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ques_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[]{0,2,1,5,3,4};
        System.out.println("output= "+Arrays.toString(buildArray(arr)));
    }

    static int[] buildArray(int[] nums) {
        int n=nums.length;
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i]= nums[nums[i]];
        }
        return a;
    }
}
