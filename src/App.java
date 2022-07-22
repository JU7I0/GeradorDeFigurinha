import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        var geradora = new GeradoraDeFigurinha();
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira sua imagem, via link: ");
        String imagem = sc.nextLine();
        System.out.println("Insira um texto para a figurinha: ");
        String nome = sc.nextLine();

        InputStream inputStream = new URL(imagem).openStream();
        
        String nomeArquivo = nome;
        
        geradora.cria(inputStream, nomeArquivo);
        
        System.out.println("Figurinha CRIADA!");
        System.out.println();
        
        sc.close();
        inputStream.close();
    }
}
