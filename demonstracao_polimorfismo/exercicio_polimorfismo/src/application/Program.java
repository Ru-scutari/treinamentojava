package application;

import utilities.Produto;
import utilities.ProdutoImportado;
import utilities.ProdutoUsado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Produto> produtos = new ArrayList<>();

        System.out.print("Entre com o número de produtos: ");
        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            System.out.println("Dados do produto #" + i + ": ");
            System.out.println("O produto é Comum, Usado ou Importado (c/u/i)? ");
            char resposta = sc.next().charAt(0);
            System.out.println("Nome:");
            String nome = sc.next();
            System.out.println("Preço: ");
            double preco = sc.nextDouble();

                if (resposta == 'c') {
                    produtos.add(new Produto(nome, preco));
                }
                else if (resposta == 'u'){
                    System.out.println("Data da fabricação (dd/MM/YYYY): ");
                    Date dataDeFabricacao = sdf.parse(sc.next());
                    produtos.add(new ProdutoUsado(nome, preco, dataDeFabricacao));
                }
                else {
                    System.out.println("Qual a taxa de Alfândega: ");
                    double taxaDeAlfandega = sc.nextDouble();
                    produtos.add(new ProdutoImportado(nome, preco, taxaDeAlfandega));
                }
            }

        System.out.println();
        System.out.println("Etiquetas de preços: ");
        for (Produto prod: produtos){
            System.out.println(prod.etiqueta());

        }
        sc.close();
    }
}
