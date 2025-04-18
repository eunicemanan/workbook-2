package com.pluralsight;

import com.sun.source.tree.ReturnTree;

public class Celly {

    //DATA
    private int serialNumbers = 0;
    private String model = "";
    private String carrier = "";
    private String phoneNumber = "";
    private String owner = "";

    //
    public Celly(int serialNumbers, String model, String carrier, String phoneNumber, String owner){
        this.serialNumbers = serialNumbers;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }
    public static int setSerialNumbers(int serialNumbers) {
        return serialNumbers;
    }
    public static String setModel(String model) {
        return model;
    }
    public static String setCarrier(String carrier) {
        return carrier;
    }
    public static String setPhoneNumber (String phoneNumber) {
        return phoneNumber;
    }
    public static String setOwner (String owner) {
        return owner;


}

}
