package toturial;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<LocalDateTime> supplier=()-> LocalDateTime.now();
        System.out.println(supplier.get());

        Supplier<List<product>> listSupplier=()->{
            List<product> productList=new ArrayList<product>();
            productList.add(new product(1,"hell",3456));
            productList.add(new product(2,"heeell",33456));
            productList.add(new product(3,"hrrell",34565));
            return productList;

        };
        System.out.println(listSupplier.get());


    }

}
