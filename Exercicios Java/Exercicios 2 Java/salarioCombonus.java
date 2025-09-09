
package com.mycompany.exerciciosjava2;

import java.util.Scanner;

public class salarioCombonus {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Qual o seu salario: ");
        double salario = teclado.nextDouble();
        
        System.out.print("Qual o seu bonus em porcentagem(ex:15): ");
        double bonus = teclado.nextDouble();
        
        
        
        double bns = bonus / 100;
        double slrSomar = salario * bns;
        double slFinal = salario + slrSomar; 
                
        System.out.println("O seu salario final ficou: "+slFinal);
        
        
        
    }
 
}
