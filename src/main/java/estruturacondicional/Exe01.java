package estruturacondicional;

import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args){
        //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Informe um número inteiro: ");
        num = sc.nextInt();

        if (num > 0 || num == 0){
            System.out.println("NAO NEGATIVO");
        }else{
            System.out.println("NEGATIVO");
        }

    }
}
