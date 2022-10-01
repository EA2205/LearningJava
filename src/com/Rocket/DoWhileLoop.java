package com.Rocket;

public class DoWhileLoop {
    public static void main(String[] args) {
        byte i = 5;
        do {
            for (byte j=8;j<= 9;j++)
            {
                System.out.println("The value of i, j is" +i + " " +j);
            }
        i++;
        } while (i <= 7);
    }
}
