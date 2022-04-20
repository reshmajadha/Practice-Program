package toturial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForeachwithLambda {
    public static void main(String[] args) {
        List<String>list= new ArrayList<String>();
        list.add("cricket");
        list.add("hocky");
        list.add("khokho");
        list.add("kabaddi");
       list.forEach(game-> System.out.println(game));

      //  list.forEach(game1-> System.out::println);
    }


}
