package java8program;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayList {
    public static void main(String[] args) {
        List<String>stringList= new java.util.ArrayList<String>();
        stringList.add("Ajay");
        stringList.add("vijay");
        stringList.add("sanjay");
        stringList.add("jay");
       // System.out.println(stringList);
        List<String>stringList1= stringList.stream().collect(Collectors.toList());
        System.out.println(stringList1);
    }
}
