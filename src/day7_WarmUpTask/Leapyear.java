package day7_WarmUpTask;

public class Leapyear {
    public static void main(String[] args) {
        short y = 2020;
        boolean year = (y % 4 == 0);
        System.out.println( y + " is leap year: " + year);

    }
}
