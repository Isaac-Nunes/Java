package aula2;

import java.util.Scanner;

public class aprovadoOuReprovado {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Qual foi o resultado total das suas notas: ");
        double notas = teclado.nextDouble();
        
        System.out.print("Qual a sua frequencia(Ex: 76 | não precisa do sinal '%' do lado): ");
        double freq = teclado.nextDouble();
        
        if ((notas >= 60) && (freq >= 75)){
            System.out.println("Você passou de ano! Parabéns.");
        }else{
            System.out.println("Você foi reprovado :(");
        }
        
        
        
        
        
        
        
        
        
        
    }
   
}
