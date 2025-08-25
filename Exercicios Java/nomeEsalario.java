

package com.mycompany.exerciciosjava;

import java.util.Scanner;


public class ExerciciosJava {

    public static void main(String[] args) {
        
       Scanner teclado = new Scanner(System.in);
       
        
        
        
        System.out.print("Qual o seu nome? ");
        String nome = teclado.nextLine();
        System.out.print("Qual o seu salario? ");
        double salario = teclado.nextDouble();
        
        System.out.println("O seu nome e "+ nome);
        System.out.println("O seu salario e "+ salario);    
    
    
    
    
    }
}
