package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first, middle (if you have one obviously), and last name. ");
        String fullName = input.nextLine();

        int positionOfFirstSpace = fullName.indexOf(' '); // First name
        System.out.println(positionOfFirstSpace);
        int positionOfSecondSpace = fullName.lastIndexOf(' ');
        System.out.println(positionOfSecondSpace);

        String firstNameCut = "";
        String middleNameCut = "";
        String lastNameCut = "";

        if (positionOfFirstSpace == -1) {
            firstNameCut = fullName;
        } else {
            firstNameCut = fullName.substring(0, positionOfFirstSpace);
        }
        if (positionOfFirstSpace != positionOfSecondSpace) { // change positio
            middleNameCut = fullName.substring(positionOfFirstSpace + 1, positionOfSecondSpace);
            lastNameCut = fullName.substring(positionOfSecondSpace + 1);
        } else {
            lastNameCut = fullName.substring(positionOfFirstSpace + 1);
        }
        System.out.println("First to the scene: " + firstNameCut);

        if (!middleNameCut.isEmpty()) {
            System.out.println("Middle man: " + middleNameCut);
        }
        System.out.println("Last man standing: " + lastNameCut);
    }


}
