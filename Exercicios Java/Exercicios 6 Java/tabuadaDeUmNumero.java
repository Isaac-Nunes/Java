package exerciciosjava6;

import java.util.Scanner;

public class TabuadaNumero {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("--- Tabuada de um Número ---");
        System.out.print("Digite um número inteiro positivo para ver sua tabuada: ");
        numero = teclado.nextInt();

        
        if (numero > 0) {
            System.out.println("\nTabuada do " + numero + ":");
            
            int multiplicador = 1;
            while (multiplicador <= 10) {
                int resultado = numero * multiplicador;
                System.out.printf("%d x %d = %d\n", numero, multiplicador, resultado);
                multiplicador++;
        } else {
            System.out.println("\nErro: O número digitado não é positivo.");
        }
        
        
    }
}