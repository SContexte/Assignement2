import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n = 5;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        String[] newCar = new String[n];

        System.out.println("""
                **********   \tWelcome to the Car Database Application  \t**********
                \s
                Please select one of the following:
                0.    Exit
                1.    Add a Car
                2.    Delete a Car
                3.    Display all Cars in Stock""");
        System.out.println("Enter your option number:");
        String option = sc.nextLine();
        //Create the first input for the option

        while (!Objects.equals(option, "0")) {

            if (Objects.equals(option, "1" ) && i < 5) {
                System.out.println("Please enter Car Make");
                newCar[i] = sc.nextLine();
                System.out.println("Please enter Model");
                newCar[i] = newCar[i] + "," + sc.nextLine();
                System.out.println("Please enter Year");
                newCar[i] = newCar[i] + "," + sc.nextLine();
                System.out.println("Please enter Value");
                newCar[i] = newCar[i] + "," + sc.nextLine() + " €";
                System.out.println("Please enter Status");
                newCar[i] = newCar[i] + "," + sc.nextLine();
                i++;
            } else if (Objects.equals(option, "2")&& i != 0) {
                newCar[i - 1] = null;
                System.out.println("You've deleted the last car entered");
                i--;

            } else if (Objects.equals(option, "3")) {
                System.out.println("Here is the list of the car entered:");
                for (int j = 0; j < n; j++)
                    if (newCar[j] != null) {
                        System.out.println("Car Make, Model, Year, Value, Status: ");
                        System.out.println(newCar[j]);
                    }


            } else {
                System.out.println("You have entered invalid information, Please Try Again!");
            }
            System.out.println("""

                    **********   \tWelcome to the Car Database Application  \t**********
                    \s
                    Please select one of the following:
                    0.    Exit
                    1.    Add a Car
                    2.    Delete a Car
                    3.    Display all Cars in Stock""");
            option = sc.nextLine();
        }
        System.out.println("EXIT");
    }
}
