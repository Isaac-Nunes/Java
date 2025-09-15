package exerciciosjava9;

import java.util.ArrayList;
import java.util.Scanner;

public class ElementosPorIndice {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        ArrayList<Double> numeros = new ArrayList<>();
        
    System.out.println("Digite 5 numeros decimais: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("numeros "+(i+1)+" : ");
            double numero = teclado.nextDouble();
            numeros.add(numero);
        }     
        double terceiroNumero = numeros.get(2);
        System.out.println("O terceiro elemento é: "+terceiroNumero);
        
        
        
        
        
        
        
    }
}
