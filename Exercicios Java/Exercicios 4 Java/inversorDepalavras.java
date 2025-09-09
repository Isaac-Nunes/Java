package exerciciosquatro;

import java.util.Scanner;

public class inversorDepalavras {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite uma palavra para inverter: ");
        String palavra = teclado.nextLine();
        
        String invertida = new StringBuilder(palavra).reverse().toString();
        
        System.out.println("A palavra invertida ficou assim: "+invertida);
        
        
        
        
        
        
        
    }
}
