package toturial;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiEg {
    public static void main(String[] args) {


        //count the empty string
        List<String> list = Arrays.asList("abc", "", "asw", "dss", "ewee", "ee","0");
        long count = list.stream().filter(x -> x.isEmpty()).count();
        System.out.println(count);

        //count the length is min 3

        long num = list.stream().filter(x -> x.length() > 3).count();
        System.out.println(num);

        //string start with a

        long count1 = list.stream().filter(x -> x.startsWith("a")).count();
        System.out.println(count1);

        //removing empty string

       List<String>filter=list.stream().filter(x->!x.isEmpty()).collect(Collectors.toList());
        System.out.println(filter);

        //for creating new list
        List<String>filter1=list.stream().filter(x->x.isEmpty()).collect(Collectors.toList());

        filter1=Arrays.asList("Ress");
        System.out.println(filter1);


        //convering uppercase join with coomma
        List<String>stringList= Arrays.asList("wqw", "ress", "rew", "reqq");
        String s=stringList.stream().map(x->x.toUpperCase()).collect(Collectors.joining(","));
        System.out.println(s);


          //Create a List of the square of all distinct numbers
        //remove duplicate no in the list

        List<Integer>integerList= Arrays.asList(1,2,3,4,45,4);
        List<Integer>distinct=integerList.stream().map(i->i*i).distinct().collect(Collectors.toList());
        System.out.println(distinct);

        //remove the duplicate string
        List<String>stringList1=Arrays.asList("aa","aa","re","fd");
        List<String>distinct1=stringList1.stream().distinct().collect(Collectors.toList());
        System.out.println(distinct1);



        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);

        IntSummaryStatistics stats = primes.stream() .mapToInt((x) -> x) .summaryStatistics();
        System.out.println("Highest prime number in List : " + stats.getMax());

        System.out.println("Lowest prime number in List : " + stats.getMin());
        System.out.println("Sum of all prime numbers : " + stats.getSum());
        System.out.println("Average of all prime numbers : " + stats.getAverage());





    }
}
