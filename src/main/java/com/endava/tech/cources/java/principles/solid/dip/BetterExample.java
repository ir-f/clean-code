package com.endava.tech.cources.java.principles.solid.dip;

public class BetterExample {

    interface EmailService {

        void sendEmail(String email, String subject, String message);
    }

    class EmailSender implements EmailService {

        @Override
        public void sendEmail(String email, String subject, String message) {
            // Connect to the email server and send the email
        }
    }

    class OrderService {

        private EmailService emailService;

        public OrderService(EmailService emailService) {
            this.emailService = emailService;
        }

        public void processOrder(String email, String order) {
            // Process the order
            emailService.sendEmail(email, "Order Confirmation", "Your order has been processed: " + order);
        }
    }

}
