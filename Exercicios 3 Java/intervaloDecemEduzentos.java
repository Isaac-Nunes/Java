package aula2;

import java.util.Scanner;

public class intervaloDecemEduzentos {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um numero para verificarmos o intervalo: ");
        double num = teclado.nextDouble();
        
        if ((num > 100) && (num < 200)){
            System.out.println("O numero esta no intervalo entre 100 e 200.");
        }else if (num < 100){
            System.out.println("O numero é menor que 100.");
        }else if (num > 200){
            System.out.println("O numero é maior que 200.");
        }else if (num == 100){
            System.out.println("O numero digitado é 100.");
        }else if (num == 200){
            System.out.println("O numero digitado é 200.");
        }else{
            System.out.println("Digite um numero válido!");
        }
        
        
        
        
        
        
        
        
        
    }
    
}
