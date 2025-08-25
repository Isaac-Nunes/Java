package com.mycompany.exerciciosjava;

import java.util.Scanner;

public class conversorDeMedidas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite uma distancia em metros: ");
        double metros = teclado.nextDouble();
        
        double cent = metros * 100;
        double km = metros * 1000;
        
        System.out.println("A distancia em centimetros e: "+ cent);
        System.out.println("A distancia em Km e: "+ km);
        
           
        
        
        
    
    }

}
