package com.pluralsight;

import java.awt.*;
import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //USER INPUT
        System.out.println(" Enter full name: ");
        String fullName = input.nextLine();

        // BILLING ADDRESS INPUT
        System.out.println("Billing Street e.g (123 Main Street): "); // This is what the user sees
        String billingStreet = input.nextLine(); // This is how they type. billingStreet is important

        System.out.println("Billing City e.g (Middleton): ");
        String billingCity = input.nextLine();

        System.out.println("Billing State e.g (TX): ");
        String billingState = input.nextLine();

        System.out.println("Billing Zipcode e.g (75111): ");
        String billingZipcode = input.nextLine();


        // SHIPPING ADDRESS

        System.out.println("Shipping street e.g (456 Big Sky Blvd): ");
        String shippingStreet = input.nextLine();

        System.out.println("Shipping City ");
        String shippingCity = input.nextLine();

        System.out.println("Shipping State e.g (TX): ");
        String shippingState = input.nextLine();

        System.out.println("Shipping Zip e.g (75333): ");
        String shippingZipcode = input.nextLine();

        // Billing address strings using StringBuilder
        StringBuilder billingAddress = new StringBuilder();
        billingAddress.append(billingStreet).append("\n");
        billingAddress.append(billingCity).append(", ").append(billingState).append(" ").append(billingZipcode);

        System.out.println(("\n") + fullName);
        System.out.println(billingAddress + ("\n"));

        //Shipping address

        StringBuilder shippingAddress = new StringBuilder();
        shippingAddress.append(shippingStreet).append("\n");
        shippingAddress.append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZipcode);// Print the shipping address in the formal letter format
        System.out.println(shippingAddress);









    }
}
