package secao2;

import java.util.Scanner;

public class TesteScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite sua altura em metros (ex: 1.75): ");
        double altura = scanner.nextDouble();
        scanner.nextLine();

        System.out.printf("""
                Olá, %s!
                Você tem %d anos e sua altura é %.2f metros.
                """, nome, idade, altura);

        scanner.close();
    }
}
