package day12_WarmUpTasks;
/*
1. write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
        ex:
            month = 3
        output:
            31 days
            month = 4
        output:
            30 days
            month = 13
        output:
            Invalid month
        HINT:
            28 days: 2
            30 days: 4,6,9,11
            31 days: 1,3,5,7,8,10,12 */
public class DaysInAMonth {
    public static void main(String[] args) {
        int month = 4;
        String day = "";
        if (month==2){
            day= "28 days";
        } else if (month==4||month==6||month==9||month==11){
            day="30 days";
        }else if(month==1||month==3||month==5||month==7||month==7||month==8||month==12){
            day="31 days";
        }else {
            day="Invalid month";
        }
        System.out.println(day);


    }
}
