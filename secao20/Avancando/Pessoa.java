package secao20.Avancando;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void dizerHello() {
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }

}
