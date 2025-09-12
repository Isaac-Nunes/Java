import java.util.Scanner;

public class ClassificacaoTriangulos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("--- CLASSIFICAÇÃO DE TRIÂNGULOS  ---");

        System.out.print("Digite o primeiro lado: ");
        double lado1 = teclado.nextDouble();
        System.out.print("Digite o segundo lado: ");
        double lado2 = teclado.nextDouble();
        System.out.print("Digite o terceiro lado: ");
        double lado3 = teclado.nextDouble();

      
        if (!((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1))) {
            System.out.println("Os valores informados não formam um triângulo válido.");
        } else {
            
            int ladosIguais = 0;
            
            if (lado1 == lado2) { ladosIguais++; }
            if (lado1 == lado3) { ladosIguais++; }
            if (lado2 == lado3) { ladosIguais++; }
            
            switch (ladosIguais) {
                case 3:
                    System.out.println("O triângulo é EQUILÁTERO.");
                    break;
                case 1: 
                    System.out.println("O triângulo é ISÓSCELES.");
                    break;
                case 0: 
                    System.out.println("O triângulo é ESCALENO.");
                    break;
                default:
                    System.out.println("Erro na classificação.");
                    break;
            }
        }
        
        
    }
}