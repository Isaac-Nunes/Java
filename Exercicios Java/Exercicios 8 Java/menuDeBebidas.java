import java.util.Scanner;

public class MenuDeBebidas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- MENU DE BEBIDAS ---");
        System.out.println("1- Refrigerante");
        System.out.println("2- Suco");
        System.out.println("3- Água");
        System.out.print("Escolha uma opção (1, 2 ou 3): ");

        int escolha = teclado.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Você selecionou Refrigerante.");
                break; 
            case 2:
                System.out.println("Você selecionou Suco.");
                break;
            case 3:
                System.out.println("Você selecionou Água.");
                break;
            default: 
                System.out.println("Opção inválida.");
                break;
        }

    }
}