package com.endava.tech.cources.java.principles.kiss;

public class TemperatureConverter {

    // Constants to represent absolute zero in Celsius and Fahrenheit
    private static final double ABSOLUTE_ZERO_IN_CELSIUS = -273.15;
    private static final double ABSOLUTE_ZERO_IN_FAHRENHEIT = -459.67;

    // Conversion factors for Celsius to Fahrenheit and vice versa
    private static final double FAHRENHEIT_TO_CELSIUS_FACTOR = 5 / 9.0;
    private static final double CELSIUS_TO_FAHRENHEIT_FACTOR = 9 / 5.0;

    /**
     * Converts a temperature from Celsius to Fahrenheit.
     *
     * @param celsius the temperature in Celsius
     * @return the temperature in Fahrenheit
     * @throws IllegalArgumentException if the input temperature is below absolute zero
     */
    public double convertCelsiusToFahrenheit(double celsius) {
        // Validate the input temperature
        if (celsius <= ABSOLUTE_ZERO_IN_CELSIUS) {
            throw new IllegalArgumentException("Temperature below absolute zero.");
        }

        // Convert the temperature to Fahrenheit
        double fahrenheit = (celsius * CELSIUS_TO_FAHRENHEIT_FACTOR) + ABSOLUTE_ZERO_IN_FAHRENHEIT;

        // Return the result
        return fahrenheit;
    }
}

class BetterTemperatureConverter {

    public double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
