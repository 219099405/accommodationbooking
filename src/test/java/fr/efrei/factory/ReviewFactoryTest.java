package fr.efrei.factory;
/**
        * Factory class for creating Review objects.
 * Author: [Adin September (222757892)]
        * Date: [Current Date]
        */
import fr.efrei.domain.Review;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReviewFactoryTest {

    @Test
    void createReview_Success() {
        Review review = ReviewFactory.createReview("R123", "C456", "Res789", "Great food!", 5);

        assertNotNull(review);
        assertEquals("R123", review.getReviewId());
        assertEquals("C456", review.getCustomerId());
        assertEquals("Res789", review.getRestaurantId());
        assertEquals("Great food!", review.getReviewText());
        assertEquals(5, review.getRating());
    }

    @Test
    void createReview_Fail_NullValues() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ReviewFactory.createReview(null, "C456", "Res789", "Great food!", 5);
        });
        assertEquals("please provide all the feilds .", exception.getMessage());
    }
}
