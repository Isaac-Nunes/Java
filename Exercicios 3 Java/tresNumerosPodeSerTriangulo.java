
package aula2;

import java.util.Scanner;

public class tresNumerosPodeSerTriangulo {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite o primeiro numero: ");
        double num1 = teclado.nextDouble();
        
        System.out.print("Digite o segundo numero: ");
        double num2 = teclado.nextDouble();

        System.out.print("Digite o terceiro e ultimo numero: ");
        double num3 = teclado.nextDouble();
        
        if (( num1 + num2 > num3) && (num1 + num3 > num2) && (num2 +num3 > num1)){
            System.out.println("Os três numero podem formar um triangulo.");
        }else{
            System.out.println("Os tres numeros não podem formar um triangulo. ");
        }
        
        
        
        
        
    }
}
