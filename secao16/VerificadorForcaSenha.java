package secao16;

import java.util.Scanner;

public class VerificadorForcaSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("---------------------------------\n");
        System.out.print("Digite uma senha: ");
        String senha = scanner.nextLine();

        int forca = verificarForcaSenha(senha);

        if (forca < 2) {
            System.out.println("Senha fraca");
        } else if (forca == 3) {
            System.out.println("Senha média");
        } else if (forca == 4) {
            System.out.println("Senha forte");
        } else {
            System.out.println("Senha muito forte");
        }

        scanner.close();
    }

    public static int verificarForcaSenha(String senha) {
        int forca = 0;

        // tamanho
        if (senha.length() > 8) {
            forca++;
        }

        // letras maiusculas
        if (senha.matches(".*[A-Z].*")) {
            forca++;
        }

        // letras minusculas
        if (senha.matches(".*[a-z].*")) {
            forca++;
        }

        // numeros
        if (senha.matches(".*\\d.*")) {
            forca++;
        }

        // caracteres especiais
        if (senha.matches(".*[!@#$%^&*()-_?<>].*")) {
            forca++;
        }

        return forca;
    }
}