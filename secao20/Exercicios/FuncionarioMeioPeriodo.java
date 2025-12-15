package secao20.Exercicios;

public class FuncionarioMeioPeriodo extends Funcionario implements Beneficios {

    private double salarioPorHora;
    private int horasTrabalhadas;

    public FuncionarioMeioPeriodo(String nome, double salarioPorHora, int horasTrabalhadas) {
        super(nome);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return salarioPorHora * horasTrabalhadas;
    }

    @Override
    public void adicionarBeneficios(String beneficio) {
        System.out.println("Adicionando benefício ao funcionário de meio período: " + beneficio + ".");
    }

}
