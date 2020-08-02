package day32_WarmUpTasks;

import java.util.Arrays;

/*
Assignments:
tasks2:
    1. create a method that can combine 2 arrays of integers
    2. create a method that can combine 2 arrays of double
    3. create a method that can combine 2 arrays of String
    4. create a method that can combine 2 arrays of char
    first solution: DO NOT use method overloading
    second solution: apply method overloading

 */
public class MethodWithoutOverloading {
    public static void main(String[] args) {


    }


    public static void combine2ArraysOfIntegers(int[] arr1, int[] arr2) {

        int[] combArray = new int[arr1.length + arr2.length];
        int k = 0;
        for (int each : arr1) {
            combArray[k] = each;
            k++;
        }
        for (int each : arr2) {
            combArray[k] = each;
            k++;
        }
    }

    public static void combine2ArraysOfDouble(double[] arr1, double[] arr2) {

        double[] combArray = new double[arr1.length + arr2.length];
        int k = 0;
        for (double each : arr1) {
            combArray[k] = each;
            k++;
        }
        for (double each : arr2) {
            combArray[k] = each;
            k++;
        }
    }

    public static void combine2ArraysOfString(String[] arr1, String[] arr2) {

        String[] combArray = new String[arr1.length + arr2.length];
        int k = 0;
        for (String each : arr1) {
            combArray[k] = each;
            k++;
        }
        for (String each : arr2) {
            combArray[k] = each;
            k++;
        }
    }

    public static void combine2ArraysOfCharacter(char[] arr1, char[] arr2) {

        char[] combArray = new char[arr1.length + arr2.length];
        int k = 0;
        for (char each : arr1) {
            combArray[k] = each;
            k++;
        }
        for (char each : arr2) {
            combArray[k] = each;
            k++;
        }
    }


}
