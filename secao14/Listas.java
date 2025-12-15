package secao14;

import java.util.ArrayList;
import java.util.Arrays;

public class Listas {
    public static void main(String[] args) {
        // 1- Sintaxe
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println("Acessando o índice 0: " + numeros[0]);

        String[] frutas = new String[3];
        frutas[0] = "Maçã";
        frutas[1] = "Banana";
        frutas[2] = "Laranja";

        System.out.println(frutas);

        double[] precos = { 1.99, 2.45, 4.97 };
        precos[2] = 5;
        System.out.println(precos[2]);

        // Loops
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println("A soma dos números é: " + soma);

        // for each
        for (String f : frutas) {
            System.out.println(f);
        }

        // encontrar o maior valor de um array
        int[] valores = { 10, 25, 8, 22, 1 };
        int j = 0;
        int maiorValor = valores[j];

        while (j < valores.length) {
            if (valores[j] > maiorValor) {
                maiorValor = valores[j];
            }
            j++;
        }
        System.out.println("O maior valor é: " + maiorValor);

        char[] letras = { 'a', 'e', 'i', 'o', 'u' };
        char letraProcurada = 'i';

        for (char letra : letras) {
            if (letra == letraProcurada) {
                System.out.println("Letra encontrada: " + letra);
                break;
            }
        }

        System.out.println(Arrays.toString(frutas));
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(precos));

        int[] novoArray = new int[numeros.length + 1];
        for (int i = 0; i < numeros.length; i++) {
            novoArray[i] = numeros[i];
        }
        novoArray[novoArray.length - 1] = 9;
        System.out.println(Arrays.toString(novoArray));

        String[] novoFrutas = new String[frutas.length + 1];
        System.arraycopy(frutas, 0, novoFrutas, 0, frutas.length);
        novoFrutas[novoFrutas.length - 1] = "Morango";
        System.out.println(Arrays.toString(novoFrutas));

        // ArrayList
        ArrayList<String> listaFrutas = new ArrayList<>(Arrays.asList("Banana", "Laranja", "Uva"));
        System.out.println(listaFrutas);

        listaFrutas.add("Manga");
        System.out.println(listaFrutas);

        int[] arrayOriginal = { 1, 2, 3 };
        int[] arrayCopia = arrayOriginal.clone();
        arrayCopia[0] = 10;
        System.out.println(Arrays.toString(arrayCopia));
        System.out.println(Arrays.toString(arrayOriginal));

        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println(matriz[1][2]);

        int[][] tabela = new int[3][3];
        tabela[0][0] = 10;
        tabela[0][1] = 20;
        tabela[0][2] = 30;

        for (int[] linha : tabela) {
            System.out.println(Arrays.toString(linha));
        }

        int[][] grade = new int[4][5];
        for (int m = 0; m < grade.length; m++) {
            for (int n = 0; n < grade[m].length; n++) {
                grade[m][n] = m * n;
            }
        }
        for (int[] linha : grade) {
            System.out.println(Arrays.toString(linha));
        }
    }
}
