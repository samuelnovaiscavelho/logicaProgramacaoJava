package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codPeca1, numPecas1, codPeca2, numPecas2;
        double valorUnitPorPeca1, valorUnitPorPeca2, valorPagar;

        codPeca1 = sc.nextInt();
        numPecas1 = sc.nextInt();
        valorUnitPorPeca1 = sc.nextDouble();

        codPeca2 = sc.nextInt();
        numPecas2 = sc.nextInt();
        valorUnitPorPeca2 = sc.nextDouble();

        valorPagar = numPecas1 * valorUnitPorPeca1 + numPecas2 * valorUnitPorPeca2;

        System.out.printf("VALOR A PAGAR: R$ %.2f", valorPagar);

    }
}
