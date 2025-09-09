
package com.mycompany.exerciciosjava;

import java.util.Scanner;

public class salárioDoCupincha {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Quantos dias voce trabalhou: ");
        double dias = teclado.nextDouble();
        
        double resul = dias * 200;
        
        System.out.println("voce vai ganhar "+resul+" no seu novo salario");
        
        
        
        
        
    }
   
}
