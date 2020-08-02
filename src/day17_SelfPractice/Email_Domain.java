package day17_SelfPractice;

import java.util.Scanner;

/*
write a program that will return the domain of an email address:
            Ex:
                input: test@gmail.com
                output: the domain of the email is: gmail
                inputL: Cybertek@yahoo.com
                output: the domain of the email is: yahoo
 */
public class Email_Domain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your email");
        String word1 = input.next();
        int at = word1.indexOf("@");
        int dot = word1.indexOf(".");

        int l = word1.length();
        String domain = word1.substring(l-9, l-4);
        System.out.println(domain);
        System.out.println(word1.substring(at+1, l-4));
        System.out.println(word1.substring(at+1, dot));

    }
}
