package fr.efrei.domain;

import java.time.LocalDate;

public class Review {
    private int reviewId;
    private int accommodationId;
    private int userId;
    private LocalDate reviewDate;
    private int rating;

    // Constructor
    public Review(int reviewId, int accommodationId, int userId, LocalDate reviewDate, int rating) {
        this.reviewId = reviewId;
        this.accommodationId = accommodationId;
        this.userId = userId;
        this.reviewDate = reviewDate;
        this.rating = rating;
    }

    // Getters and Setters
    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public int getAccommodationId() {
        return accommodationId;
    }

    public void setAccommodationId(int accommodationId) {
        this.accommodationId = accommodationId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public LocalDate getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(LocalDate reviewDate) {
        this.reviewDate = reviewDate;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            this.rating = rating;
        } else {
            throw new IllegalArgumentException("Rating must be between 1 and 5");
        }
    }

    // toString method for easy display
    @Override
    public String toString() {
        return "Review{" +
                "reviewId=" + reviewId +
                ", accommodationId=" + accommodationId +
                ", userId=" + userId +
                ", reviewDate=" + reviewDate +
                ", rating=" + rating +
                '}';
    }
}
