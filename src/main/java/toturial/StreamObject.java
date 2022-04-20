package toturial;

import java.util.*;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        //stream creation
        Stream<String> stream=Stream.of("a","b","c");
        stream.forEach(System.out::println);

        //stream creation from source

                //for collection
        Collection<String> collection= Arrays.asList("java","spring","hibernate");
        Stream<String> stream1 =collection.stream();
        stream1.forEach(System.out::println);

        //for list

       List<String> list= Arrays.asList("java","spring","hibernate");
        Stream<String> stream2 =collection.stream();
        stream2.forEach(System.out::println);


        Set<String> set=new HashSet<>(list);
        Stream<String> stream3=set.stream();
        stream3.forEach(System.out::println);

        String[] strArray={"a","b","c"};
        Stream<String>stream4=Arrays.stream(strArray);
        stream4.forEach(System.out::println);

    }
}
