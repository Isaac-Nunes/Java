package exerciciosjava10;

import java.util.ArrayList;
import java.util.Scanner;

public class reverterString {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<String> palavra = new ArrayList<>();

//        String invertido = null, palavras = null;
        System.out.print("Quantas vezes você quer digitar uma palavra: ");
        int num = teclado.nextInt();
        teclado.nextLine();
//        System.out.println("Digite uma palavra: ");
//        palavras = teclado.nextLine();
        for (int i = 0; i < num; i++) {

            System.out.print("Digite uma frase: "+ (i + 1)+ " : ");
            String fraseOriginal = teclado.nextLine();

            palavra.add(fraseOriginal);
            
            String invertido = "";

//            palavra.add(palavras);

            for (char letra : fraseOriginal.toCharArray()) {
                invertido = letra + invertido;
            }
            System.out.println("Frase invertida: "+ invertido);
// System.out.println(invertido);
//
//        for (int i = 0; i < num; i++) {
//
//            System.out.println("Digite uma palavra: ");
//            String palavras = teclado.nextLine();
//           
//            
//            // palavra.add(palavras);
//        }
        }
//        for(String frasess : palavras
//        System.out.println("As palavras invertidas ficaram assim: " + invertido);

//        for(char frase : palavras.toCharArray()){
//            System.out.println(frase);
//        }
    }
}
