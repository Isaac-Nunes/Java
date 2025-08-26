
package com.mycompany.exerciciosjava;

import java.util.Scanner;

public class AlugueldeCarro {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Quantos Km foram percorridos: ");
        double Km = teclado.nextDouble();
        System.out.print("O carro foi alugado por quantos dias: ");
        double dias = teclado.nextDouble();
        
        double valorF = (dias * 90) + (Km * 0.20);
        
        System.out.println("O valor final ficou "+valorF);
        
        
        
        
    }
 
}
