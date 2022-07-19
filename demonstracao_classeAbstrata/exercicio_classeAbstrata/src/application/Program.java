package application;

import utilities.Contribuintes;
import utilities.PessoaFisica;
import utilities.PessoaJuridica;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Contribuintes> contribuintes = new ArrayList<>();

        System.out.println("Entre com o número de pagadores de impostos: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("Pessoa Física ou Pessoa Jurídica (f/j)? ");
            char resposta = sc.next().charAt(0);
            System.out.println("Pagador de imposto #" + i + ": ");
            System.out.println("Nome: ");
            String nome = sc.next();
            System.out.println("Renda anual: ");
            double rendaAnual = sc.nextDouble();

            if (resposta == 'f') {
                System.out.println("Informe os gastos com saúde: ");
                double gastoComSaude = sc.nextDouble();

                contribuintes.add(new PessoaFisica(nome, rendaAnual, gastoComSaude));
            }
            else {
                System.out.println("Informe quantos funcionários tem a empresa: ");
                int funcionarios = sc.nextInt();

                contribuintes.add(new PessoaJuridica(nome, rendaAnual, funcionarios));
            }
        }

        System.out.println();
        System.out.println("Impostos pagos: ");
        for (Contribuintes cont : contribuintes){
            System.out.println(cont.getNome() + ": $ " + String.format("%.2f", cont.imposto()));
        }


        double soma =0.0;
        for (Contribuintes cont : contribuintes){
            double imposto = cont.imposto();
            soma += imposto;
        }

        System.out.println();
        System.out.print("Total de imposto pago: $" + String.format("%.2f", soma));

        sc.close();
    }
}
