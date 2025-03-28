package fr.efrei.Repository;

/**
 * Factory class for creating Review objects.
 * Author: [Adin September (222757892)]
 * Date: [Current Date]
 */
import fr.efrei.domain.Review;
import fr.efrei.factory.ReviewFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

class ReviewRepositoryTest {

    private ReviewRepository repository;
    private Review review;

    @BeforeEach
    void setUp() {
        repository = ReviewRepositoryImpl.getInstance();
        review = ReviewFactory.createReview("R001", "C001", "Res001", "Amazing service!", 5);
        repository.create(review);
    }

    @Test
    void create_Success() {
        Review newReview = ReviewFactory.createReview("R002", "C002", "Res002", "Good experience!", 4);
        Review created = repository.create(newReview);
        assertNotNull(created);
        assertEquals("R002", created.getReviewId());
    }

    @Test
    void read_Success() {
        Review found = repository.read("R001");
        assertNotNull(found);
        assertEquals("R001", found.getReviewId());
    }

    @Test
    void update_Success() {
        Review updatedReview = new Review.Builder()
                .setReviewId("R001")
                .setCustomerId("C001")
                .setRestaurantId("Res001")
                .setReviewText("Updated review text!")
                .setRating(4)
                .build();

        Review result = repository.update(updatedReview);
        assertNotNull(result);
        assertEquals("Updated review text!", result.getReviewText());
    }

    @Test
    void delete_Success() {
        boolean deleted = repository.delete("R001");
        assertTrue(deleted);
        assertNull(repository.read("R001"));
    }

    @Test
    void getAll_Success() {
        Set<Review> allReviews = repository.getAll();
        assertFalse(allReviews.isEmpty());
    }
}
