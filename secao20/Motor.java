package secao20;

public class Motor {
    private String tipo;
    private int potencia;

    public Motor(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    // public String getTipo() {
    // return tipo;
    // }

    // public void setTipo(String tipo) {
    // this.tipo = tipo;
    // }

    // public int getPotencia() {
    // return potencia;
    // }

    // public void setPotencia(int potencia) {
    // this.potencia = potencia;
    // }

    void exibirInfo() {
        System.out.println("Tipo do motor: " + tipo);
        System.out.println("Potência do motor: " + potencia);
    }
}
