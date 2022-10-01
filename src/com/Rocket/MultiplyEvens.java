package com.Rocket;

public class MultiplyEvens {

    public static void main(String[] args) {

        MultiplyEvens mEvenObj=new MultiplyEvens();
        int output=mEvenObj.multiplyEvens(10);
        System.out.println(output);
    }

    public int multiplyEvens (int num)
    {
        if (num<=1)
        {
            return 1;
        }

        if (num % 2 ==0)

        {
            return num*multiplyEvens(num-1);
        }

        else

        {
            return 1*multiplyEvens(num-1);
        }
    }
}
