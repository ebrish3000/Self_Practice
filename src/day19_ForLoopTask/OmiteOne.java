package day19_ForLoopTask;
import java.util.Scanner;
/*    String reversedStr = "";
        for(int i = str.length()-1; i >= 0; i-- ){
            reversedStr += str.charAt(i);
          //  reversedStr += str.substring(i, i+1);
           Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");
        String str = scan.nextLine();

        String reversedStr = "";

        for(int i = str.length()-1; i >= 0; i-- ){
            reversedStr += str.charAt(i);
          //  reversedStr += str.substring(i, i+1);

        }

        System.out.println(reversedStr);

       System.out.println( str.equalsIgnoreCase(reversedStr) );

*/
public class OmiteOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = scan.nextLine();
        String word1 = "";

        for (int i = 0; i<=word.length()-1; i++){
            word1 += "" +word.charAt(i);


            }
        System.out.print(word1);
        }





    }

