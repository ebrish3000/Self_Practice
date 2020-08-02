package day17_SelfPractice;

import java.util.Scanner;
/*
write a program that asks user's first and last name, then prints out the initials of the user

                input:
                    cybertek
                    batch18
                output:
                    your initial is: CB
        DO NOT use charAt method    */
public class AddWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first word");
        String word1 = input.next();
        System.out.println("Enter your second word");
        String word2 = input.next();
        int l1 = word1.length();
        int l2 = word2.length();
        char c1 = word1.charAt(l1-1);
        char c2 = word2.charAt(0);
        if(c1==c2){
            System.out.println(word1 + ""+ word2.substring(1));
        }else {
            System.out.println(word1+word2);
        }





    }
}
