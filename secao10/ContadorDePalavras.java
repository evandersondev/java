package secao10;

import java.util.Scanner;

public class ContadorDePalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            contarPalavra();
            System.out.println("Deseja continuar? (s/n)");
            continuar = scanner.nextLine();
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }

    public static void contarPalavra() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();
        String[] palavras = frase.trim().split("\\s+");
        int numeroPalavras = palavras.length;
        System.out.println("A frase possui " + numeroPalavras + " palavras.");
    }
}
