package day17_SelfPractice;

import java.util.Scanner;
/*
1. Ask user to enter a word. If the work contains starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code  */
public class Remove_X {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        if ((word.charAt(0) == 'x' || word.charAt(0) == 'X') && (word.charAt(1) == 'x' || word.charAt(1) == 'X')){
            System.out.println(word.substring(2));
        } else if (word.charAt(0) == 'x' || word.charAt(0) == 'X'){
            System.out.println(word.substring(1));

        }else
            System.out.println(word);
        }

    }

