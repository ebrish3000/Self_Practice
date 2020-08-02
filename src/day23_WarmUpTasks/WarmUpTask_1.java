package day23_WarmUpTasks;

import java.util.Scanner;

/*
Warm up tasks:
    1. write a program that will ask user to enter two numbers and calculates the sum of those two numbers.
     then it asks the user if he/she wants to continue
                    if the answer is yes, repeat the whole process again
                    if the answer is no, only return the addition
                    but while the answer is not a valid answer (not yes or no),
                    the the program should repeatedly ask the user re-enter
            HINT: nested loop task, outer loop need to be an infinite loop

 */
public class WarmUpTask_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double first = 0;
        double second = 0;
        double sum = 0;
        String wantToContinue = "";

       System.out.print("Enter the first number");
        first = scan.nextDouble();
        System.out.print("Enter the second number");
        second = scan.nextDouble();
        sum = first + second;
        System.out.println(sum);

        System.out.println("Do you want to continue?");
        wantToContinue = scan.next();

           while (wantToContinue.equalsIgnoreCase("yes")){
            System.out.print("Enter the first number");
            first = scan.nextDouble();
            System.out.print("Enter the second number");
            second = scan.nextDouble();
            sum = first + second;
            System.out.println(sum);
            System.out.println("Do you want to continue?");
            wantToContinue = scan.next();
            while (wantToContinue.equalsIgnoreCase("no")) {
                System.out.println(sum);
                System.exit(0);

            }
            while (!wantToContinue.equalsIgnoreCase("yes") || !wantToContinue.equalsIgnoreCase("no")){
                System.out.println("re-inter");
                String re = scan.next();

            }
        }



    }
}
