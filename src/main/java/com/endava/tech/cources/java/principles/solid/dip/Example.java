package com.endava.tech.cources.java.principles.solid.dip;

public class Example {

    class EmailSender {

        public void sendEmail(String email, String subject, String message) {
            // Connect to the email server and send the email
        }
    }

    class OrderService {

        private EmailSender emailSender;

        public OrderService() {
            this.emailSender = new EmailSender();
        }

        public void processOrder(String email, String order) {
            // Process the order
            emailSender.sendEmail(email, "Order Confirmation", "Your order has been processed: " + order);
        }
    }
}
