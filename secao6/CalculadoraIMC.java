package secao6;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        System.out.print("------------------------------------\n\n");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();
        scanner.nextLine();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        String classificacao;
        switch (String.valueOf(imc)) {
            case "Double.NaN":
                classificacao = "Inválido";
                break;
            default:
                if (imc < 18.5) {
                    classificacao = "Abaixo do peso";
                } else if (imc >= 18.5 && imc <= 24.9) {
                    classificacao = "Peso normal";
                } else if (imc >= 25 && imc <= 29.9) {
                    classificacao = "Sobrepeso";
                } else {
                    classificacao = "Obesidade";
                }
                break;
        }

        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }
}
