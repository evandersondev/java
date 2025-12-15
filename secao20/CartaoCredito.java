package secao20;

public class CartaoCredito implements Pagamentos {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento realizado com cartão de crédito. Valor: R$ " + valor);
    }
}
