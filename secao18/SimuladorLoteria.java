package secao18;

import java.util.ArrayList;
import java.util.Scanner;

public class SimuladorLoteria {
    public static void main(String[] args) {
        ArrayList<Bilhete> bilhetes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite os números do bilhete (entre 1 e 60): ");

            // escolhe os numeros
            int[] numerosEscolhidos = new int[6];
            for (int i = 0; i < numerosEscolhidos.length; i++) {
                System.out.println("Digite o número " + (i + 1) + ": ");
                numerosEscolhidos[i] = scanner.nextInt();
            }

            // criamos o bilhete
            Bilhete bilhete = new Bilhete(numerosEscolhidos);
            bilhetes.add(bilhete);

            System.out.println("Deseja registrar outro bilhete? (s/n)");

            String resposta = scanner.next();

            if (resposta.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("Realzando o sorteio...");

        for (Bilhete bilhete : bilhetes) {
            bilhete.realizarSorteio();
            bilhete.exibirResultado();
        }

        scanner.close();
    }
}
