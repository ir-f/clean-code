package com.endava.tech.cources.java.function.rules;

public class Function {

    public void processOrder(Order order, Customer customer, Inventory inventory, Payment payment) {
        if (order == null) {
            throw new IllegalArgumentException("Order cannot be null");
        }

        if (customer == null) {
            throw new IllegalArgumentException("Customer cannot be null");
        }

        if (!inventory.checkStock(order.getProductId(), order.getQuantity())) {
            throw new IllegalStateException("Not enough stock");
        }

        if (!payment.charge(customer.getCreditCard(), order.getTotalCost())) {
            throw new IllegalStateException("Payment failed");
        }

        inventory.decreaseStock(order.getProductId(), order.getQuantity());
        order.setStatus(OrderStatus.PROCESSED);
        customer.addOrder(order);
        payment.addTransaction(new Transaction(customer.getId(), order.getTotalCost()));
    }

    class Customer {

        private int id;
        private int creditCard;

        public int getCreditCard() {
            return creditCard;
        }

        public int getId() {
            return id;
        }

        public void addOrder(Order order) {
        }
    }

    class Inventory {

        public boolean checkStock(int productId, int quantity) {
            return true;
        }

        public void decreaseStock(int productId, int quantity) {
        }
    }

    class Payment {

        public boolean charge(int creditCard, int totalCost) {
            return true;
        }

        public void addTransaction(Transaction transaction) {
        }
    }

    record Transaction(int customerId, int total) {

    }
}

class Order {

    private int productId;
    private int quantity;
    private int totalCost;
    private OrderStatus status;

    public int getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
