package toturial;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//class person{
//nneed for consumer interface
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
public class Functionalinterface {
    public static void main(String[] args) {
        //predicate interface
//        Predicate<String> checklength=str->str.length()>5;
//        System.out.println(checklength.test("asvc"));


        //Consumer Interface
//        person p=new person();
//        Consumer<person> setName=t-> t.setName("java");
//        setName.accept(p);
//        System.out.println(p.getName());

        //Function Interface
//        Function<Integer,String> getInt=t->t*10+"multiply";
//        System.out.println(getInt.apply(2));

        //Supplier Interfdace
        Supplier<Double> randomDouble =()->Math.random();
        System.out.println(randomDouble.get());
    }
}
