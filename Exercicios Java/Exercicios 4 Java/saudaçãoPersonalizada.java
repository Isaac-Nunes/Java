package exerciciosquatro;

import java.util.Scanner;

public class saudaçãoPersonalizada {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Qual seu nome: ");
        String nome = teclado.nextLine();
        
        System.out.print("Em que turno você estuda: ");
        String turno = teclado.nextLine();
        
        if (turno.equalsIgnoreCase("Manhã")){
            System.out.println("Olá "+nome+" do turno da "+turno+", tudo bem?");
        }else if (turno.equalsIgnoreCase("Tarde")){
            System.out.println("Olá "+nome+" do turno da "+turno+", tudo bem?");
        }else if (turno.equalsIgnoreCase("Noite")){
            System.out.println("Olá "+nome+" do turno da "+turno+", tudo bem?");
        }else{
            System.out.println("Erro! Por favor, digite palavras que façam sentido com a pergunta.");
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
