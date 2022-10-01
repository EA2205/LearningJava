package com.Rocket;

public class ArrayPracticeAddOddNumbers {

    public static void main(String[] args) {
        int sum = 0;
        int arrayVar[] = {22, 11, 9, 20,5,5};

        for (int i=0;i< arrayVar.length;i++)
        {
            if (arrayVar[i] % 2 != 0) {
                sum = sum + arrayVar[i];
            }
        }
        System.out.println("Print the sum is " + sum);
    }
}
