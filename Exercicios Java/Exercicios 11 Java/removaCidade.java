package exerciciosjava11;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class removaCidade {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Set<String> cidades = new HashSet<>();

        System.out.print("Quantas cidades você quer adicionar a lista: ");
        int num = teclado.nextInt();
        teclado.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.println("Digite a " + (i + 1) + " cidade");
            String cidade = teclado.nextLine();
            cidades.add(cidade);
        }

        System.out.println("Lista atual: " + cidades);

        System.out.println("Digite o nome de uma das cidades para retirar da lista(Digite do jeito que esta na lista): ");
        String cdd = teclado.nextLine();

        if (cidades.contains(cdd)) {
            cidades.remove(cdd);
            System.out.println("Lista atualizada: " + cidades);

        } else {
            System.out.println("Comando errado.");
        }

    }
}
