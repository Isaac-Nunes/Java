
package com.mycompany.exerciciosjava2;

import java.util.Scanner;

public class areaDocirculo {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Qual o raio do circulo: ");
        double raio = teclado.nextDouble();
        
        double area = 3.14 * (raio * raio);
        
        System.out.println("A area do circulo e "+area);
        
        
        
        
        
    }
 
}
