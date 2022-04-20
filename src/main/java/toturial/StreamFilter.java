package toturial;

import java.util.ArrayList;
import java.util.List;

public class StreamFilter {
    public static void main(String[] args) {
        List<product1>list=new ArrayList<>();
        for (product1 product:getproducts()){
            if(product.getPrice()>12000){
                list.add(product);
            }
        }
        for(product1 product:list){
            System.out.println(product);
        }

        System.out.println("........Stream Api..........");

        //using stream Api
//        List<product> list1=getproducts()
//                .stream().filter(product -> product.getPrice()>12000)
//                .collect(Collectors.toList());
//        list1.forEach(System.out::println);


            //second way using Stream Api without using collect method
        getproducts().stream().filter(product -> product.getPrice()>12000)
                .forEach(System.out::println);

//filter n iterate
        getproducts().stream()
                .filter(product -> product.getPrice() == 12000f)
                .forEach(product -> System.out.println(product.getName()));

    }
    private static List<product1> getproducts(){
        List<product1> productList=new ArrayList<product1>();
        productList.add(new product1(1,"hp",12000f));
        productList.add(new product1(2," linova",122250f));
        productList.add(new product1(3,"dell",145000f));
        return productList;

    }
}
class product{
    private  int id;
    private String name;
    private float price;

    public product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

