package org.example;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String nome = "Maria";
        int idade = 31;
        double renda = 2100.00;
        double x = 10.35784;
        System.out.println(x);
        System.out.printf("%.2f\n", x);
        System.out.printf("%.4f%n", x);

        //Para deixar com ponto ao invés de virgula o valor ex: 10.3578
        //   %f = ponto flutuante
        //   %d = inteiro
        //   %s = texto
        //   %n = quebra de linha

        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
        System.out.println("Resultado = " + x + " Metros");
        System.out.printf("Resultado = %.2f metros%n", x);
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);


    }
}