package fr.efrei.domain;

/*
Payment
Payment model class
author: Luhlume Iarlaith Keamogetse Radebe (222804424)
Date: 27 March 2025
 */

public class Payment {
    private final String paymentId;
    private final double amount;
    private final String paymentMethod; // e.g., Credit Card, PayPal
    private final String bookingId; // Association with Booking

    // Private constructor to enforce the use of the Builder
    private Payment(Builder builder) {
        this.paymentId = builder.paymentId;
        this.amount = builder.amount;
        this.paymentMethod = builder.paymentMethod;
        this.bookingId = builder.bookingId;
    }

    // Getters
    public String getPaymentId() {
        return paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getBookingId() {
        return bookingId;
    }

    // Builder Class
    public static class Builder {
        private String paymentId;
        private double amount;
        private String paymentMethod;
        private String bookingId;

        public Builder(String paymentId) { // Required field
            this.paymentId = paymentId;
        }

        public Builder amount(double amount) {
            this.amount = amount;
            return this;
        }

        public Builder paymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Builder bookingId(String bookingId) {
            this.bookingId = bookingId;
            return this;
        }

        public Payment build() {
            // Validate fields
            if (paymentId == null || bookingId == null) {
                throw new IllegalArgumentException("Payment ID and Booking ID must not be null");
            }
            return new Payment(this);
        }
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId='" + paymentId + '\'' +
                ", amount=" + amount +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", bookingId='" + bookingId + '\'' +
                '}';
    }
}
