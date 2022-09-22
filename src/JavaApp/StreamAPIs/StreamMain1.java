package JavaApp.StreamAPIs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[] args) {
//        create a list and filter all even number
//        -

        List<Integer> list1 = Arrays.asList(2, 4, 50, 21, 22, 67);
//       list1.add(12);immutable
//        adding even list from list1 to list 2 w/o stream
        List<Integer> list2 = new ArrayList<>();
        for(Integer i:list1){
            if(i%2 == 0) list2.add(i);
        }

//        using streamAPI
        Stream<Integer> stream = list1.stream();
//        List<Integer> filteredList = stream.filter(i->i%2==0 (yeh predicator hai, need some boolean value)).collect(Collectors.toList());
        List<Integer> filteredList = stream.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(filteredList);
//      in a single line ->
        List<Integer> newList = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newList);
//      integer greater than equal to 50
        List<Integer> listIntegerGreaterthan50 = list1.stream().filter(i->i>=50).collect(Collectors.toList());
        System.out.println(listIntegerGreaterthan50);
    }
}
