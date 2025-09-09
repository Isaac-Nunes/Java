package exerciciosquatro;

import java.util.Scanner;

public class contadorDePalavras {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite uma frase ou texto: ");
        String frase = teclado.nextLine();
        
        if (frase.trim().isEmpty()){
            System.out.println("A frase não contém palavras.");
        }else{
            String[] palavras = frase .trim().split("\\s+");
            int numeroDePalavras = palavras.length;
            System.out.println("A frase/texto contém "+ numeroDePalavras +" palavras.");
        }
       
        
    }
}
