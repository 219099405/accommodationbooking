package fr.efrei.factory;



import fr.efrei.domain.Payment;
import fr.efrei.util.Helper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*PaymentFactoryTest.java
 PaymentFactory Test
 Author: Luhlume Iarlaith Keamogetse Radebe (222804424)
 Date: 28 March 2025
 */

class PaymentFactoryTest {

    @Test
    void testCreatePaymentSuccess() {
        String paymentId = "P12345";
        double amount = 150.75;
        String paymentMethod = "Credit Card";
        String bookingId = "B67890";

        Payment payment = PaymentFactory.createPayment(paymentId, amount, paymentMethod, bookingId);

        assertNotNull(payment); // Ensure the object is created
        assertEquals(paymentId, payment.getPaymentId());
        assertEquals(amount, payment.getAmount());
        assertEquals(paymentMethod, payment.getPaymentMethod());
        assertEquals(bookingId, payment.getBookingId());
    }

    @Test
    void testCreatePaymentWithNullFields() {
        String paymentId = null;
        double amount = 100.00;
        String paymentMethod = "PayPal";
        String bookingId = null;

        Payment payment = PaymentFactory.createPayment(paymentId, amount, paymentMethod, bookingId);

        assertNull(payment); // Ensures the factory handles null 
    }

    @Test
    void testCreatePaymentWithDefaults() {
        String paymentId = "P54321";
        String bookingId = "B98765";

        Payment payment = PaymentFactory.createPayment(paymentId, 0.0, "Unknown", bookingId);

        assertNotNull(payment); // Ensure the object is created
        assertEquals(paymentId, payment.getPaymentId());
        assertEquals(0.0, payment.getAmount());
        assertEquals("Unknown", payment.getPaymentMethod());
        assertEquals(bookingId, payment.getBookingId());
    }
}

