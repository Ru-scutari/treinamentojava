import java.io.File;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre os dados do caminho para os arquivos: ");
        String caminhoBase = sc.nextLine();

        File caminho = new File(caminhoBase);

        File[] pastas = caminho.listFiles(File::isDirectory);
        System.out.println("Pastas: ");
        for (File pasta : pastas){
            System.out.println(pasta);
        }

        File[] arquivos = caminho.listFiles(File::isFile);
        System.out.println("Arquivos: ");
        for (File arquivo : arquivos){
            System.out.println(arquivo);
        }

        boolean sucesso = new File(caminhoBase + "\\Pastatestecriada").mkdir();
        System.out.println("Pasta criada com sucesso: " + sucesso);

        sc.close();

    }
}
