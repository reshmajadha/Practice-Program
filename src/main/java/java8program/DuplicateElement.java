package java8program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateElement {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,3,2,3,4,5,6,7);
        System.out.println(list);
        List<Integer>list1=list.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);

    }
}
