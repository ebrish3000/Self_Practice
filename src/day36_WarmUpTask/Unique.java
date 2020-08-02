package day36_WarmUpTask;

import java.util.ArrayList;
import java.util.Collections;

/*
1. write a program that can find the unique characters from a string
				DO NOT use nested loop

				"ABABCDEE"
				output: C D
 */
public class Unique {
    public static void main(String[] args) {
           // task 01
        ArrayList<Character> ch1 = new ArrayList<>();

        String str = "HAJARDANIAEBRAHIMSAMIRA";
        for (int i = 0; i < str.length(); i++) {
            ch1.add(str.charAt(i));
        }
        ArrayList<Character> uniques = new ArrayList<>();

        for (Character each : ch1) {
            int count = Collections.frequency(ch1, each);
            if (count == 1) {
                uniques.add(each);
            }
        }
        System.out.println(uniques);

    }
}
