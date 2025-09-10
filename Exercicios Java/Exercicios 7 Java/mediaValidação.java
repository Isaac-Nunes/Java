package exercicios7dowhile;

import java.util.Scanner;

public class mediaValidação {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int rep = 0;
        double soma = 0;
        
        do{
            System.out.print("Digite a nota do aluno: ");
            double nota = teclado.nextDouble();
            
            
            
            if (nota < 0){
                System.out.println("Digite um numero correto.");
                rep -= 1;
            }else if (nota > 10){
                System.out.println("Digite um numero correto.");
                rep -= 1;
            }
            
            rep += 1;
            soma += nota;
            
            
        }while(rep != 4);
        
        System.out.println("A média das notas ficaram "+soma / 4);
        
    }
}
