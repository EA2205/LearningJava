package com.Rocket;

public class AddNumber {

    public static void main(String[] args) {

        int sum=0;

        for (int count=1;count<=100;count=count+1)
        {
            sum=sum+count;
        }
        System.out.println("The sum of 100 numbers is " +sum );
    }
}
