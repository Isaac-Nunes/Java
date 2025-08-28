package aula2;

import java.util.Scanner;

public class hipotenusaDetriangulo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor do Cateto 'A': ");
        double a = teclado.nextDouble();

        System.out.print("Digite o valor do Cateto 'B': ");
        double b = teclado.nextDouble();

        double c = Math.sqrt((a * a) + (b * b));

        System.out.println("O valor da hipotenusa é: " + c);

    }

}
