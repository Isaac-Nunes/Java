
package com.mycompany.exerciciosjava2;

import java.time.Duration;
import java.util.Scanner;

public class minutosParahoras {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Quantos minutos sao para converter em horas: ");
        int min = teclado.nextInt();
        
       Duration duracao = Duration.ofMinutes(min);
       long horas = duracao.toHours();
       long minutos = duracao.toMinutesPart();
       
        System.out.println(min+" minutos e igual a "+horas+" horas  e "+ minutos+ " minutos.");
        
        
        
        
        
        
        
    }
}
