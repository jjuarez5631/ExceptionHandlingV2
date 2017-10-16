package com.inheritance.java;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int userChoice; //input variable

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("\n1. Commercial" + "\n2. Residential" + "\n3. Done");   //display options

            System.out.println("\nPlease choose from the available options: " );

            userChoice = input.nextInt();   //users input

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
                    System.out.println("Have a nice day!");
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
        String name = scanner.nextLine();
        System.out.println("Please enter your phone number: ");
        String number = scanner.nextLine();
        System.out.println("Please enter your address: ");
        String address = scanner.nextLine();
        System.out.println("Please enter the square footage of the property: ");
        String foot = scanner.nextLine();
        double footage = Double.parseDouble(foot);
        System.out.println("Enter true if there is a Multi-Property discount.");
        boolean discount = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("");

        Commercial cust = new Commercial(name, number, address, footage, discount); //calls the sub calls

        cust.calculateChanges();    //calls the method in sub class to calculate weekly charges
    }
            //method for residential customers
    private static void residential() {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter your phone number: ");
        String number = scanner.nextLine();
        System.out.println("Please enter your address: ");
        String address = scanner.nextLine();
        System.out.println("Please enter the square footage of the property: ");
        String foot = scanner.nextLine();
        double footage = Double.parseDouble(foot);
        System.out.println("Enter true for a senior discount.");
        boolean discount = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("");

        Residential cust = new Residential(name, number, address, footage, discount); //calls for the sub class

        cust.calculateChanges();       //calls the method in sub class to calculate weekly charges
    }
}



