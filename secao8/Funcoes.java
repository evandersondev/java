package secao8;

public class Funcoes {
    public static void main(String[] args) {
        // Criando minha primeira função
        saudacao();

        // Função com parâmetros
        soma(5, 10);

        // Função com retorno
        int numero = 7;
        int resultadoDobro = dobrar(numero);
        System.out.println("O dobro de " + numero + " é: " + resultadoDobro);

        System.out.println(calculaMedia(5, 6, 7));
    }

    public static void saudacao() {
        System.out.println("Hello World!");
    }

    public static void soma(int a, int b) {
        int resultado = a + b;
        System.out.println("A soma é: " + resultado);
    }

    public static int dobrar(int numero) {
        return numero * 2;
    }

    /**
     * Calcula a média de três números
     * 
     * @param num1 o primeiro número/nota a ser enviado
     * @param num2 o segundo número/nota a ser enviado
     * @param num3 o terceiro número/nota a ser enviado
     * @return a média dos três números
     */
    public static double calculaMedia(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }
}
