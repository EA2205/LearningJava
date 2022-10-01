package com.Rocket;

import java.util.Scanner;

public class GetNameFromUser {

    public static void main(String[] args) {

        String getName;
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter the name:");
        getName=s.nextLine();
        System.out.println("The name you entered is " +getName);
        System.out.println("Thank you");
    }
}
