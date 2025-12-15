package secao21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Erros {

    public static void main(String[] args) {
        // 1 - try catch
        try {
            int a = 0;
            int b = 10;

            int resultado = b / a;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            int[] numeros = { 1, 2, 3 };
            System.out.println(numeros[3]);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // 2 - Finally
        try {
            int[] numeros = { 1, 2, 3 };
            System.out.println(numeros[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Finalizando o programa...");
        }

        // 3 - Verificadas e não verificadas
        // verificada
        try {
            BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"));
            String linha = reader.readLine();
            System.out.println(linha);
            reader.close();
        } catch (Exception e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());
        } finally {
            System.out.println("Finalizando o programa...");
        }

        // 4 - Excecoes com throw
        try {
            validarIdade(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // 5 - Excecoes customizadas
        Banco minhaConta = new Banco(1000);
        try {
            minhaConta.sacar(1500);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // 6 - throws em metodos
        try {
            processarArquivo("arquivo.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // 7 - Encadeamento de excecoes
        try {
            abrirArquivo(null);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            System.out.println("Erro: " + e.getCause());
        }

        // 8 - Multicatch
        try {
            processarArquivo("asd");
        } catch (NullPointerException | IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // 9 - Relancar excecoes
        try {
            processarDados(null);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            System.out.println("Pilha de chamadas: " + e.getStackTrace());
        }
    }

    public static void validarIdade(int idade) {
        if (idade < 18) {
            throw new IllegalArgumentException("Idade invalida: " + idade);
        }

        System.out.println("Idade valida: " + idade);
    }

    public static void processarArquivo(String caminho) throws FileNotFoundException, IOException {
        if (caminho == null || caminho.isEmpty()) {
            throw new IOException("Caminho invalido: " + caminho);
        }

        File arquivo = new File(caminho);

        if (!arquivo.exists()) {
            throw new FileNotFoundException("Arquivo nao encontrado: " + caminho);
        }

        System.out.println("Processando arquivo: " + caminho);
    }

    public static void abrirArquivo(String caminho) {
        try {
            if (caminho == null) {
                // throw new NullPointerException("Caminho nulo.");
            }

            throw new FileNotFoundException("Arquivo nao encontrado.");
        } catch (FileNotFoundException e) {
            NullPointerException npe = new NullPointerException("Erro ao processar o arquivo");
            npe.initCause(e);
            throw npe;
        }
    }

    public static void processarDados(String dados) throws Exception {
        try {
            if (dados == null) {
                throw new NullPointerException("Dados nulos.");
            }

            if (dados.isEmpty()) {
                throw new Exception("Dados vazios.");
            }

            System.out.println("Processando dados: " + dados);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            throw e;
        }
    }

}
