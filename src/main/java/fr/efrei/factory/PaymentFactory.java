package fr.efrei.factory;


import fr.efrei.domain.Payment;
import fr.efrei.util.Helper;

/*
PaymentFactory.java
PaymentFactory factory
Author: Luhlume Iarlaith Keamogetse Radebe (222804424)
Date: 28 March 2025
 */

public class PaymentFactory {

    public static Payment createPayment(String paymentId, double amount, String paymentMethod, String bookingId) {
        // Validate the required fields using Helper
        if (Helper.isNullOrEmpty(paymentId) || Helper.isNullOrEmpty(bookingId)) {
            return null;
        }

        // Create and return the Payment object using the Builder pattern
        return new Payment.Builder(paymentId)
                .amount(amount)
                .paymentMethod(paymentMethod)
                .bookingId(bookingId)
                .build();
    }
}

