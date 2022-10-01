package com.Rocket;

import java.util.Scanner;

public class PhLevelAnalyser {

    public static void main(String[] args) {
        float phValue;
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter the pH value:");
        phValue = scannerObj.nextFloat();
        if (phValue <7) {
            System.out.println("pH value is low, partial water change required.");
        } else if (phValue >= 7 && phValue <= 8) {
            System.out.println("pH value is fine");
        } else {
            System.out.println("pH value is high, partial water change is required");
        }
    }
}
