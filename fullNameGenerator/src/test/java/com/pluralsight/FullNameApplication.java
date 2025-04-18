package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        String firstName = input.nextLine();

        System.out.println(" "); // Breathing room

        System.out.println("Please enter your middle name: ");
        String middleName = input.nextLine();

        System.out.println(" "); // Breathing room

        System.out.println("Please enter your last name: ");
        String lastName = input.nextLine();

        System.out.println(" "); // Breathing room

        System.out.println("Please enter your suffix: ");
        String suffix = input.nextLine();

        System.out.println(" "); // Breathing room

        // Build full name

        String fullName = firstName;

        if (!middleName.isEmpty()) {
            fullName += " " + middleName; // Change from fullName = fullName + " " + middleName;
        }

        fullName += " " + lastName;

        if (!suffix.isEmpty()){
            fullName += "," +" " + suffix;
        }



        System.out.println(fullName);



    }


}
