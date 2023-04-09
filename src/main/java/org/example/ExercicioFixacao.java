package org.example;

import java.util.Locale;

public class ExercicioFixacao {
    public static void main(String[] args){
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products: ");
        System.out.printf("Computer, which price is $ %.2f ", price1);
        System.out.printf("\nOffice desk, which price is $ %.2f", price2);
        System.out.println("\n\nRecord: " + age + " years old, code " + code + " and gender: " + gender + "\n");
        System.out.printf("Measue with eight decimal places: %.8f", measure);
        System.out.printf("\nRouded (three decimal places): %.3f", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("\nUS decimal point: %.3f", measure);
    }
}
