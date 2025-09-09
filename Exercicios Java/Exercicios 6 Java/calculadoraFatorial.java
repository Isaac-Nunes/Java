package exerciciosjava6;

import java.util.Scanner;

public class CalculadoraFatorial {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("--- Calculadora de Fatorial ---");
        System.out.print("Digite um número inteiro não negativo para calcular o fatorial: ");
        numero = teclado.nextInt();

        
        if (numero < 0) {
            System.out.println("\nErro: Não é possível calcular o fatorial de um número negativo.");
        } else {
            long fatorial = 1;
            int contador = numero;

            while (contador > 0) {
                fatorial *= contador;
                contador--;
            }
            
            System.out.printf("\nO fatorial de %d (!%d) é %d.\n", numero, numero, fatorial);
        }
        
      
    }
}