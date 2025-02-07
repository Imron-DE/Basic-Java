package day3.Scanner.Products;


import java.util.Scanner;

public class ProductMain {
    public static void main() {
        Products.ProductController productController =new Products.ProductController();

        Scanner input= new Scanner(System.in);
        System.out.println("===PRODUCT LIST ===");
        productController.displayAllProducts();
        System.out.println("====================");

        System.out.println("Apakah anda ingin menambahkan produk baru? (Y/N) ");
        String addProductChoice = input.nextLine().toLowerCase();


        if(addProductChoice.equals("y")){
            System.out.println("Masukan jumlaah product : ");
            int jumlahProduk = input.nextInt();
            input.nextLine();

            for (int i= 0;i< jumlahProduk;i++){
                System.out.println("data data product ke - " +(i+1));
                System.out.print("Nama => ");
                String nama= input.nextLine();
                System.out.print("Harga => ");
                double harga = input.nextDouble();
                input.nextLine();
                System.out.print("Kategori => ");
                String kategori = input.nextLine();
                input.nextLine();

                Products products = new Products(nama,harga,kategori);
                productController.addProduct(products);

            }
        }
        System.out.println("===PRODUCT LIST ===");
        productController.displayAllProducts();
        System.out.println("====================");

        System.out.println("=== SORT PRODUCTS BY PRICE ===");
        // sort method
        System.out.println("====================");

        System.out.println("Apakah andda ingin mencari produk (Y/N)");
        // method & logic untuk mencari product berdasarkan nama

        // buat method save product ke file

        // buat methode read file product
    }
}
