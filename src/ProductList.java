import java.util.ArrayList;

public class ProductList {

    public static void main(String[] args) {

        ArrayList<String> products = new ArrayList<>();

        products.add("Laptop");
        products.add("Phone");
        products.add("Tablet");


        for(String product : products) {
            System.out.println(product);

        }

    }

}