package secao20;

abstract class InstrumentoMusical {
    protected String nome;

    public InstrumentoMusical(String nome) {
        this.nome = nome;
    }

    public abstract void tocar();

    public void exibirNome() {
        System.out.println("Nome do instrumento: " + nome);
    }
}
