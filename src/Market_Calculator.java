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
    public static void market(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Jimmy John's\nWhat would you like?");

        char option;

        do{
            // prompt the user for a choice
            System.out.println("(H)am");
            System.out.println("(R)oast beef");
            System.out.println("(S)alami");
            System.out.println("(T)una");
            System.out.println("(D)one");
            System.out.println("(Q)uit");

            // Get the user input
            String choice = input.next();
            // Store the first letter in a char
            option = choice.charAt(0);
            switch(option){

            }


        }while(option != 'D' || option != 'Q');
        System.out.println("Thank you for choosing Jimmy Johns");
    }


}
