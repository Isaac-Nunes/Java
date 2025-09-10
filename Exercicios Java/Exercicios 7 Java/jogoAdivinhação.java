package exercicios7dowhile;

import java.util.Random;
import java.util.Scanner;

public class jogoAdivinhação {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num;
        int num1;

        Random adivinhar = new Random();
        num1 = adivinhar.nextInt(100) + 1;

        do {
            System.out.println("---------------------------------------");
            System.out.println("            JOGO ADIVINHÇÃO            ");
            System.out.println("---------------------------------------");

            System.out.print("Digite um numero para tentar acertar (entre 1 e 100): ");
            num = teclado.nextInt();

            if (num < num1) {
                System.out.println("MAIOR!!");
            } else if (num > num1) {
                System.out.println("MENOR!!");
            }

            System.out.println(num1);
        } while (num != num1);
        System.out.println("VOCÊ ACERTOU, PARABÉNS.");
    }

}
