package secao17;

public class Celular {
    String marca;
    String modelo;
    int bateria = 100;

    void ligar() {
        System.out.println("Ligando o celular");
    }

    void desligar() {
        System.out.println("Desligando o celular");
    }

    void usar(int consumo) {
        if (bateria - consumo >= 0) {
            bateria -= consumo;
            System.out.println("O celular está com " + bateria + " de bateria.");
        } else {
            System.out.println("O celular está sem bateria.");
        }
    }
}
