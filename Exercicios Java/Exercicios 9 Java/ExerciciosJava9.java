package exerciciosjava9;

import java.util.ArrayList;
import java.util.Scanner;

public class ExerciciosJava9 {

    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        
        ArrayList<String> cidades = new ArrayList<>();
        
      System.out.println("Digite 5 nomes de cidades: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Cidade "+(i+1)+" : ");
            String cidade = teclado.nextLine();
            cidades.add(cidade);
        }   
        System.out.println("A lista das cidades são: "+cidades);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
