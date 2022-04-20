package toturial;

import java.util.Optional;

public class OptionalDemo {


    public static void main(String[] args) {

        Optional<String> optionalS=Optional.empty();
        System.out.println(optionalS);


        String book=null;
        if(book !=null){
          System.out.println(book.toUpperCase());

        }
        else {
            book="java8";
            System.out.println(book.toUpperCase());


        }
        //by using ofnullable
        optionalS=Optional.ofNullable(book);
        if(optionalS.isPresent()){
            System.out.println(optionalS.get().toUpperCase());
        }


    }
}
