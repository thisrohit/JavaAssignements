package JavaApp.FunctionalInterfaceCodes;

import java.util.function.Function;

public class FunctionalInterfaceFunction {
    public static void main(String[] args) {
//        Function - It takes two argument and return one result - like eg - Integer, string and will input as int and return as string
        Function<Integer, String> getString = t->t*10 + "  data is multiplied by 10";
        System.out.println(getString.apply(97));
    }
}
