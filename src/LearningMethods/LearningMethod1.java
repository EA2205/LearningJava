package LearningMethods;

public class LearningMethod1 {

    public static void main(String[] args) {
        methodOne(2,3);
        System.out.println(methodOne(2,3));

    }

    public static int methodOne(int a, int b)
    {
        int c;
        System.out.println("calling method one");
        return c = a+b;
    }
}
