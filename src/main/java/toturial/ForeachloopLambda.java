package toturial;

import java.util.ArrayList;
import java.util.List;

public class ForeachloopLambda {

    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("ress");
        list.add("acs");
        list.add("Saew");
        list.add("wqw");
        list.forEach((n)-> System.out.println(n));


    }
}
