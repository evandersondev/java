package secao20;

public class Bateria extends InstrumentoMusical {
    public Bateria(String nome) {
        super(nome);
    }

    @Override
    public void tocar() {
        System.out.println("A bateria está tocando.");
    }
}
