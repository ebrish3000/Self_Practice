package day7_WarmUpTask;

public class Task2 {
    public static void main(String[] args) {
         /*  write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;
            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true */
        int z = 65;
        boolean even = z%2 == 0;
        boolean odd = z%2 != 0;
        boolean divisibleBy_3 = z%3 == 0;
        boolean divisibleBy_5 = z%5 == 0;

        System.out.println(z+ " is divisible by 2: "+ even);
        System.out.println(z+ " is divisible by 3: " + divisibleBy_3);
        System.out.println(z+ " is divisible by 5: " + divisibleBy_5);
        System.out.println(z+ " is not divisible by two: " + odd);


    }
}
