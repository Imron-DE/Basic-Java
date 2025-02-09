package day3.Scanner.Home;


import day3.Scanner.Products.ProductMain;
import day3.Scanner.Review.Review;
import day3.Scanner.Review.ReviewManager;

import java.util.Scanner;


public class Home {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===Menu===");
        System.out.println("- Login");
        System.out.println("- Register");
        System.out.println("- Product");
        System.out.println("- Cart");
        System.out.println("- Review");
        System.out.println("pilih menu");
        Menu mymenu= Menu.valueOf(input.nextLine().toUpperCase());


        switch (mymenu){
            case LOGIN:
                System.out.println("login success");
                break;
            case REGISTER:
                System.out.println("Register success");
                break;
            case PRODUCT:
                System.out.println("Navigate to product page");
                ProductMain.main();
                break;
            case CART:
                System.out.println("Navigate to cart page");
                break;
            case REVIEW:
                System.out.println("Navigate to review page");
                ReviewManager reviewManager = new ReviewManager();
                reviewManager.handleReview(input);
                // buat menu review yang bisa menambahkan reviewer dan rating (int).kemudian tampilakan semua reviewnya  
                break;
        }

    }
}
