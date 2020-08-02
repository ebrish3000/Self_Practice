package day06_tasks;

import java.sql.SQLOutput;

public class Swap {
    public static void main(String[] args) {
        /* write a program that can swap two variables' values wihtout using temporary variable
					Ex:
						int a =10;
						int b= 15;

					output:
						System.out.println(a); ===> 15
						System.out.println(b); ===> 10  */
        int a = 10;
        int b = 15;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);

    }
}
