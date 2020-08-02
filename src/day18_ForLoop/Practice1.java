package day18_ForLoop;
/*   tasks:
            1. write a program that can print all even numbers between 0 ~ 1000
            2. write a program that can print all odd numbers between 0 ~ 1000
            3. write a program that can print a~z
            4. write a program that can print A~Z   */
public class Practice1 {
    public static void main(String[] args) {

        for (int i = 1; i<= 100; i+=2) {
            System.out.println(i + " ");

        }
        char c=65;

        for(c = 65; c <= 90; c++) {
            System.out.print(c + " ");
        }

    }
}
