
package exercicios7dowhile;

import java.util.Scanner;

public class somaAte0 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
       int soma = 0;
       int num;
        
       do{
           System.out.print("Digite um numero: ");
           num = teclado.nextInt();
           
           soma += num;
           
           
       }while (num != 0); 
        
        System.out.println("O resultado das somas foi "+soma);
        
        
        
        
        
    }
}
