package fr.efrei.domain;

import java.util.List;
import java.util.Objects;

public class Accommodation {
    private int accommodationId;
    private String name;
    private String type;
    private String description;
    private double pricePerNight;
    private String location;
    private String availability;
    private List<String> facilities;

    private Accommodation(Builder builder) {
        this.accommodationId = builder.accommodationId;
        this.name = builder.name;
        this.type = builder.type;
        this.description = builder.description;
        this.pricePerNight = builder.pricePerNight;
        this.location = builder.location;
        this.availability = builder.availability;
        this.facilities = builder.facilities;
    }

    public int getAccommodationId() {
        return accommodationId;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public String getDescription() {
        return description;
    }
    public double getPricePerNight() {
        return pricePerNight;
    }

    public String getLocation() {
        return location;
    }
    public String getAvailability() {
        return availability;
    }
    public List<String> getFacilities() {
        return facilities;
    }
    @Override
    public String toString() {
        return "Accommodation{" +
                "accommodationId=" + accommodationId +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", pricePerNight=" + pricePerNight +
                ", location='" + location + '\'' +
                ", availability='" + availability + '\'' +
                ", facilities=" + facilities +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Accommodation that = (Accommodation) o;
        return accommodationId == that.accommodationId && Double.compare(that.pricePerNight, pricePerNight) == 0 && Objects.equals(name, that.name) && Objects.equals(type, that.type) && Objects.equals(description, that.description) && Objects.equals(location, that.location) && Objects.equals(availability, that.availability) && Objects.equals(facilities, that.facilities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accommodationId, name, type, description, pricePerNight, location, availability, facilities);
    }

    public static class Builder {
        private int accommodationId;
        private String name;
        private String type;
        private String description;
        private double pricePerNight;
        private String location;
        private String availability;
        private List<String> facilities;

        public Builder setAccommodationId(int accommodationId) {
            this.accommodationId = accommodationId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setPricePerNight(double pricePerNight) {
            this.pricePerNight = pricePerNight;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder setAvailability(String availability) {
            this.availability = availability;
            return this;
        }

        public Builder setFacilities(List<String> facilities) {
            this.facilities = facilities;
            return this;
        }

        public Accommodation build() {
            return new Accommodation(this);
        }
    }
}
