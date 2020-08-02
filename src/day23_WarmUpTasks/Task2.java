package day23_WarmUpTasks;

import java.util.Scanner;

/*
2. write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
            the program asks the user which bedroom does he/she wants to reserve and calculates the total price
            and then the program will ask:
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            while answer is neither yes or no ==> please re-enter
            HINT: nested loop task, outter loop need to be an infinite loop

 */
public class Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int totalPrice = 0;
        String otherRoom = "";
       do {
           System.out.println("Which bed room do you want to reserve?");
           String bedType = scan.nextLine();
           if (bedType.equalsIgnoreCase("KING BED")) {
               totalPrice += 120;
           } else if (bedType.equalsIgnoreCase("queen bed")) {
               totalPrice += 100;
           } else if (bedType.equalsIgnoreCase("single bed")) {
               totalPrice += 80;
           }
           //System.out.println("The price will be: "+totalPrice);
           System.out.println("Do you want to reserve another room?");
           otherRoom = scan.next();
       }while (otherRoom.equalsIgnoreCase("yes")) ;{

            System.out.println("Which bed room do you want to reserve?");
            String bedType = scan.nextLine();
            if (bedType.equalsIgnoreCase("KING BED")) {
                totalPrice += 120;
            } else if (bedType.equalsIgnoreCase("queen bed")) {
                totalPrice += 100;
            } else if (bedType.equalsIgnoreCase("single bed")) {
                totalPrice += 80;
            }
            //System.out.println("The price will be: "+totalPrice);
           // System.out.println("Do you want to reserve another room?");
            otherRoom = scan.next();
       }while (otherRoom.equalsIgnoreCase("no"));{
            System.out.println("your total price is: $"+ totalPrice);
            System.exit(0);
        }while (!otherRoom.equalsIgnoreCase("yes")||!otherRoom.equalsIgnoreCase("no"));{
            System.out.println("please re-enter");
            otherRoom = scan.next();
        }





    }
}
