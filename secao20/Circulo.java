package secao20;

public class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        System.out.println("Calculando a área do Círculo...");
        return Math.PI * Math.pow(raio, 2);
    }
}
