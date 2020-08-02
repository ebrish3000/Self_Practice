package day19_ForLoopTask;
/*
 2.  print the following shape:
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
    3. print the following shape:
                    * * * * * *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    * * * * * *
            Hint: in the loop body , only place the statements that you need to repeat

 */
public class DrawRectangle {
    public static void main(String[] args) {

        for (int i = 0; i<5; i++){
            for (int j = 0; j<5; j++){
               if (i== 0 || i== 4|| j==0||j==4){
                   System.out.print("*");
               }else{
                   System.out.print(" ");
               }


            }
            System.out.println();
        }


    }
}
