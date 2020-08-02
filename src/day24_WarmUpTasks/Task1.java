package day24_WarmUpTasks;

import java.util.Scanner;

/*
warm up tasks:
    1. write a program that can find the unique characters from a String
        Ex:
            input: aabccd
            output: bd

 */
public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String unique = "";
        for (int i = 0; i <str.length(); i++) {
            if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                unique+=str.charAt(i);
            }
        }
        System.out.print(unique);


    }
}
