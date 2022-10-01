package com.Rocket;

public class WhileLoop {

    public static void main(String[] args) {

        byte i = 5;
        while (i <= 7) {
            byte j = 8;
            while (j <= 9) {
                System.out.println("The value of i, j is " + i +" " + j);
                j++;
            }
            i++;
        }
    }
}
