package com.endava.tech.cources.java.comments.rules;

public class Comment {

    static class ExampleCommentedCode {

        public static void main(String[] args) {
            // Declare two integer variables to hold values
            int x = 10;
            // int y = 23;
            int y = 20;
            // int z = 20;

            // Calculate the sum of the two variables
            int result = x + y;

            // Print the result to the console
            System.out.println(result);

            // Note: This operation will overwrite the value of x
            x = y;

            // The value of x is now equal to y
            System.out.println("The value of x is now: " + x);

        }
    }

    static class ExampleRedundantAndObviousComments {

        public static void main(String[] args) {
        }

        // Get customer information
        String getCustomerInfo(int customerId) {
            // Check if customer exists//
            boolean customerExists = checkCustomerExists(customerId);
            if (!customerExists) {
                return "Customer not found";
            }

            // Get customer data
            String customerData = retrieveCustomerData(customerId);
            return customerData;
        }

        private String retrieveCustomerData(int customerId) {
            return String.valueOf(customerId);
        }

        private boolean checkCustomerExists(int customerId) {
            //TODO: implementation in ticket 548
            return false;
        }
    }

}





