package secao7;

import java.util.Scanner;

public class ClassificacaoProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String produto1 = "Notebook";
        String produto2 = "Smartphone";
        String produto3 = "Tablet";

        System.out.print("Digite o nome do produto: ");
        String produto = scanner.nextLine();

        if (produto.equals(produto1) || produto.equals(produto2) || produto.equals(produto3)) {
            System.out.println("Deseja alterar o preço do " + produto + "? (s/n)");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("s")) {
                System.out.print("Digite o novo preço do " + produto + ": ");
                double novoPreco = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("O preço do " + produto + " foi alterado para: R$ " + novoPreco);
            } else {
                System.out.println("O preço do " + produto + " não foi alterado.");
            }
        } else {
            System.out.println("Produto não encontrado.");
        }

        scanner.close();
    }
}
