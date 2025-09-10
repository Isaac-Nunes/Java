
package exercicios7dowhile;

import java.util.Scanner;

public class contagemRegressiva {
    public static void main(String[] args) throws InterruptedException {
        
        Scanner teclado = new Scanner(System.in);
            
        int num = 11;
        
        do {
            num -= 1;
            System.out.println(num);
            Thread.sleep(1000);
        }while (num != 0);    
        
        
        
        
        
        
        
        
        
    }
}
