package com.Rocket;

public class Addsubmuldiv {

    public static void main(String[] args) {
        // write your code here
        byte numberA = 75;
        byte numberB = 74;
        int sum;
        int diff;
        int mul;
        float div;
        sum = numberA + numberB;
        diff = numberA - numberB;
        mul = numberA * numberB;
        div = numberA / numberB;

        System.out.println("The sum of "+numberA+ " and "+numberB+" is : "+sum);
        System.out.println("The difference between "+numberA+ " and "+numberB+" is : "+diff);
        System.out.println("The product of "+numberA+ " and "+numberB+" is : "+mul);
        System.out.println("The quotient of "+numberA+ " and "+numberB+" is : "+div);

    }
}