package day13_WarmUpTask;
/*         6. write a program that can display the selected browser
            1.1  declare a String variable called browserName
            1.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            1.3. if the browser name does not match with the valid browsers' names,
                    out put should be: Invalid Browser Name
        Do Not use: scanner, if statement, and ternary*/
public class DisplayBrowser {
    public static void main(String[] args) {
        String browserName = "Chrome";
        switch (browserName){
            case "chrome":
            case "Chrome":
            case "CHROME":
                System.out.println("Chrome");
                break;
            case "firefox":
            case "Firefox":
            case "FIREFOX":
                System.out.println("Firefox");
                break;
            case "opera":
                System.out.println("Opera");
                break;
            case "safari":
                System.out.println("Safari");
                break;
            case "edge":
                System.out.println("Edge");
                break;
            default:
                System.out.println("Invalid Browser Name");
        }




    }
}
