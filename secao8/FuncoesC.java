package secao8;

import java.util.Arrays;
import java.util.List;

public class FuncoesC {
    public static void main(String[] args) {
        // Funcao recursiva
        int soma = somaRecursiva(6);
        System.out.println("A soma dos primeiros 5 números é: " + soma);

        System.out.println(soma(5, 10));
        System.out.println(soma(5, 10, 15));
        System.out.println(soma(5.0, 10.0));

        // Funcao anonima
        Runnable tarefa = () -> System.out.println("Executando tarefa...");
        tarefa.run();

        List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");
        nomes.forEach(nome -> System.out.println(nome));
    }

    public static int somaRecursiva(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + somaRecursiva(n - 1);
        }
    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int soma(int a, int b, int c) {
        return a + b + c;
    }

    public static double soma(double a, double b) {
        return a + b;
    }
}
