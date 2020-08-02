package day13_WarmUpTask;

public class practiceForReview {
    public static void main(String[] args) {
       int cookies =10;
       String day = "tuesday";
       switch (day){
           case "s":
               cookies++;
           case "m":
               cookies +=5;
               break;
           case "tuesday":
           case "W":
               cookies+=10;
           case "th":
               cookies +=5;
               break;
           default:
               cookies =0;





       }
        System.out.println(cookies);


    }
}
