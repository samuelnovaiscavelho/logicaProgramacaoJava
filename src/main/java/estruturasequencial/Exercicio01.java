package estruturasequencial;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        int valor1, valor2, soma;

        Scanner sc = new Scanner(System.in);

        valor1 = sc.nextInt();
        valor2 = sc.nextInt();

        soma = valor1 + valor2;

        System.out.println("SOMA = " + soma);

        sc.close();
    }
}
