package day20_TaskLoop;

import java.util.Scanner;

/*
   2. write a program that can ask the user enter a number for five times and
   then returns the sum of those five numbers   */
public class One_100 {
    public static void main(String[] args) {
/*
 Scanner scan = new Scanner (System.in);
        System.out.println("enter the numbers:");
​
        int  sum = 0;
​
        for ( int i = 1 ; i > 0;  ){
​
            int num = scan.nextInt();
​
            if(num <0){
                break;
            }
            sum += num ;
        }
​
        System.out.println("the total of numbers entered is: "+sum);
 */
        Scanner scan = new Scanner(System.in);

       /* System.out.println("Enter a number");
        double num1 = scan.nextDouble();
        System.out.println("Enter a number");
        double num2 = scan.nextDouble();
        System.out.println("Enter a number");
        double num3 = scan.nextDouble();
        System.out.println("Enter a number");
        double num4 = scan.nextDouble();
        System.out.println("Enter a number");
        double num5 = scan.nextDouble();

        System.out.println("The sum of the numbers is: " +(num1+num2+num3+num4+num5));*/
        double sum = 0;
        double number= 0;
        for( ; ;){

            System.out.print("Enter a number");

            number = scan.nextDouble();
            if (number<0){
                break;

            }

            sum+=number;

        }

        System.out.println("The sum of the numbers is: " + sum);






    }
}
