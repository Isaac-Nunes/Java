
package com.mycompany.exerciciosjava;

import java.util.Scanner;

public class DireitoAoVoto {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Qual o seu ano de nascimento: ");
        int ano = teclado.nextInt();
        
        int anoPV = 2025 - ano;
        
        if (anoPV < 16){
            System.out.println("Voce nao pode votar.");
        }else if (anoPV >= 16){
            System.out.println("Voce pode votar, pois tem 16 anos ou mais.");
        }
        
        
        
        
        
    }
}
