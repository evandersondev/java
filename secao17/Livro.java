package secao17;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    // override
    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    // fallback
    public Livro() {
        this.titulo = "Titilo padrão";
        this.autor = "Autor padrão";
        this.preco = 15.99;
    }

    public void exibirInfo() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Preço: R$" + preco);
    }
}
