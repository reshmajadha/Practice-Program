package toturial;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> consumer=(t)-> System.out.println(t);
        consumer.accept("Remesh");

        Consumer<String> consumer1=(input)-> System.out.println(input+"java");

        Consumer<String> consumer2=(input)-> System.out.println(input+"world");

        //andThen() method are used
        consumer1.andThen(consumer2).accept("welcome");

        //forEach
        List<Integer> array= Arrays.asList(1,2,3,4,5,6,7,8);
       // Consumer<Integer> consumer3=(t)-> System.out.println(t);
        array.forEach((t)-> System.out.println(t));
    }
}
