package com.Rocket;

import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        byte thisSavesShapeValue;
        float toCalculateAreaOfTheSquare;
        float toCalculateAreaOfTheTriangle;
        float toCalculateAreaOfTheRectangle;

        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Press 1 to calculate the area of the Square part");
        System.out.println("Press 2 to calculate the area of the Circular part");
        System.out.println("Press 3 to calculate the area of the rectangular part");
        thisSavesShapeValue=scannerObj.nextByte();

        switch (thisSavesShapeValue)
        {
            case 1:
                Scanner squareObj=new Scanner(System.in);
                System.out.println("Please enter the value of one of its side to calculate the area of the Square part");
                toCalculateAreaOfTheSquare= scannerObj.nextFloat();
                float areaOfTheSquare=toCalculateAreaOfTheSquare*toCalculateAreaOfTheSquare;
                System.out.println("The area of the Square part is :" +areaOfTheSquare);
                break;
            case 2:
                Scanner circleObj=new Scanner(System.in);
                System.out.println("Please enter the value of R to calculate the area of the triangular part");
                toCalculateAreaOfTheTriangle= circleObj.nextFloat();
                float areaOfTheTriangle=3.14f*toCalculateAreaOfTheTriangle*toCalculateAreaOfTheTriangle;
                System.out.println("The area of the Triangular part is :" +areaOfTheTriangle);
                break;
            case 3:
                Scanner rectangularLengthObj=new Scanner(System.in);
                System.out.println("Please enter the value of L to calculate the area of the rectangular part");
                float length=rectangularLengthObj.nextFloat();
                Scanner rectangularBreadthObj=new Scanner(System.in);
                System.out.println("Please enter the value of B to calculate the area of the rectangular part");
                float breadth=rectangularBreadthObj.nextFloat();
                float areaOfTheRectangle= length*breadth;
                System.out.println("The area of the rectangular part is :" +areaOfTheRectangle);
                break;
            default:
                System.out.println("Enter valid value. Thank you");
        }
        }
}
