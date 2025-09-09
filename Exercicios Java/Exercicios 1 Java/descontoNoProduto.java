
package com.mycompany.exerciciosjava;

import java.util.Scanner;

public class descontoNoProduto {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Qual o valor do produto: ");
        int valor = teclado.nextInt();
        double desc = valor * 0.05;
        double result = valor - desc;
        
        System.out.printf("Ficou %.2f%n",result);
               
        
        
        
        
        
        
    }
}
