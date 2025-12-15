package secao14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class AvancandoArray {
    public static void main(String[] args) {
        int[] numbers = { 5, 6, 1, 4, 2, 22, 1 };
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] names = { "David", "Charlie", "Bob", "Marco", "Alice" };
        Arrays.sort(names, Comparator.reverseOrder());
        System.out.println(Arrays.toString(names));

        // copy
        int[] original = { 1, 2, 3, 4, 5 };
        int[] copy = Arrays.copyOf(original, 2);
        System.out.println(Arrays.toString(copy));

        // fill
        int[] numeros = new int[5];
        Arrays.fill(numeros, 9);
        System.out.println(Arrays.toString(numeros));

        // array to stream
        int[] valores = { 1, 2, 3, 4, 5 };
        int sum = Arrays.stream(valores).sum();
        System.out.println(sum);

        ArrayList<String> frutas = new ArrayList<>();
        System.out.println(frutas);
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        frutas.remove("Banana");
        System.out.println(frutas);

        String frutaEspecifica = frutas.get(0);
        System.out.println(frutaEspecifica);

        int tamanho = frutas.size();
        System.out.println(tamanho);
    }
}
