package com.mycompany.exerciciosjava2;

import java.util.Scanner;

public class mediaAritimetica {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double num1 = teclado.nextDouble();

        System.out.print("Digite um segundo numero: ");
        double num2 = teclado.nextDouble();

        System.out.print("Digite um terceiro numero: ");
        double num3 = teclado.nextDouble();

        double media = (num1 + num2 + num3) / 3;

        System.out.println("A media ficou: " + media);

    }

}
