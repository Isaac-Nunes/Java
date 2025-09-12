package exerciciosjava7;

import java.util.Scanner;

public class diaDaSemana {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("-----------------------------");
        System.out.println("         DIA DA SEMANA       ");
        System.out.println("-----------------------------");
        
        System.out.println("[1] Segunda");
        System.out.println("[2] Terça");
        System.out.println("[3] Quarta");
        System.out.println("[4] Quinta");
        System.out.println("[5] Sexta");
        System.out.println("[6] Sábado");
        System.out.println("[7] Domingo");
        
        System.out.print("Escolha uma das opções: ");
        int opcao = teclado.nextInt();
        
        switch(opcao){
        
            case 1:
                System.out.println("Hoje é Segunda-feira.");
            break;
            case 2:
                System.out.println("Hoje é Terça-feira.");
            break;
            case 3:
                System.out.println("Hoje é Quarta-feira.");
            break;
            case 4:
                System.out.println("Hoje é Quinta-feira.");
            break;
            case 5: 
                System.out.println("Hoje é Sexta-feira");
            break;
            case 6:
                System.out.println("Hoje é Sábado");
                break;
            case 7:
                System.out.println("Hoje é Domingo");
                break;
            default:
                System.out.println("Digite uma das opções");
                break;
    }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
