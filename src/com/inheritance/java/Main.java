package com.inheritance.java;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int userChoice; //input variable

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("\n1. Commercial" + "\n2. Residential" + "\n3. Done");   //display options

            System.out.println("\nPlease choose from the available options: " );

            try {
                userChoice = input.nextInt();   //users input
            } catch (InputMismatchException e) {
                //e.printStackTrace();
                System.out.println("Invalid input type. Use numbers!");
                userChoice = 3;
            }

            switch (userChoice) {   //switch statement for type of customer
                case 1:
                    System.out.println("Commercial Customer");
                    commercial();
                    break;
                case 2:
                    System.out.println("Residential");
                    residential();
                    break;
                case 3:
                    System.out.println("Have a nice day! Program will now terminate.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Option! Please choose again.");
            }
        }while (userChoice > 3 || userChoice < 1);
    }

        //method for commercial customers
    private static void commercial() {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Please enter your name: ");
        String name = null;
        try {
            name = scanner.nextLine();
        } catch (Exception e) {     //validate input to prevent exception runtime
            //e.printStackTrace();
            System.out.println("Invalid Entry");
        }

        System.out.println("Please enter your phone number: ");
        String number = null;
        try {
            number = scanner.nextLine();
        } catch (Exception e) {     //validate input to prevent exception runtime
            //e.printStackTrace();
            System.out.println("Invalid Entry");
        }

        System.out.println("Please enter your address: ");
        String address = null;
        try {
            address = scanner.nextLine();
        } catch (Exception e) {     //validate input to prevent exception runtime
            //e.printStackTrace();
            System.out.println("Invalid Entry");
        }

        System.out.println("Please enter the square footage of the property: ");
        String foot = "null";
        try {
            foot = scanner.nextLine();
            double footage = Double.parseDouble(foot);
        } catch (NumberFormatException e) {     //validate input to prevent exception runtime
            System.out.println("Invalid entry type!");
            System.exit(0);
            //e.printStackTrace();
        }
        double footage = Double.parseDouble(foot);

        boolean discount = true;
        System.out.println("Enter true if there is a Multi-Property discount.");
        try {
            discount = Boolean.parseBoolean(scanner.nextLine());
        } catch (Exception e) {     //validate input to prevent exception runtime
            //e.printStackTrace();
            System.out.println("Invalid Entry");
        }


        if (discount != true && discount != false){
            discount = false; //default if input isn't valid choice.
        }

        Commercial cust = new Commercial(name, number, address, footage, discount); //calls the sub calls

        cust.calculateChanges();    //calls the method in sub class to calculate weekly charges
    }


            //method for residential customers
    private static void residential() {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Please enter your name: ");
        String name = null;
        try {
            name = scanner.nextLine();
        } catch (Exception e) {     //validate input to prevent exception runtime
            //e.printStackTrace();
            System.out.println("Invalid Entry");
        }

        System.out.println("Please enter your phone number: ");
        String number = null;
        try {
            number = scanner.nextLine();
        } catch (Exception e) {     //validate input to prevent exception runtime
            //e.printStackTrace();
            System.out.println("Invalid Entry");
        }

        System.out.println("Please enter your address: ");
        String address = null;
        try {
            address = scanner.nextLine();
        } catch (Exception e) {     //validate input to prevent exception runtime
            //e.printStackTrace();
            System.out.println("Invalid Entry");
        }

        System.out.println("Please enter the square footage of the property: ");
        String foot = null;
        try {
            foot = scanner.nextLine();
            double footage = Double.parseDouble(foot);
        } catch (NumberFormatException e) {     //validate input to prevent exception runtime
            //e.printStackTrace();
            System.out.println("Invalid Entry");
            System.exit(0); //exit program to prevent errors in the calculations
        }
        double footage = Double.parseDouble(foot);

        System.out.println("Enter true for a senior discount.");
        boolean discount = false;
        try {
            discount = Boolean.parseBoolean(scanner.nextLine());
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Invalid Entry");
            System.exit(0); //exit program to prevent errors in the calculations
        }

        if (discount != true && discount != false){
            discount = false; //default if input isn't valid choice.
        }

        Residential cust = new Residential(name, number, address, footage, discount); //calls for the sub class

        cust.calculateChanges();       //calls the method in sub class to calculate weekly charges
    }
}



