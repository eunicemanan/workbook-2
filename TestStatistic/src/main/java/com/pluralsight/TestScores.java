package com.pluralsight;

import java.util.Arrays;

public class TestScores {
    public static void main(String[] args) {
        int[] testScores = {89,77,97,93,71,54,78,89,92,67};
        Arrays.sort(testScores);
        //CALCULATE AVERAGE
        double sum = 0;
        for (int score: testScores){
            sum += score;
    }
        double average = sum / testScores.length;
        // FIND HIGH AND LOW SCORES
        int high = testScores[0];
        int low = testScores[0];
        for (int score : testScores){
        if (score > high) high = score;
        if (score < low) low = score;
        }
    System.out.println("Test scores: " + Arrays.toString(testScores));
    System.out.println("Average: " + average);
    System.out.println("Highest score: " + high);
    System.out.println("Lowest score: " + low);
    }

}