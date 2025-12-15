package secao20.Exercicios;

public class Exercicios {
    public static void main(String[] args) {
        // Exercicio 1
        Endereco endereco = new Endereco("Rua das Flores", 123, "São Paulo");
        Pessoa pessoa = new Pessoa("João", 30, endereco);
        pessoa.exibirInfo();

        // Exercicio 2
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();

        carro.acelerar();
        moto.acelerar();

        // Exercicio 3
        Cachorro cachorro = new Cachorro("Buddy", "Au Au", "Labrador");
        cachorro.exibirDetalhes();

        // Exercicio 4
        FuncionarioTempoIntegral funcionario1 = new FuncionarioTempoIntegral("João", 3000.0);
        FuncionarioMeioPeriodo funcionario2 = new FuncionarioMeioPeriodo("Maria", 2500.0, 200);

        System.out.println(funcionario1.calcularSalario());
        System.out.println(funcionario2.calcularSalario());

        // Exercicio 5
        Pilotavel hidroAviao = new HidroAviao();
        Navegavel barco = new Barco();
        Pilotavel aviao = new Aviao();

        hidroAviao.pilotar();
        barco.navegar();
        aviao.pilotar();

        operarVeiculo(aviao);
        operarVeiculo(barco);
        operarVeiculo(hidroAviao);
    }

    public static void operarVeiculo(Object veiculo) {
        if (veiculo instanceof Pilotavel) {
            System.out.println("O veículo está voando.");
        } else if (veiculo instanceof Navegavel) {
            System.out.println("O veículo está navegando.");
        } else {
            System.out.println("O veículo não pode operar.");
        }
    }
}
