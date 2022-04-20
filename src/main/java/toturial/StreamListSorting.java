package toturial;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {

    public static void main(String[] args) {

        List<String> Fruit = new ArrayList<String>();
        Fruit.add("Banana");
        Fruit.add("Mango");
        Fruit.add("Apple");
        Fruit.add("watermelan");
//       List<String>  sortedList=Fruit.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
//        System.out.println(sortedList);

        //using Lambda Expression

        List<String> sortedList1 = Fruit.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
        System.out.println(sortedList1);


        List<String> sortedList2 = Fruit.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList2);

        //desending order

        List<String> sortedList3 = Fruit.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList3);

        //using Lambda Expression

        List<String> sortedList4 = Fruit.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
        System.out.println(sortedList4);


        List<EmpListSorting> Emp=new ArrayList<EmpListSorting>();
        Emp.add(new EmpListSorting(10,"ress",30000));
        Emp.add(new EmpListSorting(21,"ewq",34000));
        Emp.add(new EmpListSorting(1,"csd",5122));
        Emp.add(new EmpListSorting(5,"hfd",183333));

       List<EmpListSorting> empListSortings1= Emp.stream().sorted(new Comparator<EmpListSorting>() {
            @Override
            public int compare(EmpListSorting o1, EmpListSorting o2) {
                return (int) (o1.salary()-o2.salary());
            }
        }).collect(Collectors.toList());
        System.out.println(empListSortings1);
    }

}
