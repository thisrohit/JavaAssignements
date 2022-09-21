package JavaApp.FunctionalInterfaceCodes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterfacesPredicate {
//    p predicate -> Accepts single value does processing and returns us boolean value

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rohit", "Rahul", "Ramesh", "rambo", "Gagan");
        Predicate<String> p = (s)-> s.startsWith("R");

        for(String str : names){
            if(p.test(str)){
                System.out.println(str.toString());
            }
        }
    }


}
