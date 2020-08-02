package day31_WarmUpTasks;

import java.util.Scanner;

/*
warmup tasks:
    1.  write a return method called frequency that accepts two parameters: string str and char ch,
    the method returns the frequency of the ch from the str as an int
            Ex:
                frequency("AAA", 'A') ==>  3
                frequency("ABAB", 'B') ==> 2
            Note: MUST use Arrays and for each loop
            please copy paste the method to the util class

 */
public class Frequency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String word = scan.next();
        System.out.print("Enter your character: ");
        char ch = scan.next().charAt(0);
        int result = frequency(word,ch);
        System.out.println(result);

    }

    public static int frequency(String str, char ch) {

        char[] word2 = str.toCharArray();
        int count = 0;
        for(char each:word2){
            if(each==ch){
                count++;
            }
        }
        return count;
    }

    /*
     use the above method to create another called uniques that accepts a string paramter and returns
     it's unique characters as String
            Ex:
                uniques("ABBC");       ==> "AC"
                uniques("Cybertek");   ==> "cybrtk"
                please copy paste the method to the util class

     */
    public static String uniques(String str) {
        String unique = "";
        char[] word2 = str.toCharArray();
        for(char each:word2){
            char ch = each;
            int count = frequency(str,ch);
            if (count==1){
                unique+=ch;
            }
        }
        return unique;


    }



    }
