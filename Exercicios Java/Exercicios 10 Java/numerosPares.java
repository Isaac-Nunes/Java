package exerciciosjava10;

import java.util.ArrayList;
import java.util.Scanner;

public class numerosPares {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();

        System.out.print("Quantos numeros você quer digitar: ");
        int num2 = teclado.nextInt();

        for (int i = 0; i < num2; i++) {
            System.out.print("Digite um numero: ");
            int num3 = teclado.nextInt();

            num.add(num3);
        }

        for (int num4 : num) {
            if (num4 % 2 == 0) {
                int num5 = num4;
                            System.out.println("Os numeros pares são " +num5);

            }
        }

    }
}
