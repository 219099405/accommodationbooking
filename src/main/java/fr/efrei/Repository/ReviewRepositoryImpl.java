package fr.efrei.Repository;

import fr.efrei.domain.Review;
import java.util.HashSet;
import java.util.Set;

public class ReviewRepositoryImpl implements ReviewRepository {
    private static ReviewRepositoryImpl repository = null;
    private Set<Review> reviewDB;

    private ReviewRepositoryImpl() {
        this.reviewDB = new HashSet<>();
    }

    public static ReviewRepositoryImpl getInstance() {
        if (repository == null) {
            repository = new ReviewRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Review create(Review review) {
        this.reviewDB.add(review);
        return review;
    }

    @Override
    public Review read(String reviewId) {
        return reviewDB.stream()
                .filter(review -> review.getReviewId().equals(reviewId))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Review update(Review review) {
        Review existingReview = read(review.getReviewId());
        if (existingReview != null) {
            reviewDB.remove(existingReview);
            reviewDB.add(review);
            return review;
        }
        return null;
    }

    @Override
    public boolean delete(String reviewId) {
        Review reviewToDelete = read(reviewId);
        if (reviewToDelete != null) {
            reviewDB.remove(reviewToDelete);
            return true;
        }
        return false;
    }

    @Override
    public Set<Review> getAll() {
        return reviewDB;
    }
}
