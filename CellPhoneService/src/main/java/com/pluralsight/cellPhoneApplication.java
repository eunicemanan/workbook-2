package com.pluralsight;

import java.security.cert.CollectionCertStoreParameters;
import java.util.Scanner;

public class cellPhoneApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Set values! Make this up! (I wrote this)
        int serialNumbers = Celly.setSerialNumbers(2345678);
        String model = Celly.setModel("Iphone 15+");
        String carrier = Celly.setCarrier("Verizon");
        String phoneNumber = Celly.setPhoneNumber("803-324-1234");
        String owner = Celly.setOwner("Eunice Manan");

        //Display info
        System.out.println("Serial Number: " + serialNumbers);
        System.out.println("Model: " + model);
        System.out.println("Carrier: " + carrier);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Owner: " + owner);
    }
}
