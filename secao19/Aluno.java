package secao19;

import java.util.Arrays;
import java.util.Scanner;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;

    public Aluno(String nome, String matricula, int numeroDeNotas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[numeroDeNotas];
    }

    public String getNome() {
        return nome;
    }

    public void adicionarNota(Scanner scanner) {
        System.out.println("Digite a nota para o aluno " + nome + ":");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digie a nota " + (i + 1) + ":");
            notas[i] = scanner.nextDouble();
        }
    }

    private double calcularMedia() {
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }

    public void exibirResultado() {
        double media = calcularMedia();

        System.out.println("Nome do aluno: " + nome);
        System.out.println("Matrícula do aluno: " + matricula);
        System.out.println("Notas do aluno: " + Arrays.toString(notas));
        System.out.println("Média do aluno: " + media);

        if (media >= 6.0) {
            System.out.println("O aluno está aprovado");
        } else {
            System.out.println("O aluno está reprovado");
        }
    }
}
