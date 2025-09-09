import java.util.Scanner;

public class CalculoMediaIdade {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade = 0;
        int somaIdades = 0;
        int contadorAlunos = 0;

        System.out.println("--- Média de Idade da Turma ---");
        System.out.println("Digite as idades dos alunos. Para finalizar, digite um número negativo.");

        System.out.print("Digite a idade do 1º aluno: ");
        idade = teclado.nextInt();

        while (idade >= 0) {
            somaIdades += idade; 
            contadorAlunos++;    

            System.out.printf("Digite a idade do %dº aluno: ", contadorAlunos + 1);
            idade = teclado.nextInt();
        }

        if (contadorAlunos > 0) {
            double media = (double) somaIdades / contadorAlunos;
            System.out.printf("\nCálculo finalizado.\n");
            System.out.printf("A média de idade da turma com %d alunos é: %.2f anos.\n", contadorAlunos, media);
        } else {
            System.out.println("\nNenhuma idade válida foi inserida.");
        }

        
    }
}