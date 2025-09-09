
package aula2;

import java.util.Scanner;

public class maiorDedoisNumeros {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o primeiro numero: ");
        double num1 = teclado.nextDouble();
        
        System.out.print("Digite um segundo numero: ");
        double num2 = teclado.nextDouble();
        
        if (num1 > num2){
            System.out.println("O primeiro numero é maior que o segundo.");
        }else if (num1 < num2){
            System.out.println("O segundo numero é maior que o primeiro.");
        }else if (num1 == num2){
            System.out.println("Os numeros são iguais.");
        }
        
        
        
        
        
        
        
        
        
    }
}
