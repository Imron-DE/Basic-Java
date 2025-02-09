package day3.Scanner.Review;

public class Review {
    private String reviewer;
    private int rating;

    // Konstruktor
    public Review(String reviewer, int rating) {
        this.reviewer = reviewer;
        this.rating = rating;
    }

    // Getter untuk reviewer
    public String getReviewer() {
        return reviewer;
    }

    // Getter untuk rating
    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Reviewer: " + reviewer + ", Rating: " + rating;
    }
}
