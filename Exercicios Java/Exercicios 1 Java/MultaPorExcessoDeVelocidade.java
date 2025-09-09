
package com.mycompany.exerciciosjava;

import java.util.Scanner;

public class MultaPorExcessoDeVelocidade {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Qual a velocidade do carro: ");
        double velo = teclado.nextDouble();
        
        if (velo > 80){ 
           double resul = velo * 5;
            System.out.println("Voce levou multa, ela ficou "+resul);
        }else if (velo < 80){
            System.out.println("Voce não levou multa.");
        }
        
        
        
        
        
    }
}
