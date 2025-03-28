package fr.efrei.factory;

import fr.efrei.domain.Accommodation;
import java.util.List;

public class AccommodationFactory {
    public static Accommodation createAccommodation(int accommodationId, String name, String type,
                                                    String description, double pricePerNight,
                                                    String location, String availability,
                                                    List<String> facilities) {
        // Handle potential null values
        if (facilities == null) {
            facilities = List.of();
        }

        return new Accommodation.Builder()
                .setAccommodationId(accommodationId)
                .setName(name)
                .setType(type)
                .setDescription(description)
                .setPricePerNight(pricePerNight)
                .setLocation(location)
                .setAvailability(availability)
                .setFacilities(facilities)
                .build();
    }
}
