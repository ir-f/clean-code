package com.endava.tech.cources.java.understability.tips;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class NegativeCondition {

    public static void main(String[] args) throws MalformedURLException {
        Costumer customer = new Costumer();
        File file = new File(String.valueOf(new URL("https://about.twitter.com/content/dam/about-twitter/x/large-x-logo.png.twimg.1920.png")));
        int number = 6;

        if (!customer.isEligibleForDiscount()) {
            // code to apply regular price
        }

        if (!file.exists()) {
            // code to create the file
        }

        if (!(number >= 0 && number <= 100)) {
            // code to handle the number being outside of the range
        }
    }

    private static class Costumer {
        boolean isEligibleForDiscount() {
            return true;
        }
    }
}
