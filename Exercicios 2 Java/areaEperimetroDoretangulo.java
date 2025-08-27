package com.mycompany.exerciciosjava2;

import java.util.Scanner;

public class areaEperimetroDoretangulo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual a altura do triangulo: ");
        double alt = teclado.nextDouble();

        System.out.print("Qual a base do triangulo: ");
        double base = teclado.nextDouble();

        double area = (alt * base) / 2;

        System.out.println("A area do triangulo é " + area);

    }

}
