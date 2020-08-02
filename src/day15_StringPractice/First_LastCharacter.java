package day15_StringPractice;

import java.util.Scanner;
/*   task:
    write a program that ask user to enter sentence.
        then print out the first and last characters  */
public class First_LastCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your sentence");
        String sentence = scan.nextLine();
        char first = sentence.charAt(0);
        int x = sentence.length();

        System.out.println(first);
       // System.out.println(x);
        int lastCharacterNumber = x- 1;

       // System.out.println( lastCharacterNumber);

        char lastChar = sentence.charAt(lastCharacterNumber);
        System.out.println(lastChar);



    }
}
