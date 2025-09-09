package exerciciosFor;

import java.util.Scanner;

public class caracterEnumero {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um caracter: ");
        String carac = teclado.nextLine();
        
        System.out.print("Digite o numero de vezes que você quer que o caracter repita: ");
        int num = teclado.nextInt();
        
        for (int i = 1; i <= num; i++) {
            System.out.println(i+"-"+carac);
        }
        
        
        
        
        
        
        
        
        
        
    }
 
}
