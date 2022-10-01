package com.Rocket;

import java.util.Scanner;

public class AreaCalculator2 {
    public static void main(String[] args) {
        byte thisSavesShapeValue;
        double toCalculateAreaOfTheSquare;
        double toCalculateAreaOfTheRectangle;
        double varToCalculateAreaOfTheCircle;

        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Press 1 to calculate the area of the Square part");
        System.out.println("Press 2 to calculate the area of the Rectangular part");
        System.out.println("Press 3 to calculate the area of the Circular part");
        thisSavesShapeValue = scannerObj.nextByte();
        AreaCalculator2 areaCalculatorObj = new AreaCalculator2();

        switch (thisSavesShapeValue) {

            case 1:
                toCalculateAreaOfTheSquare = areaCalculatorObj.calculateAreaOfSquare(20);
                System.out.println("The area of the square is " +toCalculateAreaOfTheSquare);
                break;
            case 2:
                toCalculateAreaOfTheRectangle = areaCalculatorObj.calculateAreaOfRectangle(20,15);
                System.out.println("The area of the rectangle is " +toCalculateAreaOfTheRectangle);
                break;
            case 3:
                varToCalculateAreaOfTheCircle = areaCalculatorObj.calculateAreaOfCircle(20);
                System.out.println("The area of the circle is " +varToCalculateAreaOfTheCircle);
                break;
        }
    }

     public double calculateAreaOfSquare(double side)
        {
            double theAreaOfSquare = side * side;
            return theAreaOfSquare;
        }

    public double calculateAreaOfRectangle(double length, double breadth)
    {
        double theAreaOfRectangle = length * breadth;
        return theAreaOfRectangle;
    }

    public double calculateAreaOfCircle(double radius)
    {
        double theAreaOfCircle = 3.14*radius*radius;
        return theAreaOfCircle;
    }

    }
