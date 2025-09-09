package com.mycompany.exerciciosjava2;

import java.util.Scanner;

public class conversorCelsius {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double cel = teclado.nextDouble();

        double fahr = cel * 9 / 5 + 32;

        System.out.println("A temperatura em Fahrenheit foi: " + fahr);

    }

}
