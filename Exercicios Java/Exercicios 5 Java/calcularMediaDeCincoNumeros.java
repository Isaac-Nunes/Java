package exerciciosFor;

import java.util.Scanner;

public class calcularMediaDeCincoNumeros {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double media = 0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite um numero: ");
            double num1 = teclado.nextDouble();
            media = num1 / 2;
            System.out.println("A media deste numero é: "+media);
        }

      
        
        
        
        
        
        
    }
}
