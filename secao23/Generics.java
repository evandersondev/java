package secao23;

public class Generics {
    public static void main(String[] args) {
        // 1 - Classes genericas
        Caixa<Integer> caixaInteira = new Caixa<>();
        caixaInteira.adicionar(100);
        System.out.println(caixaInteira.obter());

        Caixa<String> caixaStr = new Caixa<>();
        caixaStr.adicionar("Java");
        System.out.println(caixaStr.obter());

        // 2 - Metodos genericos
        System.out.println(obterMaior(5, 10));
        System.out.println(obterMaior("Java", "Python"));

        String[] letras = { "A", "B", "C" };
        imprimirArray(letras);

        Integer[] numeros = { 1, 2, 3 };
        imprimirArray(numeros);

        Boolean[] bools = { true, false };
        imprimirArray(bools);
    }

    public static <T extends Comparable<T>> T obterMaior(T valor1, T valor2) {
        return (valor1.compareTo(valor2) > 0) ? valor1 : valor2;
    }

    public static <K> void imprimirArray(K[] array) {
        for (K elemento : array) {
            System.out.println("Elemento: " + elemento);
        }
    }
}