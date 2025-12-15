package secao11;

public class Loops {
    public static void main(String[] args) {
        // For
        for (int i = 1; i <= 5; i++) {
            System.out.println("for = " + i);
        }

        String palavra = "Java";
        for (int i = 0; i < palavra.length(); i++) {
            System.out.println("Char: " + palavra.charAt(i));
        }

        // While
        int i = 0;
        while (i < 5) {
            System.out.println("While = " + i);
            i++;
        }

        // Do While
        int j = 0;
        do {
            System.out.println("Do While = " + j);
            j++;
        } while (j < 5);

        // break
        for (int x = 0; x <= 10; x++) {
            if (x == 5) {
                break;
            }
            System.out.println("Break = " + x);
        }

        // continue
        for (int y = 0; y <= 10; y++) {
            if (y % 2 == 0) {
                System.out.println("PAR = " + y);
                continue;
            }
            System.out.println("IMPAR = " + y);
        }

        // nested loops
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                System.out.println(a + " x " + b + " = " + a * b);
            }
        }

        for (int z = 0; z <= 20; z++) {
            System.out.print("*");
        }
    }
}