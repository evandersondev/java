package secao17;

public class Carro {
    String marca;
    String modelo;
    int ano;

    double velovidadeAtual = 0;
    boolean motorLigado = false;

    void acelerar() {
        System.out.println("Estamos acelerando o carro");
    }

    void exibirInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }

    void ligarMotor() {
        if (!motorLigado) {
            motorLigado = true;
            System.out.println("Ligando o motor.");
        } else {
            System.out.println("O motor já ligado");
        }
    }

    void aumentarValocidade(double incremento) {
        if (motorLigado) {
            velovidadeAtual += incremento;
            System.out.println("A velocidade atual é: " + velovidadeAtual + "km/h");
        } else {
            System.out.println("Primeiro você deve ligar o motor!");
        }
    }
}
