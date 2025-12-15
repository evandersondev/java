package secao20;

public class TransferenciaBacaria implements Pagamentos {

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento realizado com transferência bancária. Valor: R$ " + valor);
    }

}
