package exerciciosjava6;

import java.util.Scanner;

public class ValidacaoSenha {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final String SENHA_CORRETA = "1234";
        String senhaDigitada;

        System.out.println("---  Validação de Senha  ---");
        System.out.print("Digite a senha: ");
        senhaDigitada = teclado.nextLine();

       
        while (!senhaDigitada.equals(SENHA_CORRETA)) {
            System.out.println("Senha incorreta!");
            System.out.print("Tente novamente: ");
            senhaDigitada = teclado.nextLine();
        }

        System.out.println("\nAcesso permitido!");

       
    }
}