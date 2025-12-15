package secao11;

public class LoopsB {
    public static void main(String[] args) {
        // Loops com rotulo
        rotulo1: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break rotulo1;
                }
                System.out.println("i = " + i + " e j = " + j);
            }
        }
    }
}
