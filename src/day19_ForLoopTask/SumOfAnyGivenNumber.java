package day19_ForLoopTask;

import java.util.Scanner;

public class SumOfAnyGivenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();

        int sum = 0;
       if(num>=0){for(int i =0; i<=num; i++){
            sum = sum +i;

        }
        System.out.print(sum);}else {
        for (int j = 0; j>=num; j--) {
            sum = sum+j;
        }
        System.out.println(sum);}


    }
}
