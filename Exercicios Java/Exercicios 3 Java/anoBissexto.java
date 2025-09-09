
package aula2;

import java.util.Scanner;

public class anoBissexto {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um ano para saber se ele é bissexto: ");
        int num = teclado.nextInt();
        
        if ((num % 4 == 0 && num % 100 != 0) || (num % 400 == 0)){
            System.out.println("O ano é bissexto.");
        }else{
            System.out.println("O ano não é bissexto.");
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
