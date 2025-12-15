package secao20;

interface Imprimivel {
    void imprimir();
}

interface Salvavel {
    void salvar();
}

public class Documento implements Imprimivel, Salvavel {
    private String documento;

    public Documento(String documento) {
        this.documento = documento;
    }

    @Override
    public void salvar() {
        System.out.println("Salvando documento: " + documento);
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo documento: " + documento);
    }
}