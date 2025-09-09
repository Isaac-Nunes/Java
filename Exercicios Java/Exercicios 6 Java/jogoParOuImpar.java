package exerciciosjava6;

import java.util.Scanner;
import java.util.Random;

public class JogoParOuImpar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        String escolhaUsuario;
        
        System.out.println("--- Jogo de Par ou Ímpar ---");

        while (true) {
            System.out.print("\nEscolha 'par' ou 'impar' (ou digite 'sair' para encerrar): ");
            escolhaUsuario = teclado.next().toLowerCase();

            if (escolhaUsuario.equals("sair")) {
                break; 
            }
            if (!escolhaUsuario.equals("par") && !escolhaUsuario.equals("impar")) {
                System.out.println("Opção inválida! Tente novamente.");
                continue; 
            }

            System.out.print("Digite um número de 0 a 5: ");
            int numeroUsuario = teclado.nextInt();
       
            if (numeroUsuario < 0 || numeroUsuario > 5) {
                System.out.println("Número fora do intervalo permitido! Tente novamente.");
                continue;
            }

            int numeroComputador = random.nextInt(6); 
            int soma = numeroUsuario + numeroComputador;
            boolean somaEpar = (soma % 2 == 0);
            
            System.out.println("---------------------------------");
            System.out.println("Você jogou o número: " + numeroUsuario);
            System.out.println("O computador jogou o número: " + numeroComputador);
            System.out.println("A soma foi: " + soma + " (" + (somaEpar ? "PAR" : "ÍMPAR") + ")");
            System.out.println("---------------------------------");

            if ((somaEpar && escolhaUsuario.equals("par")) || (!somaEpar && escolhaUsuario.equals("impar"))) {
                System.out.println("===* PARABÉNS! Você ganhou! *===");
            } else {
                System.out.println("===* AHH, QUE TRISTE! O computador ganhou! *===");
            }
        }
        
        System.out.println("\nJogo encerrado. Obrigado por jogar!");
    }
}