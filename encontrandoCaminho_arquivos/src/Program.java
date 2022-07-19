import java.io.File;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o caminho de um arquivo: ");
        String caminhoBase = sc.nextLine();

        File caminho = new File(caminhoBase);

        System.out.println("Nome do arquivo: " + caminho.getName());
        System.out.println("Caminho do arquivo: " + caminho.getParent());
        System.out.println("Caminho completo do arquivo: " + caminho.getPath());



        sc.close();


    }
}
