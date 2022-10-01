package com.Rocket;

import java.util.Scanner;
import static java.lang.Integer.reverse;

public class ReverseDigitDemo {

    public static void main(String[] args) {
        int valueEntered=0;
        int valueReversed=0;
        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter the number that has to be reversed:");
        valueEntered = scannerObj.nextInt();
        System.out.println("the number entered is " +valueEntered);
        valueReversed=reverse(valueEntered);
        System.out.println("the reverse number is " +valueReversed);
    }
}
