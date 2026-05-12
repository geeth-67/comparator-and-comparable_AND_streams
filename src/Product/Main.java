package Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();   // coding to the interface

        Product product01 = new Product("001" , "Mango" , 1000);
        Product product02 = new Product("002" , "Apple" , 100);
        Product product03 = new Product("003" , "Banana" , 300);

        productList.add(product01);
        productList.add(product02);
        productList.add(product03);

        Collections.sort(productList);

        for (Product prod : productList) {

            System.out.println(prod);
        }

        Comparator<Product> byName = (a , b ) -> a.name.compareTo(b.name);

        productList.sort(byName);

        productList.forEach(p -> System.out.println(p));
    }
}
