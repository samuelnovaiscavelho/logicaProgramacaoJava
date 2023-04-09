package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float A,B,C;

        A = sc.nextFloat();
        B = sc.nextFloat();
        C = sc.nextFloat();

        float areaTrianguloRetangulo = A * C / 2;
        float circuloRaio = (float) ((Math.pow(C,2.0f)) * 3.14159f);
        float areaTrapezio = (A + B) * C / 2;
        float areaQuadrado =  B * B;
        float areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f", areaTrianguloRetangulo);
        System.out.printf("\nCIRCULO: %.3f", circuloRaio);
        System.out.printf("\nTRAPEZIO: %.3f", areaTrapezio);
        System.out.printf("\nQUADRADO: %.3f", areaQuadrado);
        System.out.printf("\nRETANGULO: %.3f", areaRetangulo);

    }
}
