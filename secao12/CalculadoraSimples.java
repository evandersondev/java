package secao12;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1;
        System.out.println("Digite o primeiro número: ");
        num1 = scanner.nextDouble();

        double num2;
        System.out.println("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        System.out.println("------------------------------------------");

        System.out.println("Escolha a operação");
        System.out.println("1) Adição (+)");
        System.out.println("2) Subtração (-)");
        System.out.println("3) Multiplicação (x)");
        System.out.println("4) Divisão (/)");

        int operacao = scanner.nextInt();

        System.out.println("------------------------------------------");

        if (operacao == 1) {
            System.out.println("Resultado: " + adicionar(num1, num2));
        } else if (operacao == 2) {
            System.out.println("Resultado: " + subtrair(num1, num2));
        } else if (operacao == 3) {
            System.out.println("Resultado: " + multiplicar(num1, num2));
        } else if (operacao == 4) {
            System.out.println("Resultado: " + dividir(num1, num2));
        } else {
            System.out.println("Operação inválida");
        }

        scanner.close();
    }

    public static double adicionar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
    }
}
