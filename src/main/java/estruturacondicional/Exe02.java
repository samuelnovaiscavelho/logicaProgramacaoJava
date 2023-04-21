package estruturacondicional;

import java.util.Scanner;

public class Exe02 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Informe um número inteiro: ");
        num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
    }
}
