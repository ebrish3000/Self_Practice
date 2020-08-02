package day30_WarmUpTasks;

import java.util.Scanner;

/*
warm up tasks:
    1. create a function that can print out the maximum number between two numbers
    2. create a function that can print out the array of integers in descending order
    3. create a function that can print out the combination of two integer arrays
    4.
        step1: create a function that can check if the given integer is positive, negative or zero
        step2: Use the above method to  write a program that can check every single elements of an array of Integers
        MUST use for each loop
 */
public class MaxNum {
    public static void main(String[] args) {
        maxNum();

    }

    public static void maxNum() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }


    }


}
