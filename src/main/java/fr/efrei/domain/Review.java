package fr.efrei.domain;
/**
 * Review class representing customer reviews.

 * Author: [Adin september 222757892]

 */
public class Review {
    private final String reviewId;
    private final String customerId;
    private final String restaurantId;
    private final String reviewText;
    private final int rating;

    private Review(Builder builder) {
        this.reviewId = builder.reviewId;
        this.customerId = builder.customerId;
        this.restaurantId = builder.restaurantId;
        this.reviewText = builder.reviewText;
        this.rating = builder.rating;
    }

    public String getReviewId() {
        return reviewId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public String getReviewText() {
        return reviewText;
    }

    public int getRating() {
        return rating;
    }

    public static class Builder {
        private String reviewId;
        private String customerId;
        private String restaurantId;
        private String reviewText;
        private int rating;

        public Builder setReviewId(String reviewId) {
            this.reviewId = reviewId;
            return this;
        }

        public Builder setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder setRestaurantId(String restaurantId) {
            this.restaurantId = restaurantId;
            return this;
        }

        public Builder setReviewText(String reviewText) {
            this.reviewText = reviewText;
            return this;
        }

        public Builder setRating(int rating) {
            if (rating < 1 || rating > 5) {
                throw new IllegalArgumentException("Rating must be between 1 and 5.");
            }
            this.rating = rating;
            return this;
        }

        public Review build() {
            return new Review(this);
        }
    }

    @Override
    public String toString() {
        return "Review{" +
                "reviewId='" + reviewId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", restaurantId='" + restaurantId + '\'' +
                ", reviewText='" + reviewText + '\'' +
                ", rating=" + rating +
                '}';
    }
}
