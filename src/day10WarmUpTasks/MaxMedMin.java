package day10WarmUpTasks;
/*warmup tasks:
    1. write a java program that accepts three numbers and return the maximum number
    2. write a java program that accepts three numbers and return the minimum number
    3. write a java program that accepts three numbers and return the medium number
                (assume that none of them are equal)
 */
public class MaxMedMin {
    public static void main(String[] args) {
        double a = 100;
        double b = 50;
        double c = 250;
        if(a>b && a>c){System.out.println(a);}
        if(b>c&&b>a){System.out.println(b);}
        if(c>a||c>b){ System.out.println(c);}

}
}













