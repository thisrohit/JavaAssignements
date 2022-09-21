package JavaApp.FunctionalInterfaceCodes;

import java.util.function.Supplier;

public class FunctionalInterfaceSupplier {
    public static void main(String[] args) {
//        Supplier -  here we only supply, we dont take any input and return some output
        Supplier<Double> getRandomValue = ()->Math.random();
        System.out.println(getRandomValue.get());

    }
}
