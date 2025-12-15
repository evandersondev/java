package secao17;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public void setTitular(String titular) {
        // adicionar logica
        if (titular != null && !titular.isEmpty()) {
            this.titular = titular;
        } else {
            System.out.println("Nome do titular inválido!");
        }
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo inválido!");
        }
    }

    public void exibirInfo() {
        System.out.println("Titular: " + titular + ", Saldo: R$" + saldo);
    }
}
