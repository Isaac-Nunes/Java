package exerciciosquatro;

import java.util.Scanner;

public class verificadorDeEmail {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite seu E-mail para verificarmos: ");
        String email = teclado.nextLine();
        
        if (email.contains("@") && email.endsWith(".com")) {
            System.out.println("E-mail valido.");
        }else{
            System.out.println("E-mail inválido.");
        }
        
        
        
        
        
        
        
        
    }
}
