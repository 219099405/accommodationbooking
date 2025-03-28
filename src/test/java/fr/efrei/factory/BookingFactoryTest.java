/*
Booking Factory Test
Author: Laverne Rollison (221219455)
Date 28 March 2025
 */

package fr.efrei.factory;

import fr.efrei.domain.Booking;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class BookingFactoryTest {
    @Test
    void testCreateBooking() {
        int bookingId = 1;
        int userId = 14900;
        int accommodationId = 1;
        LocalDate checkInDate = LocalDate.of(2025, 04, 01);
        LocalDate checkOutDate = LocalDate.of(2025, 04, 05);
        double totalPrice = 500.00;

        Booking booking = BookingFactory.createBooking(bookingId, userId, accommodationId, checkInDate, checkOutDate, totalPrice);

        assertEquals(bookingId, booking.getBookingId());
        assertEquals(userId, booking.getUserId());
        assertEquals(accommodationId, booking.getAccommodationId());
        assertEquals(checkInDate, booking.getCheckInDate());
        assertEquals(checkOutDate, booking.getCheckOutDate());
        assertEquals(totalPrice, booking.getTotalPrice());
    }

    @Test
    void testCreateBookingWithNullValues() {
        Booking booking = BookingFactory.createBooking(0, 0, 0, null, null, -1.0);

        assertNull(booking);
        System.out.println(booking);
    }
}
