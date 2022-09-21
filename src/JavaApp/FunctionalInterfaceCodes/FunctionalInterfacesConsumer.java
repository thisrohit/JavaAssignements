package JavaApp.FunctionalInterfaceCodes;

import java.util.function.Consumer;

class Student {
    private String name;
    private  String college;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}

public class FunctionalInterfacesConsumer {

//    consumer -> Accepts single value does processing and does not return anything, used for data modification
    public static void main(String[] args) {
        Student st = new Student();
        Consumer<Student> setCollege = (s)-> s.setCollege("IIT Guwahati");
        setCollege.accept(st);
        System.out.println(st.getCollege());

    }


}
