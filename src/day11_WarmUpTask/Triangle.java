package day11_WarmUpTask;
/*
 A triangle is valid if the sum of all the three angles is equal to 180 degrees.
Write a program that declares three integers as angles and check whether a triangle
is valid or not.

        Note: MUST use if&else statement
 */
public class Triangle {
    public static void main(String[] args) {
        double side1 = 50;
        double side2 = 100;
        double side3 = 35;
        boolean triangle = (side1+side2+side3)==180;

        if (triangle){ System.out.println("It is triangle."); }
        else { System.out.println("It is not triangle");}
    }
}
