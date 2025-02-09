package day3.Scanner.Products;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

        // Mencari produk berdasarkan nama
        public Products searchProductByName(String name) {
            for (Products product : productList) {
                if (product.name.equalsIgnoreCase(name)) {
                    return product;
                }
            }
            return null;
        }

        // Mengurutkan produk berdasarkan harga
        public void sortProductsByPrice() {
            Collections.sort(productList, Comparator.comparingDouble(product -> product.price));
            System.out.println("Produk telah diurutkan berdasarkan harga.");
        }

        // Menyimpan produk ke file menggunakan BufferedWriter
        public void saveProductsToFile(String filename) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
                for (Products product : productList) {
                    writer.write("Nama: " + product.name + ", Harga: " + product.price + ", Kategori: " + product.category);
                    writer.newLine();  // Menambahkan baris baru setelah setiap produk
                }
                System.out.println("Produk berhasil disimpan ke file.");
            } catch (IOException e) {
                System.out.println("Error saat menyimpan produk ke file: " + e.getMessage());
            }
        }

        // Membaca produk dari file
        public void loadProductsFromFile(String filename) {
            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    // Format line: "Nama: <name>, Harga: <price>, Kategori: <category>"
                    String[] parts = line.split(", ");
                    String name = parts[0].split(": ")[1];
                    double price = Double.parseDouble(parts[1].split(": ")[1]);
                    String category = parts[2].split(": ")[1];

                    // Membuat objek Products dan menambahkannya ke dalam list
                    Products product = new Products(name, price, category);
                    productList.add(product);
                }
            } catch (IOException e) {
                System.out.println("Error saat memuat produk dari file: " + e.getMessage());
            }
        }





    }

}
