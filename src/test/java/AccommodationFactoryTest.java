import fr.efrei.domain.Accommodation;
import fr.efrei.factory.AccommodationFactory;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

     class AccommodationFactoryTest {
    @Test
    void testCreateAccommodation() {
        List<String> facilities = Arrays.asList("WiFi", "Swimming Pool", "Gym");

        Accommodation accommodation = AccommodationFactory.createAccommodation(
                1, "Sea View Hotel", "Hotel", "A luxurious seaside hotel",
                150.0, "Cape Town", "Available", facilities
        );

        assertNotNull(accommodation);

        assertEquals(1, accommodation.getAccommodationId());
        assertEquals("Sea View Hotel", accommodation.getName());
        assertEquals("Hotel", accommodation.getType());
        assertEquals("A luxurious seaside hotel", accommodation.getDescription());
        assertEquals(150.0, accommodation.getPricePerNight());
        assertEquals("Cape Town", accommodation.getLocation());
        assertEquals("Available", accommodation.getAvailability());
        assertEquals(facilities, accommodation.getFacilities());
    }

    @Test
    void testCreateAccommodationWithNullFacilities() {
        Accommodation accommodation = AccommodationFactory.createAccommodation(
                2, "Mountain Lodge", "Lodge", "A peaceful retreat in the mountains",
                200.0, "Drakensberg", "Available", null
        );

        assertNotNull(accommodation);
        assertNotNull(accommodation.getFacilities());
        assertTrue(accommodation.getFacilities().isEmpty());
    }
}


