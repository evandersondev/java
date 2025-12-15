package secao20;

public class Carro {
    private String marca;
    private String modelo;
    private Motor motor;

    public Carro(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    void exibirInfo() {
        System.out.println("Marca do carro: " + marca);
        System.out.println("Modelo do carro: " + modelo);
        motor.exibirInfo(); // Chama o método exibirInfo do objeto Motor
    }
}
