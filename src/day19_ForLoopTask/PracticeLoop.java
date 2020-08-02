package day19_ForLoopTask;
/*
07/05/2020
Topics: for loop Continue
        loops without {}
        break & continue statements
package : day19_ForLoop
warmup tasks:
    1. write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5
    2. write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5
    3. write a program that can calculate the sum of all the even numbers between 1 ~ 100
    4. write a program that can calculate the sum of all the odd numbers between 1 ~ 100
    5. Write a program that will print out all letters in English alphabet in ascending order
    6. Write a program that will print out all letters in English alphabet in descedning order
    7. write a program that can calculate the sum of all numbers between 1 to any given number
        ex:
            input: 100
            output: 5050
            input: 50
            output: 1275
        SumOfNums
loop: repeated action
for:
        for(init; condition; iterator){
                statements;
        }
        initialization (mandatory): starting point
        condition (mandatory) : ending point
        iterator : Co-related to the condition
                    eventually make the condition false, so that it exits the loop
loop without curly brace: can ONLY repeat one statement. cannot have more than one statement in loops body
break statement: used for exiting switch and loops
continue statement:  skips the current iteration

                    WE ONLY USE IT IN THE LOOP
Task:
    1. write a program that can reverse any string
    2. palindrome
level ==> level ==> true
mom ==> mom  ==> true
muhtar ==> rathum ==> false

    3. print odd numbers between 1 to 50
    4. print even number between 1 to 50


 */
public class PracticeLoop {
    public static void main(String[] args) {

        for(int i = 1; i<=50; i+=2)
            System.out.print(i+ " ");
        System.out.println();
        System.out.println("===========================================================");
        for(int i = 2; i<=50; i+=2)
            System.out.print(i+ " ");
        System.out.println();
        System.out.println("================================================================");


    }
}