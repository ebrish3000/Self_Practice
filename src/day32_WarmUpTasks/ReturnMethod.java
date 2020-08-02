package day32_WarmUpTasks;

import java.util.Arrays;

/*
Warm up tasks:
    1. write a method that can return the full name of a person in regular format
            ex:
                fullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School"
    2. write a return method that accepts two numbers and an operator, then returns calculation result.
             if the operator is invalid, return zero
             otherwise return the result

    3. write a method that can add element to an array, the method accepts an array and and a number, then returns the new array by appending the number to the last index of the given array
        Ex:
            int[] arr = {1,2,3};
            int num = 4;
            addElement(arr, num); ===> {1,2,3,4}
 */
public class ReturnMethod {
    public static void main(String[] args) {
       String fullName= fullName("eBRAHIM", "eMAM");
        System.out.println(fullName);

        double result = calculationResult(10, '/', 20);
        System.out.println(result);

       int [] newArr =  newArray(new int [] {10,30,50, 5000, -1, 0, 200,1000,-20}, 20);
        System.out.println(Arrays.toString(newArr));
    }
    // task 01
    public static String fullName(String firstName, String lastName) {
        String firstCap = firstName.substring(0, 1).toUpperCase()+firstName.substring(1);
        String lastCap = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
        return firstCap + " " + lastCap;
    }
   // task 02
    public static double calculationResult(double num1, char ch, double num2) {
        double result = (ch == '+')? num1+num2 :( ch == '-')? num1-num2 :(ch =='*')? num1 * num2
                :( ch == '/')? num1/num2  :(ch =='%')? num1%num2 : 0;
        return result;
    }
    // task03
    public static int[] newArray(int[] arr, int num) {

        int[] newArr = new int [arr.length + 1];
        newArr[newArr.length-1] = num;
        for (int i = 0; i < arr.length ; i++) {
            newArr[i]  = arr[i];
        }
        return  newArr;
    }


}
