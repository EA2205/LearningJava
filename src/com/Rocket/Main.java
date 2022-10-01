package com.Rocket;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello Einston ; you are a Java developer now :)");
        System.out.println("you are doing a great job !");
        int numberA = 74;
        int numberB = 75;
        int numberC ;
        numberC = numberA + numberB ;
        System.out.println(numberA + numberB);
        System.out.println(numberC);

        Scanner input = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int numberD = input.nextInt();
        System.out.println("Input the second number: ");
        int numberE = input.nextInt();
        int sum = numberD + numberE;
        System.out.println("Sum is:" +sum);

    }
}
