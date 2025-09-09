package exerciciosquatro;

import java.util.Scanner;

public class classificadorLogin {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite seu login: ");
        String login = teclado.nextLine();
        
        if (login.length() >= 6 && !login.contains(" ")) {
            System.out.println("Login válido. Bem vindo(a)");
        }else{
            System.out.println("Login inválido!");
        }
            
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
