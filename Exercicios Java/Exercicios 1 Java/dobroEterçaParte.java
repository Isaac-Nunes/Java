package com.mycompany.exerciciosjava;

import java.util.Scanner;

public class dobroEterçaParte {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um numero hexadecimal: ");
        double num1 = teclado.nextDouble();

        double dobro = (num1 * 2);
        double terco = (num1 / 3);

        String dobroFormatado = String.format("%.1f", dobro);
        String tercoFormatado = String.format("%.4f", terco);
        
        System.out.println("O dobro do numero digitado e " + dobroFormatado);
        System.out.println("O teco do valor digitado e " + tercoFormatado);

    }

}
