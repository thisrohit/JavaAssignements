package JavaApp;

import javax.sound.midi.Soundbank;
@FunctionalInterface
interface MyFunctionalInterface{
    void FunctionalMethod1();
//    void meth2(); not allowed
    static void meth3(){
        System.out.println("Static methods are allowed inside functional interface and can have body");
    }
    default void meth4() {
        System.out.println("Default methods are also allowed inside functional interface");
    }
}

class MyFuctionalInterfaceClass implements MyFunctionalInterface {

    @Override
    public void FunctionalMethod1() {
        System.out.println("FunctionalMethod implementation inside the class overridden method");
    }
}


//interface can have n number of abstract method, methods must be public and abstract
interface MyInterface{
    void meth1();
    void meth2();
    void meth3();
}

class MyClass implements MyInterface{

    @Override
    public void meth1() {
        System.out.println("Hello Meth1");
    }

    @Override
    public void meth2() {
        System.out.println("Hello Meth2");
    }

    @Override
    public void meth3() {
        System.out.println("Hello Meth3");
    }

    public void meth4(){
        System.out.println("Hello extra meth4");
    }
}


public class MainClass {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.meth1();
        myClass.meth2();

        MyInterface myInterface = new MyClass();
        myInterface.meth3();
    }
}
