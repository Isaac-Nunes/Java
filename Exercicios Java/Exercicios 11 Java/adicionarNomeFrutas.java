package exerciciosjava11;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class adicionarNomeFrutas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Set<String> frutas = new HashSet<>();

        frutas.add("Maça");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Uva");

        System.out.println("Lista atual: "+frutas);

        System.out.println("Digite o nome de uma das frutas para retirar da lista(Digite do jeito que esta na lista): ");
        String fruta = teclado.nextLine();

        if (frutas.contains(fruta)) {
            frutas.remove(fruta);
            System.out.println("Lista atualizada: " + frutas);

        } else {
            System.out.println("Comando errado.");
        }

    }
}
