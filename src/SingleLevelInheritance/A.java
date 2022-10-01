package SingleLevelInheritance;

public class A { //super class

    int i=10;
}

class B extends A { //sub class
    void display()
    {
        System.out.println(i);
    }
}

class Demo
{
    public static void main(String[] args) {
        B obj=new B();
        obj.display();
    }
}