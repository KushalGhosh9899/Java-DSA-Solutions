//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
package assignment_4;

import java.util.Scanner;

public class ques_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the radius of circle = ");
        float r = input.nextFloat();
        System.out.println("Area of circle is "+area(r));
        System.out.printf("Circumference of circle is "+circumference(r));
    }
    public static float area(float r){
        float area;
        area=3.14f*r*r;
        return area;
    }
    public static float circumference(float r){
        float circumference;
        circumference=3.14f*r*2;
        return circumference;
    }
}
