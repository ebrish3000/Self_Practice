package day13_WarmUpTask;
/* write a program that asks the user enter his car info:
         brand
         model
         year
         color
         mileage
         price
         ex: output format should be:
         2012 Toyota Corolla white, 120000 miles, 12000 dollars */

import java.util.Scanner;

public class CarInformation {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter the brand of your car: ");
        String brand = var.next();
        System.out.println("Enter the model of your car: ");
        String model = var.next();
        System.out.println("Enter the year of your car: ");
                 int year = var.nextInt();
        System.out.println("Enter the color of your car: ");
                   String color = var.next();
        System.out.println("Enter the mileage of your car: ");
        int mileage = var.nextInt();
        System.out.println("Enter the price of your car: ");
        double price = var.nextDouble();

        System.out.println(year+ " "+ brand+ " "+ model+ " "+ color+ ", "+ mileage+ " miles, "+price+ " dollars");


    }
}
