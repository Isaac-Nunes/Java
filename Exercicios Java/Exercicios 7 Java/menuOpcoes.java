package exercicios7dowhile;

import java.util.Scanner;

public class menuOpcoes {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int escolha;
        
        do{
            
            System.out.println("----------------------------");
            System.out.println("        MENU DE OPÇÕES      ");
            System.out.println("----------------------------");
            
            System.out.println("[1] Cadastrar");
            System.out.println("[2] Consultar");
            System.out.println("[3] Sair");
            
            escolha = teclado.nextInt();
            
            if(escolha == 1){
                System.out.println("Você escolheu a opção [1].");
            }else if(escolha == 2){
                System.out.println("Você escolheu a opção [2]");
            }else if ((escolha != 1) && (escolha != 2) && (escolha != 3)){
                System.out.println("Digite uma numero entre [1..2..3]");
            } 
                
            
            
        }while(escolha != 3);
        
        System.out.println("Você escolheu sair.");
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
