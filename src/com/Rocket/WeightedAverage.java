package com.Rocket;

import java.util.Scanner;

public class WeightedAverage {

    public static void main(String[] args) {


        Scanner scannerObj=new Scanner(System.in);
        System.out.println("Enter the assignmentWeight value: ");
        int assignmentWeight=scannerObj.nextInt();
        System.out.println("Enter the assignmentScore value: ");
        int assignmentScore=scannerObj.nextInt();
        System.out.println("Enter the projectWeight value: ");
        int projectWeight=scannerObj.nextInt();
        System.out.println("Enter the projectScore value: ");
        int projectScore=scannerObj.nextInt();
        System.out.println("Enter the quizWeight value: ");
        int quizWeight=scannerObj.nextInt();
        System.out.println("Enter the quizScore value: ");
        int quizScore=scannerObj.nextInt();
        System.out.println("Enter the midTermWeight value: ");
        int midTermWeight=scannerObj.nextInt();
        System.out.println("Enter the midTermScore value: ");
        int midTermScore=scannerObj.nextInt();
        System.out.println("Enter the finalExamWeight value: ");
        int finalExamWeight=scannerObj.nextInt();
        System.out.println("Enter the finalExamScore value: ");
        int finalExamScore=scannerObj.nextInt();
        float assignmentPercentageScore=calculateAssignmentPercentageScore(assignmentWeight, assignmentScore);
        float projectPercentageScore=calculateProjectPercentageScore(projectWeight, projectScore);
        float quizPercentageScore=calculateQuizPercentageScore(quizWeight, quizScore);
        float midTermPercentageScore=calculateMidTermPercentageScore(midTermWeight, midTermScore);
        float finalExamPercentageScore=calculateFinalExamPercentageScore(finalExamWeight, finalExamScore);
        float weightedAverageScore=assignmentPercentageScore+projectPercentageScore+quizPercentageScore+midTermPercentageScore+finalExamPercentageScore;

        System.out.println("Weight"+"\t\t"+"%Value of Score");
        System.out.println("Assignments"+"\t"+ assignmentPercentageScore);
        System.out.println("Projects"+"\t"+ projectPercentageScore);
        System.out.println("Quizzes"+"\t\t"+ quizPercentageScore);
        System.out.println("Mid term"+"\t"+ midTermPercentageScore);
        System.out.println("Final exam"+"\t"+ finalExamPercentageScore);
        System.out.println("\n");
        System.out.println("The weighted average score is "+ weightedAverageScore +"%" );
    }

    public static float calculateAssignmentPercentageScore(int assignmentWeight, int assignmentScore )
    {
        float assignmentPercentageScore=(assignmentWeight/100.0f) * assignmentScore;
        return assignmentPercentageScore;
    }

    public static float calculateProjectPercentageScore(int projectWeight, int projectScore)

    {
        float projectPercentageScore=(projectWeight/100.0f) * projectScore;
        return projectPercentageScore;
    }

    public static float calculateQuizPercentageScore(int quizWeight, int quizScore)

    {
        float quizPercentageScore=(quizWeight/100.0f) * quizScore;
        return quizPercentageScore;
    }

    public static float calculateMidTermPercentageScore(int midTermWeight, int midTermScore)

    {
        float midTermPercentageScore=(midTermWeight/100.0f) * midTermScore;
        return midTermPercentageScore;
    }

    public static float calculateFinalExamPercentageScore(int finalExamWeight, int finalExamScore)

    {
        float finalExamPercentageScore=(finalExamWeight/100.0f) * finalExamScore;
        return finalExamPercentageScore;
    }
}
