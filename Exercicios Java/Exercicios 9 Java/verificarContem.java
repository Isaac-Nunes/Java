package exerciciosjava9;

import java.util.ArrayList;
import java.util.Scanner;

public class verificarContem {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        ArrayList<String> cores = new ArrayList<>();
        
        cores.add("Vermelho");
        cores.add("Azul");
        cores.add("Verde");
        
        boolean contemAmarelo = cores.contains("Amarelo");
        
        if(contemAmarelo){
            System.out.println("A cor 'Amarelo' esta na lista.");
        }else{
            System.out.println("A cor 'Amarelo' não esta na lista");
        }
        
        
        
        
    }
 
}
