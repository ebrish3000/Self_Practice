package day36_WarmUpTask;

import java.util.ArrayList;

/*
1. write a program that can set the last element of the Integer arraylist to zero
            ex:
                list = [1,2,3,4,5];
                output: [1,2,3,4,0];
 */
public class LastToZero {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(15);
        list.add(90);
        list.add(50);
        list.add(95);

        list.set(list.size() - 1, 0);
        System.out.println(list);



    }
}
