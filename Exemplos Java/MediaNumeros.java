package com.mycompany.exemplosoma;

import java.util.Scanner;

public class MediaNumeros {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println(" ## Media dos numeros ## ");
        System.out.println("Digite um numero: ");
        int num1 = teclado.nextInt();
        System.out.println("Digite outro numero: ");
        int num2 = teclado.nextInt();
        int resultado;
        resultado = (num1 + num2) / 2;
        System.out.println("A media das suas notas foi: " + resultado);

    }

}
