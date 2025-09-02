package exerciciosquatro;

import java.util.Scanner;

public class ExerciciosQuatro {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        
        if (nome.length() > 5){
            System.out.println("O seu nome contém mais de 5 caracteres.");
        }else if (nome.length() == 5){
            System.out.println("O seu nome tem 5 caracteres.");
        }else{
            System.out.println("O seu nome contém menos de 5 caracteres.");
        }
        
        
        
        
        
        
        
        
    }
    
}
