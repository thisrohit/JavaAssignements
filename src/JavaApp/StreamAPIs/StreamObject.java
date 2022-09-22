package JavaApp.StreamAPIs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
//        StreamAPI - used on collection process
//        collection - group of objects - arrays,etc
//        creating blank stream
        Stream<Object> emptyStream = Stream.empty();

//        arrays, object, collection k liye
        String names[] = {"Rohit", "Rahul", "Ankit"};
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e->{
            System.out.println(e);
        });

//        3 builder
        Stream<Object> builder = Stream.builder().build();
        IntStream stream = Arrays.stream(new int[]{2,34,5,54,12});
        stream.forEach(e->{
            System.out.println(e);
        });

        List<Integer> list2 = Arrays.asList(12, 32, 43, 23, 44);
        Stream<Integer> stream2 = list2.stream();
        List<Integer> offList = stream2.filter(i->i%2 != 0).collect(Collectors.toList());
        offList.forEach(e->{
            System.out.println(e);
        });





    }
}
