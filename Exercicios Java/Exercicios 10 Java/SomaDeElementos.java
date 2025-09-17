package exerciciosjava10;

import java.util.ArrayList;
import java.util.Scanner;

public class SomaDeElementos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos números você quer somar? ");
        int quantidade = teclado.nextInt();

        int[] numeros = new int[quantidade];

        System.out.println("Digite os " + quantidade + " números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }

        System.out.println("A soma dos elementos do array é: " + soma);

    }
}




