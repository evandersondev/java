package secao20;

public class POO {
    public static void main(String[] args) {
        // 1- Object composition
        Motor motor = new Motor("V8", 500);
        Carro carro = new Carro("Ford", "Mustang", motor);
        carro.exibirInfo();

        // 2 - Herança
        Cachorro cachorro = new Cachorro("Rex");
        cachorro.emitirSom();

        // 3 - Classe object
        Pessoa pessoa = new Pessoa("João", 30);
        System.out.println(pessoa.toString());

        // 4 - Overriding
        Circulo circulo = new Circulo(5.0);
        System.out.println("Área do círculo: " + circulo.calcularArea());

        Quadrado quadrado = new Quadrado(4.0);
        quadrado.calcularArea();
        System.out.println("Área do quadrado: " + quadrado.calcularArea());

        // 5 - super
        Funcionario funcionario = new Funcionario("Maria", 5000.0);
        funcionario.exibirDetalhes();
        System.out.println("Bônus: R$" + funcionario.calcularBonus());

        Gerente gerente = new Gerente("João", 8000.0, 1000.0);
        gerente.exibirDetalhes();
        System.out.println("Bônus: R$" + gerente.calcularBonus());

        // 6 - Classe abstrata
        InstrumentoMusical violao = new Violao("Violão");
        violao.tocar();
        violao.exibirNome();

        InstrumentoMusical bateria = new Bateria("Bateria");
        bateria.tocar();
        bateria.exibirNome();

        // 7 -Interfaces
        Pagamentos cartao = new CartaoCredito();
        cartao.processarPagamento(100.0);
        cartao.exibirRecibo(100.0);

        Pagamentos transferencia = new TransferenciaBacaria();
        transferencia.processarPagamento(50.0);
        transferencia.exibirRecibo(50.0);

        // 8 - Multiplas interfaces
        Documento documento = new Documento("Documento 1");
        documento.salvar();
        documento.imprimir();

        // 9 - Default methods nas interfaces
        Calculadora calculadora = new CalculadoraAvancada();
        int resultado = calculadora.somar(5, 3);
        System.out.println("Resultado da soma: " + resultado);
        resultado = calculadora.multiplicar(4, 2);
        System.out.println("Resultado da multiplicação: " + resultado);

        // 10 - Polimorfismo
        InstrumentoMusical violino = new Violino("Violino");
        violino.tocar();
        violino.exibirNome();
    }
}
