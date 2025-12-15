package secao4;

import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        scanner.nextLine();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média é: %.1f%n", media);
        scanner.close();

        if (media >= 7.0) {
            System.out.println("O aluno " + nome + " foi aprovado.");
        } else {
            System.out.println("O aluno " + nome + " foi reprovado.");
        }
    }
}
