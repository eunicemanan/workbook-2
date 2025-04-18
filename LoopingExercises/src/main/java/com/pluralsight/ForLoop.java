package com.pluralsight;

import jdk.jshell.spi.ExecutionControl;

public class ForLoop {
    public static void main(String[] args) throws ExecutionControl.InternalException, InterruptedException {
        //initialize; conditon; increment
        for (int count = 10 ;count >=1; count--) {
            System.out.println(count);
            Thread.sleep(500);
        }
        System.out.println("YEEEEEET!!");

    }
}
