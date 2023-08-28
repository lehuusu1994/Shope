package service;

import entity.Product;

import java.util.ArrayList;

public class ProductService {
    private static ArrayList<Product> products = new ArrayList<Product>();

    public static void printProductList(){
        for (Product product: products
             ) {
            System.out.println(product);
        }
    }
    public static void addProductToList(){
        Product product = new Product(1, "ao thun nam", 10000);
        products.add(product);
    }
    public static Product searchProductById(int id){
        for (Product product: products
        ) {
            if(product.getId() == id){
                return product;
            }
        }
        return null;
    }
}
