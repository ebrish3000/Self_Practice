package day23_WarmUpTasks;
/*
write a prgram that can return the frequency of every single characters from the string:
            ex:   str1 = "aabbccaa";
                  output: a4b2c2
                HINT:    easier approach:
                            1. remove duplicates ==> str2 = "abc"
                            2. then find each of str2' character' frequency in str1 ==> 4, 2, 2
                            3. result: a4b2c2
       previous section we leaned how to find the frequency of one character. you will need to repeat the same steps */
public class Task_3 {
    public static void main(String[] args) {

        String str1 = "aabbccaa";

        String wordResult = "";
        for (int i = 0; i<= str1.length()-1; i++){
            String alif = "" + str1.charAt(i);

            if(!wordResult.contains(alif) ){
                wordResult+=alif;
            }


        }

        System.out.println(wordResult);

    }
}
