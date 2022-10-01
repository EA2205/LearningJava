package com.Rocket;

import java.util.Scanner;

public class PhLevelAnalyserUsingFn {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Enter the pH value:");
        float phValue = scannerObj.nextFloat();
        String returnPhLevelString=validatePhLevel(phValue);
        System.out.println(returnPhLevelString);
    }

    public static String validatePhLevel(float phValue)
    {
        if (phValue <7) {
            return "pH value is low, partial water change required.";
        }
        else if (phValue >= 7 && phValue <= 8) {
            String returnPhLevelString ="pH value is fine";
            return returnPhLevelString;
        }
        else
        {
            String returnPhLevelString ="pH value is high";
            return returnPhLevelString;
        }

    }
}
