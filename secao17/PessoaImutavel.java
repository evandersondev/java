package secao17;

public final class PessoaImutavel {
    private final String nome;
    private final int idade;

    public PessoaImutavel(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

}
