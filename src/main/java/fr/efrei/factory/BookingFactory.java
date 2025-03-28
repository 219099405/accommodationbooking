/*
Booking Factory Class
Author: Laverne Rollison (221219455)
Date 28 March 2025
 */

package fr.efrei.factory;

import fr.efrei.domain.Booking;
import java.time.LocalDate;

public class BookingFactory {
    public static Booking createBooking(int bookingId, int userId, int accommodationId, LocalDate checkInDate, LocalDate checkOutDate, double totalPrice) {
        if (bookingId <= 0 || userId <= 0 || accommodationId <= 0 || checkInDate == null || checkOutDate == null || totalPrice <= 0)
            return null;

        return new Booking.Builder()
                .setBookingId(bookingId)
                .setUserId(userId)
                .setAccommodationId(accommodationId)
                .setCheckInDate(checkInDate)
                .setCheckOutDate(checkOutDate)
                .setTotalPrice(totalPrice)
                .build();
    }

}
