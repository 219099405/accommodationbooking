/*
Booking Repository implements IBookingRepository
Author: Laverne Rollison (221219455)
Date 28 March 2025
 */

package fr.efrei.Repository;

import fr.efrei.domain.Booking;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BookingRepositoryTest {

    private IBookingRepository bookingRepository;

    @BeforeEach
    void setUp() {
        bookingRepository = BookingRepository.getRepository();
    }

    @Test
    void testCreateBooking() {
        LocalDate checkInDate = LocalDate.of(2025, 04, 01);
        LocalDate checkOutDate = LocalDate.of(2025, 04, 05);
        Booking newBooking = new Booking.Builder()
                .setBookingId(1)
                .setUserId(14900)
                .setAccommodationId(100)
                .setCheckInDate(checkInDate)
                .setCheckOutDate(checkOutDate)
                .setTotalPrice(500.0)
                .build();

        Booking createdBooking = bookingRepository.create(newBooking);

        assertNotNull(createdBooking);
        assertEquals(newBooking.getBookingId(), createdBooking.getBookingId());
        assertEquals(newBooking.getUserId(), createdBooking.getUserId());
    }

    @Test
    void testGetAllBookings() {
        LocalDate checkInDate1 = LocalDate.of(2025, 04, 01);
        LocalDate checkOutDate1 = LocalDate.of(2025, 04, 05);
        Booking booking1 = new Booking.Builder()
                .setBookingId(1)
                .setUserId(14900)
                .setAccommodationId(100)
                .setCheckInDate(checkInDate1)
                .setCheckOutDate(checkOutDate1)
                .setTotalPrice(500.0)
                .build();

        LocalDate checkInDate2 = LocalDate.of(2025, 05, 10);
        LocalDate checkOutDate2 = LocalDate.of(2025, 05, 15);
        Booking booking2 = new Booking.Builder()
                .setBookingId(2)
                .setUserId(14901)
                .setAccommodationId(101)
                .setCheckInDate(checkInDate2)
                .setCheckOutDate(checkOutDate2)
                .setTotalPrice(700.0)
                .build();

        bookingRepository.create(booking1);
        bookingRepository.create(booking2);

        assertEquals(2, bookingRepository.getAll().size());
    }

    @Test
    void testReadBooking() {
        LocalDate checkInDate = LocalDate.of(2025, 04, 01);
        LocalDate checkOutDate = LocalDate.of(2025, 04, 05);
        Booking newBooking = new Booking.Builder()
                .setBookingId(1)
                .setUserId(14900)
                .setAccommodationId(100)
                .setCheckInDate(checkInDate)
                .setCheckOutDate(checkOutDate)
                .setTotalPrice(500.0)
                .build();

        bookingRepository.create(newBooking);

        Booking readBooking = bookingRepository.read(1);

        assertNotNull(readBooking);
        assertEquals(1, readBooking.getBookingId());
        assertEquals(14900, readBooking.getUserId());
    }

    @Test
    void testUpdateBooking() {
        LocalDate checkInDate = LocalDate.of(2025, 04, 01);
        LocalDate checkOutDate = LocalDate.of(2025, 04, 05);
        Booking booking = new Booking.Builder()
                .setBookingId(1)
                .setUserId(14900)
                .setAccommodationId(100)
                .setCheckInDate(checkInDate)
                .setCheckOutDate(checkOutDate)
                .setTotalPrice(500.0)
                .build();

        bookingRepository.create(booking);

        booking.setTotalPrice(550.0);

        Booking updatedBooking = bookingRepository.update(booking);

        assertNotNull(updatedBooking);
        assertEquals(550.0, updatedBooking.getTotalPrice());
    }

    @Test
    void testDeleteBooking() {
        LocalDate checkInDate = LocalDate.of(2025, 04, 01);
        LocalDate checkOutDate = LocalDate.of(2025, 04, 05);
        Booking booking = new Booking.Builder()
                .setBookingId(1)
                .setUserId(14900)
                .setAccommodationId(100)
                .setCheckInDate(checkInDate)
                .setCheckOutDate(checkOutDate)
                .setTotalPrice(500.0)
                .build();

        bookingRepository.create(booking);

        boolean isDeleted = bookingRepository.delete(1);

        assertTrue(isDeleted);
        assertNull(bookingRepository.read(1));
    }
}

