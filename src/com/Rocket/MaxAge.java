package com.Rocket;

public class MaxAge {
    public static void main(String[] args) {
        int age[]={23,34,33,24,25,99,26,31};
        MaxAge maxAgeObj=new MaxAge();
        maxAgeObj.getMaxAge(age);
    }

public void getMaxAge(int age[])
{
    int varA=0;
    for (int i=0;i<age.length;i++)
    {
        System.out.println(age[i]);
        if (varA < age[i]) {
            varA = age[i];
        }
    }
    System.out.println("the greatest of the numbers is " +varA);
}
}
