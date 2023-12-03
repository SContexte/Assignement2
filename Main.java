import java.math.BigDecimal;
import java.util.NoSuchElementException;


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("***** Welcome to the Currency Exchange Rate Calculator ***** \n\nPlease select an option \n\n1.Display Euro to GBP Exchange Rate\n\n2.Display GBP to Euro Exchange Rate\n\n3.Convert Euros to GBP \n\n4.Convert GBP to Euros\n\n5.Exit\n");
        Scanner myOption = new Scanner(System.in); // Create a Scanner object

        System.out.println("Enter your option number:");
        int option = myOption.nextInt();//Create the first input for the option

        if (option == 1) {
            System.out.println("The Euro to GBP Exchange rate is €1 = £ 0.87");} // Option1 to display the exchange rate of Euro to GPB
        else if (option == 2) {System.out.println("The GBP to Euro Exchange rate is £1 = €1.15");} // Option2 to display the exchange rate of GBP to Euro
        else if (option == 3) {System.out.println("Enter the number in Euro that you want converted to GBP");
            double number = myOption.nextDouble(); //Asking for output for the number to be converted
            while(number < 0){System.out.println("You have entered invalid information, please try again");
                number = myOption.nextDouble();}
            System.out.println("€"+number+" in £ is "+number*0.87+ " £");
                }
        else if (option == 4) {System.out.println("Enter the number in GBP that you want converted to Euro");
            BigDecimal number = myOption.nextBigDecimal();
            while(number.compareTo(BigDecimal.ZERO) < 0){
            {System.out.println("You have entered invalid information, please try again");
                number = myOption.nextBigDecimal();}}
            BigDecimal result = number.multiply(new BigDecimal("1.15"));
            System.out.println("£"+number+" in Euro is "+ result + "€");
        }

        else if (option == 5){System.out.println("You're closing the program");
        }

        else {while(option !=1 && option !=2 && option !=3 && option !=4 && option !=5){
            System.out.println("You have entered invalid information, please try again");
            option = myOption.nextInt();}
        }
    }
}