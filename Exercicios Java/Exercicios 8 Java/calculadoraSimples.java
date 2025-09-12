package exerciciosjava7;

import java.util.Scanner;

public class calculadoraSimples {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        
        System.out.println("---------------------------");
        System.out.println("        CALCULADORA        ");
        System.out.println("---------------------------");

        System.out.println("[1] Subtração");
        System.out.println("[2] Adição");
        System.out.println("[3] Divisão");
        System.out.println("[4] Multiplicação");
        int opcao = teclado.nextInt();

        System.out.print("Digite o primeiro numero para a operação matematica: ");
        int num1 = teclado.nextInt();

        System.out.print("Digite o segundo numero para a operação matematica: ");
        int num2 = teclado.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("O resultado ficou "+ (num1 - num2));
            break;
            case 2:
                System.out.println("O resultado ficou "+ (num1 + num2));
            break;
            case 3:
                System.out.println("O resultado ficou "+ (num1 / num2));
            break;
            case 4:
                System.out.println("O resultado ficou "+ (num1 * num2));
            break;
            default: 
                System.out.println("Digite uma das opções");
            break;
        }

    }

}
