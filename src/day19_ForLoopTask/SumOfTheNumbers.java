package day19_ForLoopTask;

public class SumOfTheNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int sumOdd =0;
        int sumEven = 0;

        for (int i = 1; i<=100; i++){
            sum = sum+i;

          if (i%2 != 0){
                sumOdd = sumOdd+i;
            }
           if (i%2 == 0){
                sumEven = sumEven+i;

            }

        }
        System.out.println("Sum of the numbers 1 to hundred is " + sum);
        System.out.println("Sum of odd numbers 1 to hundred is " + sumOdd);
        System.out.println("Sum of even numbers 1 to hundred is " + sumEven);




    }
}
