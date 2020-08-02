package day11_WarmUpTask;
/*
SDET Motors Inc. is recalling all vehicles from model years 1995-1998,  2001-2002,  2004-2006 and 2015-2017. wirte a program that can check if the vehicle is eligible to recall.
        if eligible, print: true
        otherwise: false
 */
public class EligibleCars {
    public static void main(String[] args) {
        int year = 1998;
        boolean class1 = year>=1995 && year<=1998;
        boolean class2 = year>=2001 && year<=2002;
        boolean class3 = year >= 2004 && year<=2006;
        boolean class4 = year >= 2015 && year<=2017;
        if (class1 || class2 || class3 || class4){
            System.out.println("true");}
        else {
            System.out.println(false);}


    }
}
