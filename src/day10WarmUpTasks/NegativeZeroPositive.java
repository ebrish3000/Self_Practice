package day10WarmUpTasks;
/*
Task01:
     write a program that can check if number is positive negative or equals to zero.
        for example:
            num  = 1
            prints:
                1 is positive number
            num = -6
            print:
                6 is negative number
            num = 0
            print:
                zero

 */
public class NegativeZeroPositive {
    public static void main(String[] args) {
        double x = -4;
        if (x > 0) {
            System.out.println(x + " is positive number"); }
        if (x == 0) { System.out.println("zero"); }
        if(x<0){ System.out.println(x+ " is negative number"); }

    }
}