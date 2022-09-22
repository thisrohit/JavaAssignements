package JavaApp.StreamAPIs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImportantStreamMethods {
    public static void main(String[] args) {
//        filter, collect, sort, min, max,etc
//        filter(Predicate)
//            Predicate will return me some boolean value - true or false
//            condition dena hoga like, and hum lambda mai de sakte hai
//            e->(condition) eg-> e->e>10 or e->e%10==0 aisa kuch
//        toh here, if my Predicate returns true only then the element will be
//        filtered otherwise my element will be simply skipped from filteration

//        Map
/*
            here, map will perform some operation on every element
            eg - if we want to square all the elements of a list in that case
            we can use map method
            map(Function)
                Function jo hai - value ko return krta hai.. toh
                jo v value yh function dega map use lelega

 */


        List<String> names = Arrays.asList("Aman", "Ankit", "Abhinav", "Rohit", "Durgesh");
        List<String> newNames = names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
        newNames.forEach(e->{
            System.out.println(e);
        });
        List<Integer> numbers = Arrays.asList(23, 4, 32, 45, 132,94);
        List<Integer> newList = numbers.stream().map(e->e*e).collect(Collectors.toList());
        newList.forEach(i->{
            System.out.println(i);
        });

//        collect
        /*
        Collect basically collect krti hai, hume jis v format mai chaiye, like
        list mai ya kisi object k form mai
         */
        names.stream().filter(e -> e.length() < 4).map(String::toString).forEach(System.out::println);

        newNames.stream().forEach(System.out::println);

        System.out.println("\nSortedList");
        numbers.stream().sorted().forEach(System.out::println);

        Integer i1 =  numbers.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println("Max = "+i1 );

        Integer i2 = numbers.stream().min((x,y)->x.compareTo(y)).get();

        System.out.println("Min = "+i2 );
    }
}
