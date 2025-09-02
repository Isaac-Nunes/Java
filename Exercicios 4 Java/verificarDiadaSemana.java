package exerciciosquatro;

import java.util.Scanner;

public class verificarDiadaSemana {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("informe um dia da semana (ex.: segunda): ");
        String dia = teclado.nextLine();
        
        if ((dia.equalsIgnoreCase("segunda")) || (dia.equalsIgnoreCase("Terça")) || (dia.equalsIgnoreCase("Quarta")) || (dia.equals("Quinta")) || (dia.equalsIgnoreCase("Sexta"))){
            System.out.println("Hoje é um dia útil da semana.");
        }else if ((dia.equalsIgnoreCase("Sábado")) || (dia.equalsIgnoreCase("Domingo"))){
            System.out.println("Hoje é fim de semana.");
        }else{
            System.out.println("Digite um dia válido.");
        }
        
        
        
        
        
        
        
        
        
        
    }
 
}
