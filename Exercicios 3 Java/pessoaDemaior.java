
package aula2;

import java.util.Scanner;

public class pessoaDemaior {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Qual a sua idade: ");
        int idade = teclado.nextInt();
        
        if (idade < 18){
            System.out.println("Você é de menor e não pode dirigir.");
        }else{
            System.out.println("Você é de maior e pode dirigir.");
        }
        
        
        
        
        
        
        
        
    }
}
