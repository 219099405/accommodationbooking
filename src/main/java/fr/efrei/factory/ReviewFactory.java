package fr.efrei.factory;



import fr.efrei.domain.Review;


/**
 * Factory class for creating Review objects.
 * Author: [Adin September (222757892)]
 * Date: [Current Date]
 */
public class ReviewFactory {
    public static Review createReview(String reviewId, String customerId, String restaurantId, String reviewText, int rating) {
        if (reviewId == null || customerId == null || restaurantId == null || reviewText == null) {
            throw new IllegalArgumentException("please provide all the feilds .");
        }
        return new Review.Builder()
                .setReviewId(reviewId)
                .setCustomerId(customerId)
                .setRestaurantId(restaurantId)
                .setReviewText(reviewText)
                .setRating(rating)
                .build();
    }
}
