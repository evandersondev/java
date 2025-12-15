package secao19;

import java.util.Scanner;

public class SistemaCadastroAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos você deseja cadastrar? ");
        int numerosDeAlunos = scanner.nextInt();

        Aluno[] alunos = new Aluno[numerosDeAlunos];

        for (int i = 0; i < numerosDeAlunos; i++) {
            System.out.println("Digite o nome do aluno: ");
            String nome = scanner.next();

            System.out.println("Digite a matrícula do aluno: ");
            String matricula = scanner.next();

            System.out.println("Quantidade de provas: ");
            int quantidadeDeProvas = scanner.nextInt();
            scanner.nextLine();

            Aluno aluno = new Aluno(nome, matricula, quantidadeDeProvas);
            aluno.adicionarNota(scanner);

            alunos[i] = aluno;
        }

        for (Aluno aluno : alunos) {
            aluno.exibirResultado();
        }

        scanner.close();
    }
}
