package toturial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//EvenOdd
public class PredicateDemo {
    public static void main(String[] args) {

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer t) {
                if (t % 2 == 0) {
                    return true;
                } else {
                    return false;
                }

            }
        };
        //second short syntax of predicates
//        Predicate<Integer> predicate=(t)->{
//                if(t % 2==0){
//                    return  true;
//                }
//                else {
//                    return false;
//                }
//
//            };
//
//        System.out.println(predicate.test(16));
//    }

        //eg2
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Predicate<Integer> predicate1 = (x) -> x > 5;
        Predicate<Integer> predicate2=(x)->x<8;
        l1.stream().filter(predicate1.and(predicate2)).collect(Collectors.toList()).forEach(System.out::println);
    }
}