package com.pluralsight;

public class Dice {
    public int roll(){
        int minValue = 1;
        int maxValue = 6;

        int rando = (int) (Math.random() * maxValue) + minValue;
            return rando;
        }
    }

