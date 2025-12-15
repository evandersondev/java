package secao17;

import java.util.Arrays;

public class POO2 {
    public static void main(String[] args) {
        Funcionario joao = new Funcionario("João", 5000, "senha123");

        joao.aumentarSalario(12);
        joao.exibirDados();

        System.out.println(joao.autenticar("senha123"));

        PessoaImutavel joaquim = new PessoaImutavel("Joaquim", 25);
        System.out.println(joaquim.getNome());
        System.out.println(joaquim.getIdade());

        String[] meusAlunos = { "João", "Maria", "Pedro" };
        Turma turma = new Turma(meusAlunos);
        System.out.println(Arrays.toString(turma.getAlunos()));

        // turma.setAlunos();
    }
}
