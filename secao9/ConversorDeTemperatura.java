package secao9;

import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de conversão");
        System.out.println("1: Celsius para Fahrenheit");
        System.out.println("2: Fahrenheit para Celsius");

        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Celsius para Fahrenheit");
            converterCelsiusParaFahrenheit();
        } else if (escolha == 2) {
            System.out.println("Fahrenheit para Celsius");
            converterFahrenheitParaCelsius();
        } else {
            System.out.println("Opção inválida");
        }

        scanner.close();
    }

    public static void converterCelsiusParaFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celsius:");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + " graus Celsius é igual a " + fahrenheit + " graus Fahrenheit.");
        scanner.close();
    }

    public static void converterFahrenheitParaCelsius() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Fahrenheit:");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " graus Fahrenheit é igual a " + celsius + " graus Celsius.");
        scanner.close();
    }
}
