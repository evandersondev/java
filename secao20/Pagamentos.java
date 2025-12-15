package secao20;

public interface Pagamentos {
    void processarPagamento(double valor);

    default void exibirRecibo(double valor) {
        System.out.printf("Recibo gerado para o valor de R$ %.2f\n", valor);
    }
}
