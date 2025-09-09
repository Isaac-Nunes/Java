
package com.mycompany.exerciciosjava;

import java.util.Scanner;


public class pintandoAParede {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Qual a altura do quarto: ");
        double alt = teclado.nextDouble();
        System.out.print("Qual a largura do quarto: ");
        double lar = teclado.nextDouble();
        
        double area = 2 * (alt * lar);
        double litros = area ;
        
        System.out.println("Sera necessario "+ litros+" de tinta");
        
        
        
        
        
        
        
        
        
    }
}
