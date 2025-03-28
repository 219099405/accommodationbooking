/*
Booking Repository extends IBookingRepository interface
Author: Laverne Rollison (221219455)
Date 28 March 2025
 */

package fr.efrei.Repository;
import fr.efrei.domain.Booking;

import java.util.List;

public interface IBookingRepository extends IRepository<Booking, Integer> {
    List<Booking> getAll();

    Booking create(Booking booking);
    Booking read(Integer bookingId);
    Booking update(Booking booking);
    boolean delete(Integer bookingId);


}
