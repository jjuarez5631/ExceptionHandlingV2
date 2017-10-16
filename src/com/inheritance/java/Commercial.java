package com.inheritance.java;

import java.text.NumberFormat;

public class Commercial extends Customer{


    public Commercial(String name, String number, String address, double footage, boolean discount) {
            //display customer information after information is gathered
        System.out.println(name);
        System.out.println(number);
        System.out.println(address);
        System.out.println(footage + " square feet.");
            //sets the information to variables in the super class
        setSquareFootage(footage);
        setDiscount(discount);
    }


    public void calculateChanges() {
        double totalCharges;   //variables to store total charges
        double totalDiscount;
        String finalCharges;
            //total charges will be calculated
        totalCharges = (squareFootage / 1000) * 5;

        if (discount == true) {     //for customers with multi properties
            totalDiscount = totalCharges* .10;
            totalCharges = totalCharges - totalDiscount;
            System.out.println("You will receive a 10% discount!");
        }

        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setGroupingUsed(true);
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);
        //unformatted totalCost will be added to the formatted totalOut
        finalCharges = nf.format(totalCharges);

            //display total charges
        System.out.println("\nYour charges are: $" + finalCharges + " per week.");
    }
}
