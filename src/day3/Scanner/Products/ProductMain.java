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

                Products products = new Products(nama,harga,kategori);
                productController.addProduct(products);

            }
        }
        System.out.println("===PRODUCT LIST ===");
        productController.displayAllProducts();
        System.out.println("====================");

        System.out.println("=== SORT PRODUCTS BY PRICE ===");
        productController.sortProductsByPrice();
        productController.displayAllProducts();
        // sort method
        System.out.println("====================");

        System.out.println("Apakah andda ingin mencari produk (Y/N)");
        String searchChoice = input.nextLine().toLowerCase();
        // method & logic untuk mencari product berdasarkan nama

        // buat method save product ke file

        // buat methode read file product
        if (searchChoice.equals("y")) {
            System.out.print("Masukkan nama produk yang ingin dicari: ");
            String searchName = input.nextLine();
            Products foundProduct = productController.searchProductByName(searchName);

            if (foundProduct != null) {
                System.out.println("Produk ditemukan: " + foundProduct.name + ", Harga: " + foundProduct.price + ", Kategori: " + foundProduct.category);
            } else {
                System.out.println("Produk dengan nama " + searchName + " tidak ditemukan.");
            }
        }

        // Menyimpan produk ke file menggunakan BufferedWriter
        System.out.println("Simpan produk ke file (Y/N)?");
        String saveChoice = input.nextLine().toLowerCase();

        if (saveChoice.equals("y")) {
            String filePath = "D:\\Bootcampp Aigen\\Basic-java\\basic-java\\src\\day3\\Scanner\\Products\\product.txt";
            productController.saveProductsToFile(filePath);
        }

    }
}
