package MulltiLevelInheritance;

public class A {
    int a=50;
}

class B extends A
{
    int b=30;

}

class C extends B {
    void add() {
        System.out.println(a + b);

    }
}

class Demo
{
    public static void main(String[] args) {
        C obj = new C();
        obj.add();
    }
}