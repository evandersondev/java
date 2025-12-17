package secao22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectOutputStream;

public class Arquivo {
    public static void main(String[] args) {
        // 1 - Leitura de arquivos
        String currentDir = System.getProperty("user.dir") + "/secao22/";
        System.out.println(currentDir);

        // modelo antigo
        // try (FileReader reader = new FileReader(currentDir + "arquivo.txt")) {
        // int caracter;
        // while ((caracter = reader.read()) != -1) {
        // System.out.print((char) caracter);
        // }
        // } catch (Exception e) {
        // System.out.println("Erro ao ler arquivo: " + e.getMessage());
        // }

        System.out.println();

        // modelo novo
        try (BufferedReader reader = new BufferedReader(new FileReader(currentDir + "arquivo.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }

        // 2 - Escrever em arquivos
        try (FileWriter writer = new FileWriter(currentDir + "saida.txt")) {
            writer.write("Escrevendo em arquivo!");
        } catch (Exception e) {
            System.out.println("Erro ao escrever em arquivo: " + e.getMessage());
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentDir + "saida2.txt"))) {
            writer.write("Escrevendo em arquivo com o buffered!");
            writer.newLine();
        } catch (Exception e) {
            System.out.println("Erro ao escrever em arquivo: " + e.getMessage());
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentDir + "saida2.txt", true))) {
            writer.append("Testando...");
        } catch (Exception e) {
            System.out.println("Erro ao escrever em arquivo: " + e.getMessage());
        }

        // 3 - Serializacao de objetos
        Pessoa pessoa = new Pessoa("Pedro", 25);
        System.out.println(pessoa.getNome());

        // serializacao
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(currentDir + "pessoa.ser"))) {
            oos.writeObject(pessoa);
            System.out.println("Objeto serializado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao serializar o objeto: " + e.getMessage());
        }
    }
}