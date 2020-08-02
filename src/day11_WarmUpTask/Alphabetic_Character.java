package day11_WarmUpTask;
/*
write a program that can identify if the given character character is Alphabetic
            ex: character = 'a'  output: a is an Alphabetic
                character  = '!' output:  ! is not  anAlphabetic
        Hint: ascii table:
                        65 ~ 90 ==> A~Z
                        97 ~ 122 ==> a~z */
public class Alphabetic_Character {
    public static void main(String[] args) {
        char x = 96;
        boolean Alphabetic = x>=65&&x<=90;
        boolean alphabetic = x>=97&&x<=122;

        if (alphabetic|| Alphabetic){
            System.out.println(x +" is an alphabetic");}
        else {
            System.out.println(x+ " is not an alphabetic");}

    }
}
