package secao17;

public class POO {
    public static void main(String[] args) {
        Carro fusca = new Carro();

        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.ano = 1969;

        fusca.acelerar();
        fusca.exibirInfo();

        fusca.ligarMotor();
        System.out.println(fusca.motorLigado);

        fusca.aumentarValocidade(10.0);
        fusca.aumentarValocidade(15.0);
        fusca.aumentarValocidade(20.0);

        Pessoa joao = new Pessoa();
        joao.setNome("John");
        joao.setIdade(25);

        System.out.println(joao.getNome());

        ContaBancaria contaDaAna = new ContaBancaria();
        contaDaAna.setTitular("Ana");
        contaDaAna.setSaldo(1000);

        contaDaAna.exibirInfo();

        // Produto
        Produto camisa = new Produto();
        camisa.setNome("Camisa");
        System.out.println(camisa.getNome());
        camisa.setPreco(150);
        System.out.println(camisa.getPreco());
        System.out.println(camisa.getProdutoInfo());
        camisa.aplicarDesconto(5);

        Livro meuLivro = new Livro("Harry Potter", "J.K. Rowling", 29.99);
        meuLivro.exibirInfo();

        Livro outroLivro = new Livro();
        outroLivro.exibirInfo();
    }
}
