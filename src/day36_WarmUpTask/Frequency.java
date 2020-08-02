package day36_WarmUpTask;

import java.util.ArrayList;
import java.util.Collections;

/*
Task:
		2. write a program that can find the frequency of character from a String
				DO NOT use nested loop

				"AABBCCDDEE"  ==> "ABCDE"
				output: A2B2C2D2E2
 */
public class Frequency {
    public static void main(String[] args) {
         //task 02
        ArrayList<Character> ch = new ArrayList<>();
        ch.add('A');
        ch.add('A');
        ch.add('B');
        ch.add('B');
        ch.add('C');
        ch.add('C');
        ch.add('D');
        ch.add('D');
        ch.add('E');
        ch.add('E');

        System.out.println(ch);

        ArrayList<Character> nonDup = new ArrayList<>();

        for(Character each : ch){
            if( !nonDup.contains(each) ){
                nonDup.add(each);
            }
        }
        for(Character each : nonDup){
            int count = Collections.frequency(ch,each);
            System.out.print(""+each+count);

        }
    }
}
