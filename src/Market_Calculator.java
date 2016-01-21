import java.util.Scanner;

/**
 * Created by mjone121 on 1/21/2016.
 */
public class Market_Calculator {


    /*
    * Program to simulate ordering sandwiches at Jimmy John's
    * CIS 150
    * Merven Jones
    * 21Jan16
     */
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Jimmy John's\nWhat would you like?");

        char option;
        double price;

        do{
            // prompt the user for a choice
            System.out.println("(H)am");
            System.out.println("(R)oast beef");
            System.out.println("(S)alami");
            System.out.println("(T)una");
            System.out.println("(D)one");
            System.out.println("(Q)uit");
            System.out.print("Enter your choice: ");

            // Get the user input and convert to upper case
            String choice = input.next();
            choice = choice.toUpperCase();

            // Store the first letter in a char
            option = choice.charAt(0);

            switch(option){
                case 'P' : price = 3.00; break; // Plain
                case 'H' : price = 6.50; break; // Ham
                case 'R' : price = 6.75; break; // Roast beef
                case 'S' : price = 6.50; break; // Salami
                case 'T' : price = 5.50; break; // Tuna
                case 'V' : price = 4.50; break; // Veggie
                case 'F' : price = 4.50; break; // Fruit
                case 'C' : price = 5.50; break; // Chicken
                case 'X' : price = 7.50; break; // Extravaganza
                case 'D' : price = 0; break;
                default:
                    System.out.println("Item " + choice + " is not avaliable at Jimmy Johns");
                    price = 0;
            }

            if (price != 0) {
                System.out.println("Your choice " + choice);
                System.out.printf("cost %.2f\n", price);
            }


        }while(option != 'D' && option != 'Q');
        System.out.println("Thank you for choosing Jimmy Johns");
    }


}
