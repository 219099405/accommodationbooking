/*
Booking Repository implements IBookingRepository
Author: Laverne Rollison (221219455)
Date 28 March 2025
 */

package fr.efrei.Repository;
import fr.efrei.domain.Booking;
import java.util.ArrayList;
import java.util.List;

public class BookingRepository implements IBookingRepository {

    private static IBookingRepository repository = null;
    private List<Booking> bookingsList;

    private BookingRepository() {
        bookingsList = new ArrayList<>();
    }

    public static IBookingRepository getRepository() {
        if (repository == null) {
            repository = new BookingRepository();
        }
        return repository;
    }

    @Override
    public List<Booking> getAll() {
        return new ArrayList<>(bookingsList);
    }

    @Override
    public Booking create(Booking booking) {
        bookingsList.add(booking);
        return booking;
    }

    @Override
    public Booking read(Integer bookingId) {
        for (Booking booking : bookingsList) {
            if (booking.getBookingId() == bookingId) {
                return booking;
            }
        }
        return null;
    }

    @Override
    public Booking update(Booking booking) {
        Integer bookingId = booking.getBookingId();
        Booking oldBooking = read(bookingId);
        if (oldBooking != null) {
            bookingsList.remove(oldBooking);
            bookingsList.add(booking);
            return booking;
        }
        return null;
    }

    @Override
    public boolean delete(Integer bookingId) {
        Booking bookingToDelete = read(bookingId);
        if (bookingToDelete != null) {
            bookingsList.remove(bookingToDelete);
            return true;
        }
        return false;

    }
}
