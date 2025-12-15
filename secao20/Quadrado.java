package secao20;

public class Quadrado extends Forma {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        System.out.println("Calculando área do quadrado...");
        return lado * lado;
    }

}
