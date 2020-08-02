package day13_WarmUpTask;

import java.util.Scanner;

// import java.util.*;
/* 1. write a progrm that can calculate the area of any given circle
                MUST use Scanner
        System.out.println("Enter seconds:");
        Scanner input = new Scanner(System.in);
        int inputSeconds = input.nextInt();
        int hours = inputSeconds / 3600;
        int minutes = (inputSeconds/ 60 ) % 60;
        int seconds = inputSeconds%60;

        System.out.println(hours + " hours, " +minutes+ " minutes, and " + seconds + " seconds"); */

public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println("Enter radius");
         // A == pi * r*r
        Scanner input = new Scanner(System.in);
        double inputRadius = input.nextDouble();

        double area = inputRadius*inputRadius*3.14;
        System.out.println("The area of the circle is: " +area);
    }
}
