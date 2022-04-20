package toturial;

import java.util.ArrayList;
import java.util.List;

public class StreamOpration {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("Ress");
        list.add("sonu");
        list.add("dadu");
        list.add("mayu");
       System.out.println(list);

       //Stream opration
        //Intermediate and terminal oprations perform on stream
        long count= list.stream().distinct().count();
        System.out.println(count);

        //another mthod off stream opration

      boolean anymatch=  list.stream().anyMatch(s -> s.contains("pyu"));
        System.out.println(anymatch);
    }
}
