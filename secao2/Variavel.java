package secao2;

public class Variavel {
    public static void main(String[] args) {
        String nome = "João";
        int idade = 25;
        byte idadeByte = 25;
        short idadeShort = 25;
        long numeroGrande = 1_627_849_923_000L;
        double altura = 1.75;
        float salario = 2500.50f;
        char sexo = 'M';
        boolean ehMaiorDeIdade = idade >= 18;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Idade (byte): " + idadeByte);
        System.out.println("Idade (short): " + idadeShort);
        System.out.println("Altura: " + altura);
        System.out.println("Sexo: " + sexo);
        System.out.println("É maior de idade? " + ehMaiorDeIdade);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Número grande: " + numeroGrande);
    }
}
