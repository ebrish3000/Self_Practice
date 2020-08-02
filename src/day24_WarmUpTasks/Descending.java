package day24_WarmUpTasks;

import java.util.Arrays;
import java.util.Scanner;

/*
 write a program that can sort the array in descending order
        ex:
            arr1: { 10, 11, 8, 9, 12, 5, 15};
            output:
                arr2: {15, 12, 11, 10, 9, 8, 5}
            NOTE: at the end, you must have have an array that contains the descending order of the original array
 */
public class Descending {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter: ");
        int n = scan.nextInt();
        System.out.println("enter your numbers");

        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scan.nextInt();
        }
        Arrays.sort(arr1);
        int[] arr2 = new int[n];
        for (int i = 0; i <= n-1 ; i++){
            arr2[i] = arr1[(n-1)-i];
        }
        System.out.println(Arrays.toString(arr2));
    }
}
