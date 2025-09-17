package exerciciosjava10;

import java.util.ArrayList;
import java.util.Scanner;

public class contarElementos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();

        
        for (int i = 0; i < 5; i++) {
            
        System.out.print("Digite um numero: ");
        int num1 = teclado.nextInt();

        num.add(num1);
        }

        for (int num2 : num) {
            if (num2 > 10) {
                int num3 = num2;
                System.out.println("O numero digitado maior que 10 é: "+num3);
            }
        }

    }
}
