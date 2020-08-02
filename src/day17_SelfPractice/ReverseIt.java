package day17_SelfPractice;

import java.util.Scanner;
/*
 write a program that asks user's first and last name, then prints out the initials of the user

                input:
                    cybertek
                    batch18
                output:
                    your initial is: CB
        DO NOT use charAt method

 */
public class ReverseIt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String word1 = input.next();
        System.out.println("Enter your last name");
        String word2 = input.next();
        System.out.println(word1.substring(0,1)+word2.substring(0,1));


    }
    }
