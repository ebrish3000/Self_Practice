package day24_WarmUpTasks;

import java.util.Scanner;

/* 2. write a program that asks user how many numbers he wants to enter,
 and get all the user inputs and store them into an array variable,
 and then write the program that can return maximum and minimum numbers  */
public class Task2_And3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter?: ");
        int count = scan.nextInt();
        int[] number = new int[count];
        System.out.println("Enter your numbers");
        int max = 0;
        int min = 0;
        int sum = 0;
        double average = 0;
        for(int i = 0; i <= number.length-1; i++) {
            number[i] = scan.nextInt();
            if (max < number[i] ){
                max = number[i];
            }
            if (min > number[i]){
                min = number[i];

            }
            sum +=number[i];
        }
        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);
        System.out.println(sum);
        average = sum/count;
        System.out.println(average);



    }
}
