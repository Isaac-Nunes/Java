package aulafor;

import java.util.Scanner;

public class AulaFor {

    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        
        //Contador de 1 a 10
        
//        for (int i = 1; i <= 10; i++){
//            System.out.println(i);
//        }
          
         //Contador decrescente
        
//        for (int i = 10; i >= 1; i--) {
//            System.out.println(i);
//        }
  
         //Contador decrescente de 3 em 3

//          for (int i = 10; i >= 1; i-=3) {
//            System.out.println(i);
//        }

         //Ler valores digitados pelo usuário e exibea soma total

//          int soma = 0;
//          for (int i = 1; i <= 5; i++) {
//              System.out.print("Digite um valor: ");
//              int v = teclado.nextInt();
//              soma += v; // soma = soma + v
//          }

//            System.out.println("A soma dos valores é "+soma);
            
        //Tabuada   

//        System.out.println("Digite um numero: ");  
//        int numero = teclado.nextInt();
//        
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(numero+" x "+i+" = "+(numero*i));
//        }
        
        // Exemplo 05 - Mostrar quantos valores digitados estão  
        // entre 0 e 10, após 6 digitações 
        
        int cont = 0;
        for (int i = 1; i <= 6; i++) {
            System.out.println("Digite um valor: ");
            int v = teclado.nextInt();
            if (v >= 0 && v <= 10){         
            cont++;      
         }
        }  
            System.out.println("Ao todo foram "+cont+" valores de 0 e 10");      
    }
    
}
