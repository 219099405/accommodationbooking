package fr.efrei.Repository;



import fr.efrei.domain.Review;
import fr.efrei.Repository.IRepository;
import java.util.Set;

public interface ReviewRepository extends IRepository<Review, String> {

    Set<Review> getAll();
}