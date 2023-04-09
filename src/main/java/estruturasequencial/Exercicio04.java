package estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numeroFuncionario, horasTrabalhada;
        double recebePorHora, salario;

        numeroFuncionario = sc.nextInt();
        horasTrabalhada = sc.nextInt();
        recebePorHora = sc.nextDouble();

        salario = horasTrabalhada * recebePorHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f",salario);



    }
}
