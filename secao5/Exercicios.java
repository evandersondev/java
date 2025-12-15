package secao5;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("------------------------------------\n\n");
        System.out.print("Informe o preço do produto: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();

        if (preco < 50) {
            System.out.println("Categoria: Barato\n\n");
        } else if (preco > 50 && preco <= 100) {
            System.out.println("Categoria: Médio\n\n");
        } else {
            System.out.println("Categoria: Caro\n\n");
        }

        System.out.print("------------------------------------\n\n");
        System.out.print("Informe o nome do usuário: ");
        String nome = scanner.nextLine();

        System.out.print("Informe a senha do usuário: ");
        String senha = scanner.nextLine();

        if (nome.equals("admin") && senha.equals("12345")) {
            System.out.println("Acesso permitido\n\n");
        } else {
            System.out.println("Acesso negado\n\n");
        }

        System.out.print("------------------------------------\n\n");
        System.out.print("Digite um numero: ");
        String numero = scanner.nextLine();
        int numInt = Integer.parseInt(numero);

        if (numInt % 2 == 0) {
            System.out.println("Par\n\n");
        } else {
            System.out.println("Ímpar\n\n");
        }

        System.out.print("------------------------------------\n\n");

        scanner.close();

    }
}
