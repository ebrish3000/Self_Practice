package practice1_variables;

public class EmployeeInfo {
    public static void main(String[] args) {

            //firstName, lastName, gender, age, companyName, jobTitle, isFullTime, isMarried, salary
            String firstName = "Ebrahim";
            String lastName = "Emam";
            int age = 30;
            String companyName = "Amazon";
            char gender = 'M';
            String jobTitle = "SDET";
            boolean isFullTime = true;
            boolean isMarried = false;
            double salary = 120_000.50;

            System.out.println("Employee's full name is: " + firstName+" " + lastName);
            System.out.println( firstName+" " + lastName + "'s gender is: " + gender );
            System.out.println( firstName+" " + lastName +"'s age is: " + age + "years old" );
            System.out.println(firstName+" " + lastName + " works at: "+companyName );
            System.out.println(firstName+" " + lastName +"'s job title is: " + jobTitle);
            System.out.println(firstName+" " + lastName+"'s salary is: $"+ salary);
            System.out.println( firstName+" " + lastName +" is full time employee: "+ isFullTime);
            System.out.println( firstName+" " + lastName +" is married: " + isMarried);




        }







    }
