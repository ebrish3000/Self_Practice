package day20_TaskLoop;

import java.util.Scanner;

/*
 Write a program that can return the factorial number of any given number
        Ex:
            input: 5
            output: 120
            because: 5! = 5 * 4 * 3 * 2* 1 = 120 */
public class Factorial {
    public static void main(String[] args) {

        /*Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        int factorial = 1;
        for(int i = number; i>=+1; i--){
            factorial *= i;
        }
        System.out.println(factorial);*/
        Scanner keyboard =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userEnteredNum1 = keyboard.nextInt();
        int factorial = 1;
        String expandedForm=""+userEnteredNum1;
        for( int i = userEnteredNum1 ; i >= 2 ; i--){
            factorial *= i;
            expandedForm += " * "+ (i-1);
        }
        System.out.println("\uD83C\uDF39"+ userEnteredNum1+"! = "+expandedForm + " = " + factorial + " \uD83C\uDF39");


    }
}
