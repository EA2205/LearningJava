package com.Rocket;

public class MaxOfArray {

    public static void main(String[] args) {

        int marks[]={1,34,56,23,44};
        MaxOfArray maxOfArrayObj=new MaxOfArray();
        int maxNo= maxOfArrayObj.findMaxOfArray(marks,marks.length);
        System.out.println("The max of Number is " +maxNo);
    }

    public int findMaxOfArray(int m[], int len)
    {
        if (len==1)

        {
            return m[0];
        }

        return Math.max(m[len-1],findMaxOfArray(m,len-1));
    }
}
