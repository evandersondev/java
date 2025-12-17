package secao22;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import javax.imageio.ImageIO;

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

        try (
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(currentDir + "video.mkv"));
                BufferedOutputStream bos = new BufferedOutputStream(
                        new FileOutputStream(currentDir + "copia_video.mkv"))) {
            byte[] buffer = new byte[1024]; // Buffer 1kb em 1kb
            int bytesLidos;
            while ((bytesLidos = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesLidos);
            }

        } catch (Exception e) {
            System.out.println("Erro ao copiar video: " + e.getMessage());
        }

        // 5 - Manipulacao de imagem
        try {
            BufferedImage imagem = ImageIO.read(new File(currentDir + "imagem.jpg"));

            if (imagem == null) {
                System.out.println("A imagem nao pode ser lida");
                return;
            }

            Graphics2D g2d = imagem.createGraphics();
            g2d.setFont(new Font("Arial", Font.BOLD, 50));
            FontMetrics fm = g2d.getFontMetrics();
            String texto = "Texto no centro";

            // centralizar texto na imagem
            int laguraTexto = fm.stringWidth(texto);
            int alturaTexto = fm.getHeight();
            int x = (imagem.getWidth() - laguraTexto) / 2;
            int y = (imagem.getHeight() - alturaTexto) / 2 + fm.getAscent();

            // desenhar retuangulo
            g2d.setColor(Color.black);
            g2d.fillRect(x - 10, y - fm.getAscent(), laguraTexto + 20, alturaTexto);

            // desenhar o texto em cima do retangulo
            g2d.setColor(Color.white);
            g2d.drawString(texto, x, y);

            // liberacao de recurso
            g2d.dispose();

            // salvar imagem
            File outputFile = new File(currentDir + "imagem_com_texto.png");
            ImageIO.write(imagem, "png", outputFile);

            System.out.println("Imagem processada com sucesso!");

        } catch (Exception e) {
            System.out.println("Erro ao processar imagem: " + e.getMessage());
        }

        // 6 - Manipulacao de arquivos e diretorios
        // Criacao de diretorio
        Path caminhoDiretorio = Paths.get(currentDir + "diretorioNovo");
        try {
            if (!Files.exists(caminhoDiretorio)) {
                Files.createDirectories(caminhoDiretorio);
                System.out.println("Diretorio criado com sucesso: " + caminhoDiretorio);
            } else {
                System.out.println("Diretorio ja existe: " + caminhoDiretorio);
            }
        } catch (Exception e) {
            System.out.println("Erro ao criar diretorio: " + e.getMessage());
        }

        // Criar, Copiar e mover arquivos
        Path caminhoArquivoOriginal = Paths.get(currentDir + "arquivo_criado.txt");
        Path caminhoArquivoCopia = Paths.get(currentDir + "arquivo_criado_copia.txt");
        Path caminhoArquivoMovido = Paths.get(currentDir, "diretorioNovo", "arquivo_movido.txt");
        try {
            // Criar
            if (!Files.exists(caminhoArquivoOriginal)) {
                Files.createFile(caminhoArquivoOriginal);
                System.out.println("Arquivo criado com sucesso: " + caminhoArquivoOriginal);
            }

            // Copiar
            if (!Files.exists(caminhoArquivoCopia)) {
                Files.copy(caminhoArquivoOriginal, caminhoArquivoCopia);
                System.out.println("Arquivo copiado com sucesso: " + caminhoArquivoCopia);
            }

            // Mover
            Files.move(caminhoArquivoCopia, caminhoArquivoMovido);
            System.out.println("Arquivo movido com sucesso: " + caminhoArquivoMovido);

        } catch (Exception e) {

        }

        // 7 - Arquivos temporarios
        try {
            Path arquivoTemporario = Files.createTempFile("meuTempFile", ".txt");
            System.out.println("Arquivo temporario criado com sucesso: " + arquivoTemporario.toAbsolutePath());
            Files.writeString(arquivoTemporario, "Conteudo do arquivo temporario");

            String conteudo = Files.readString(arquivoTemporario);
            System.out.println("Conteudo do arquivo temporario: " + conteudo);
            Files.deleteIfExists(arquivoTemporario);

        } catch (Exception e) {
            System.out.println("Erro ao criar arquivo temporario: " + e.getMessage());
        }

        // 8 Arquivos zip
        // Comprimir
        Path arquivoOriginal = Paths.get(currentDir + "arquivo.txt");
        Path arquivoZip = Paths.get(currentDir + "arquivo_comprimido.zip");

        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(arquivoZip.toFile()));
                FileInputStream fis = new FileInputStream(arquivoOriginal.toFile());) {
            ZipEntry zipEntry = new ZipEntry(arquivoOriginal.getFileName().toString());
            zos.putNextEntry(zipEntry);
            byte[] buffer = new byte[1024];
            int bytesLidos;
            while ((bytesLidos = fis.read(buffer)) != -1) {
                zos.write(buffer, 0, bytesLidos);
            }
            zos.close();
            System.out.println("Arquivo comprimido com sucesso: " + arquivoZip);
        } catch (Exception e) {
            System.out.println("Erro ao comprimir arquivo: " + e.getMessage());
        }

        // Descomprimir
        Path arquivoZipado = Paths.get(currentDir + "arquivo_comprimido.zip");
        Path destino = Paths.get(currentDir + "desconpactado");
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(arquivoZipado.toFile()));) {
            ZipEntry zipEntry;

            // criar o diretorio se nao existir
            if (!Files.exists(destino)) {
                Files.createDirectories(destino);
            }

            // Interar por todos os arquivos zips
            while ((zipEntry = zis.getNextEntry()) != null) {
                Path caminhoDestino = destino.resolve(zipEntry.getName());

                try (FileOutputStream fos = new FileOutputStream(caminhoDestino.toFile())) {
                    byte[] buffer = new byte[1024];
                    int bytesLidos;
                    while ((bytesLidos = zis.read(buffer)) != -1) {
                        fos.write(buffer, 0, bytesLidos);
                    }
                }

                System.out.println("Arquivo descomprimido: " + caminhoDestino);
                zis.closeEntry();
            }
        } catch (Exception e) {
            System.out.println("Erro ao descomprimir arquivo: " + e.getMessage());
        }

        // 9 - Manipulacao CSV
        // Leitura
        String arquivoCSV = currentDir + "dados.csv";
        String linha;
        String separador = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(arquivoCSV))) {
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(separador);
                System.out.println("Nome: " + dados[0] + ", Idade: " + dados[1] + ", Cidade: " + dados[2]);
            }

        } catch (Exception e) {
            System.out.println("Erro ao descomprimir arquivo: " + e.getMessage());
        }

        // Escrita
        String arquivoEscritaCSV = currentDir + "dados_escrita.csv";
        try (FileWriter write = new FileWriter(arquivoEscritaCSV)) {
            write.append("Nome,Idade,Cidade\n");
            write.append("Pedro,25,São Paulo\n");
            write.append("Maria,30,Rio de Janeiro\n");
            write.append("João,35,Belo Horizonte\n");

            System.out.println("Arquivo csv escrito com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao escrever arquivo csv: " + e.getMessage());
        }
    }
}