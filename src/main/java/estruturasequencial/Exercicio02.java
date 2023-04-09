package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valorRaio, π = 3.14159, area;

        valorRaio = sc.nextDouble();

        //A = Math.pow(x, y);
        area = π * (Math.pow(valorRaio, 2));

        System.out.printf("A= %.4f", area);

    }
}
