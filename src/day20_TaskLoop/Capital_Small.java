package day20_TaskLoop;

import java.util.Scanner;
/*
 2. Write a program that can asks user to enter one string and one char and then returns the frequency of str2 in str1
            Ex
                 Input: AABAAC
                        A
                 Output: 4
                Input: ABCC
                       C
                Output: 2      */
public class Capital_Small {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = scan.nextLine();
        System.out.println("Enter a character");
        String ch = scan.next();
        boolean contain = str.contains(ch);
        System.out.println(contain);



    }
}
