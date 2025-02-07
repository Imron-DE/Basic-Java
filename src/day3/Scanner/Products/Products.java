package day3.Scanner.Products;

import java.util.ArrayList;
import java.util.List;

public class Products {
    public String name;
    public double price;
    public String category;

    public Products(String name, double price,String category){
        this.name=name;
        this.price=price;
        this.category=category;
    }

    // inner class
    public static class ProductController{
        private final List<Products> productList;

        public ProductController(){
            productList= new ArrayList<>();
        }

        // methode
        public  void addProduct(Products products){productList.add(products);}
        public void displayAllProducts(){
            if(!productList.isEmpty()){
                for (Products product : productList){
                    System.out.println("nama:" + product.name +", price: "+ product.price+"category: "+product.category );

                }

                }else {
                System.out.println("product tidak tersedia");
            }
        }
        // tambahin methode lainnya disini
    }

}
