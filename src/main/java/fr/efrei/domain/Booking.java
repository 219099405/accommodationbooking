/*
Booking POJO
Author: Laverne Rollison (221219455)
Date 27 March 2025
 */

package fr.efrei.domain;

import java.time.LocalDate;

public class Booking {
    private int bookingId;
    private int userId;
    private int accommodationId;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private double totalPrice;


    private Booking(){}

    private Booking(Builder builder){
        this.bookingId = builder.bookingId;
        this.userId = builder.userId;
        this.accommodationId = builder.accommodationId;
        this.checkInDate = builder.checkInDate;
        this.checkOutDate = builder.checkOutDate;
        this.totalPrice = builder.totalPrice;
    }

    public int getBookingId() {
        return bookingId;
    }

    public int getUserId() {
        return userId;
    }

    public int getAccommodationId() {
        return accommodationId;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Booking {" +
                "bookingId=" + bookingId +
                ", userId=" + userId +
                ", accommodationId=" + accommodationId +
                ", checkInDate=" + checkInDate +
                ", checkOutDate=" + checkOutDate +
                ", totalPrice=" + totalPrice +
                '}';
    }

    public static class Builder {
        private int bookingId;
        private int userId;
        private int accommodationId;
        private LocalDate checkInDate;
        private LocalDate checkOutDate;
        private double totalPrice;

        public Builder setBookingId(int bookingId) {
            this.bookingId = bookingId;
            return this;
        }

        public Builder setUserId(int userId) {
            this.userId = userId;
            return this;
        }

        public Builder setAccommodationId(int accommodationId) {
            this.accommodationId = accommodationId;
            return this;
        }

        public Builder setCheckInDate(LocalDate checkInDate) {
            this.checkInDate = checkInDate;
            return this;
        }

        public Builder setCheckOutDate(LocalDate checkOutDate) {
            this.checkOutDate = checkOutDate;
            return this;
        }

        public Builder setTotalPrice(double totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }
        public Booking build() {
            return new Booking(this);
        }


    }


}
