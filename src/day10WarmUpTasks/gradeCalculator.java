package day10WarmUpTasks;
/*
Task02:
    write a program that can calculate the grade.
        1. if grade is bigger then 90 output "Excellent"
        2. if the grade is bigger then 70 and smaller then 90 output "Good"
        3. if grade is bigger then 60 and smaller then 70 output "Pass"
        4. if grade is smaller then 60 output "Fail"
        ex: score = 75
            output:
                Good
        HINT: you will need && logic
 */
public class gradeCalculator {
    public static void main(String[] args) {
        double grade = 69;
        if(grade>= 90){
            System.out.println("Excellent");
        }
        if(grade<90 && grade>=70){
            System.out.println("Good");
        }
        if (grade<70 && grade>= 60){
            System.out.println("Pass");}
        if(grade<60){
            System.out.println("Fail");
        }
/*
Task03:
    Write a program that can calcuate the grade based on the score
        if score is between 90 to 100 ==> A
        if score is between 80 to 90 ==> B
        if score is between 70 to 80 ==> C
        if score is between 60 to 70 ==> D
        if score is below 60 ==> F
        Ex: score = 85;
            output:
                Your grade is B

 */
        if(grade>= 90){
            System.out.println("A");
        }
        if(grade< 90 && grade>=80){
            System.out.println("B");
        }
        if(grade<80 && grade>=70){
            System.out.println("C");
        }
        if (grade<70 && grade>= 60){
            System.out.println("D");}
        if(grade<60){
            System.out.println("F");
        }
    }
}
