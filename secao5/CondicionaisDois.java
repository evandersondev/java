package secao5;

public class CondicionaisDois {
    public static void main(String[] args) {
        int numero = 10;
        String resultado = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println("O número é: " + resultado);
    }
}
