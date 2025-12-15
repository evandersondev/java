package secao17;

public class Exercicios {
    public static void main(String[] args) {
        Celular iphone = new Celular();
        iphone.marca = "Apple";
        iphone.modelo = "iPhone 12 PRO Max";

        iphone.ligar();
        iphone.desligar();
        iphone.usar(10);

        Aluno pedro = new Aluno("Pedro", 123, 8.9);
        System.out.println(pedro.getNome());
        pedro.exibirInfo();
    }
}