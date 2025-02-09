package day3.Scanner.Review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReviewManager {
    private List<Review> reviews = new ArrayList<>();

    // Menambahkan review
    public void addReview(String reviewer, int rating) {
        // Buat objek Review baru dan tambahkan ke list
        reviews.add(new Review(reviewer, rating));
    }

    // Menampilkan semua review
    public void displayReviews() {
        if (reviews.isEmpty()) {
            System.out.println("No reviews available.");
        } else {
            System.out.println("=== All Reviews ===");
            for (Review review : reviews) {
                System.out.println(review);
            }
        }
    }

    // Handle input dan logika review
    public void handleReview(Scanner input) {
        System.out.println("Masukkan nama reviewer:");
        String reviewer = input.nextLine();

        System.out.println("Masukkan rating (1-5):");
        int rating = Integer.parseInt(input.nextLine());

        // Menambahkan review
        addReview(reviewer, rating);

        // Menampilkan semua review setelah penambahan
        displayReviews();
    }
}
