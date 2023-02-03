package com.endava.tech.cources.java.function.rules;

public class BetterFunction {

    public void processOrder(Order order) {
        validateOrder(order);
        updateInventory(order);
        sendInvoice(order);
        sendConfirmation(order);
    }

    private void validateOrder(Order order) {
        if (order == null) {
            throw new IllegalArgumentException("Order cannot be null");
        }
    }

    private void updateInventory(Order order) {
    }

    private void sendInvoice(Order order) {
    }

    private void sendConfirmation(Order order) {
    }
}
