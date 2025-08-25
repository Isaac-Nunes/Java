package com.mycompany.exerciciosjava;

import java.util.Scanner;

public class conversorDeMoedas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos reais voce tem na carteira? ");
        double reais = teclado.nextDouble();

        double dolar = reais / 5.45;

        String dolarFormatado = String.format("%.2f", dolar);

        System.out.println("Seu valor em dolares e: " + dolarFormatado);

    }

}
