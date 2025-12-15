package secao20.Exercicios;

public class FuncionarioTempoIntegral extends Funcionario implements Beneficios {
    private double salarioBase;

    public FuncionarioTempoIntegral(String nome, double salarioBase) {
        super(nome);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public void adicionarBeneficios(String beneficio) {
        System.out.println("Adicionando benefício ao funcionário de tempo integral: " + beneficio + ".");
    }

}
