
package com.mycompany.exerciciosjava;

import java.util.Scanner;

public class pratiqueTudo {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Escolha um Numero: ");
        double n1 = teclado.nextDouble();
        
        System.out.print("Escolha um segundo Numero: ");
        double n2 = teclado.nextDouble();
        
        double total;
        
        System.out.println("========PRATIQUE========");
        System.out.println("========================");
        System.out.println("[1] Multiplicação");
        System.out.println("[2] Soma");
        System.out.println("[3] Subtração");
        System.out.println("[4] Divisão");
        System.out.println("[5] Raiz Quadrada de "+ n1);
        System.out.println("[6] Raiz Quadrada de "+ n2);
        System.out.println("[7] Potencia");
        int resp = teclado.nextInt();
        
        if (resp == 1){
         total = n1 * n2;
            System.out.println("O total ficou: "+total);
        }else if (resp == 2){
            total = n1 + n2;
            System.out.println("O total ficou: "+total);
        }else if (resp == 3){
            total = n1 - n2;
            System.out.println("O total ficou: "+total);
        }else if (resp == 4){
            total = n1 / n2;
            System.out.println("O total ficou: "+total);
        }else if (resp == 5){
            total = Math.sqrt(n1);
            System.out.println("O total ficou: "+total);
        }else if (resp == 6){
            total = Math.sqrt(n2);
            System.out.println("O total ficou: "+total);
        }else if (resp == 7){
            total = Math.pow(n2, n2);
            System.out.println("O total ficou: "+total);
        }
        
        
        
        
        
        
        
        
        
        
        
    }
}
