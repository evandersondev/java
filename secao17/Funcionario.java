package secao17;

public class Funcionario {
    public String nome;
    protected double salario;
    private String senha;

    public Funcionario(String nome, double salario, String senha) {
        this.nome = nome;
        this.salario = salario;
        this.senha = senha;
    }

    public void exibirDados() {
        System.out.printf("Nome: %s, Salário: R$ %.2f , Senha: %s\n", nome, salario, senha);
    }

    protected void aumentarSalario(double porcentagem) {
        this.salario += (this.salario * porcentagem) / 100;
        System.out.printf("Salário agora é: R$ %.2f", salario);
    }

    private boolean verificarSenha(String senha) {
        return this.senha.equals(senha);
    }

    public boolean autenticar(String senha) {
        return verificarSenha(senha);
    }
}
