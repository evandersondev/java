package secao15;

import java.util.Arrays;
import java.util.Scanner;

public class JogoDaForca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palavraSecreta = "JAVA";
        char[] palavraOculta = new char[palavraSecreta.length()];
        for (int i = 0; i < palavraOculta.length; i++) {
            palavraOculta[i] = '_';
        }

        System.out.println(Arrays.toString(palavraOculta));

        int tentativas = 5;
        boolean venceu = false;

        while (tentativas > 0) {
            System.out.print("Digite uma letra: ");
            char letra = scanner.next().toUpperCase().charAt(0);

            if (palavraSecreta.contains(String.valueOf(letra))) {
                for (int i = 0; i < palavraSecreta.length(); i++) {
                    if (palavraSecreta.charAt(i) == letra) {
                        palavraOculta[i] = letra;
                    }
                }

                if (new String(palavraOculta).equals(palavraSecreta)) {
                    venceu = true;
                    System.out.println("Parabéns! Você venceu!");
                    System.out.println("A palavra secreta era: " + palavraSecreta);
                    break;
                }
            } else {
                tentativas--;
                System.out.println("Letra incorreta. Tentativas restantes: " + tentativas);
            }

            if (tentativas == 0 && !venceu) {
                System.out.println("Você perdeu! A palavra secreta era: " + palavraSecreta);
            }
        }

        scanner.close();
    }
}
