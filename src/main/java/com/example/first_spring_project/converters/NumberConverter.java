package com.example.first_spring_project.converters;

public class NumberConverter {
    public static double convertToDouble(String numberStr) {
        String formattedNumberStr = numberStr.replaceAll(",", ".");

        return Double.parseDouble(formattedNumberStr);
    }

    public static boolean isNumeric(String numberStr) {
        if (numberStr == null) return false;

        String formattedNumberStr = numberStr.replaceAll(",", ".");

        return formattedNumberStr.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
