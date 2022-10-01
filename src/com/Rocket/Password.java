package com.Rocket;

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {

        String userId;
        String password;
        System.out.println("Enter your Userid:");
        System.out.println("Enter your password:");
        Scanner scannerObj=new Scanner(System.in);
        userId=scannerObj.next();
        password=scannerObj.next();
        System.out.println(userId);
    }
}
