package day15_StringPractice;

import java.util.Scanner;

public class toUpperCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.next(); // Ebrahim

        System.out.println("Enter your last name");
        String lastName = scan.next(); //Hasen

        //String fullName =firstName.concat( " ".concat(lastName) );
        String fullName = firstName + " " + lastName;

       // System.out.println("Your full name is : ".concat(fullName));
        System.out.println(fullName);
        /*
         String name2 = "EBRAHIM Hasen";
        name2= name2.toUpperCase();   // "EBRAHIM HASEN
        System.out.println(name2);
         */
        fullName = fullName.toUpperCase();
        System.out.println(fullName);






    }
}
