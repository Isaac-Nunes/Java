
package com.mycompany.exerciciosjava;

import java.util.Scanner;

public class AprovadoOuReprovado {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Qual o seu nome: ");
        String nome = teclado.nextLine();
        
        System.out.print("Qual a sua primeira nota: ");
        double n1 = teclado.nextDouble();
        System.out.print("Qual a sua segunda nota: ");
        double n2 = teclado.nextDouble();
        
        double media = (n1 + n2) / 2;
        
        if (media < 7){
            System.out.println(nome +" voce ficou de recuperacao.");
        }else{
            System.out.println(nome +" voce nao ficou de recuperacao.");
        
    }
        
        
        
        
    }
 
}
