package Task_AritmethicOperetors;

public class Task_09June {

        public static void main(String[] args) {
        /*
        1. Write a Java program that will print a sum of two numbers
Please use variables to store num1,num2,and sum
Sample output:
46 + 90 = 136 */
            int num1 = 46;
            int num2 = 90;
            int sum = num1+num2;
            System.out.println(sum);
            // 2. Write a Java program to convert Fahrenheit to Celcius F=9*C/5+32
            double C = 30;
            double F =9*C/5+32;
            System.out.println(F);
            // 3. Write a Java program that converts mile to km : 1 mile = 1.609344 km
            double km = 1;
            double mile = km*1.609344;
            System.out.println(mile);
        /*
        1. Write a Java program that displays the area and perimeter of a circle that has a radius
            of 5.5 using the following formulas:
            perimeter = 2 * radius * 𝜋
            area = radius * radius * 𝜋
         */
            double radius = 5.5;
            double PI = 3.14;
            double perimeter = 2*radius+PI;
            double areaOfCircle = radius*radius*PI;
            System.out.println(perimeter);
            System.out.println(areaOfCircle);
        /* 2. Write a Java program that displays the area of a rectangle with a width of 4.5 and a
        height of 7.9 using the following formula:
        area = width * height
        */
            double width =4.5;
            double height = 7.9;
            double areaOfRectangle = width*height;
            System.out.println(areaOfRectangle);
            // 3. Write a Java program that calculates the average of 3 numbers.
            double number1 = 100;
            double number2= 200;
            double number3 = 300;
            double averageOf3 = (number1+number2+number3)/3;
            System.out.println(averageOf3);
        }
    }
