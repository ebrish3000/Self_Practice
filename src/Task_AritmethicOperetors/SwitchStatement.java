package Task_AritmethicOperetors;

public class SwitchStatement {
    public static void main(String[] args) {
        int n = 1;
        String nameOfTheDay = "";
        switch (n){
            case 1: case 4:
                nameOfTheDay = "Monday";
                nameOfTheDay = "Thursday";
                break;
            case 2:
                nameOfTheDay = "Tuesday";
                break;
            case 3:
                nameOfTheDay = "Wednesday";
                break;
            default:
                nameOfTheDay = "Not found";

        }
        System.out.println(nameOfTheDay);


    }
}
