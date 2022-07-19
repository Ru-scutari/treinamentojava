package application;


import utilities.Funcionario;
import utilities.FuncionarioTerceirizado;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> funcionario = new ArrayList<>();

        System.out.println("Qual a quantidade de funcionarios? ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("Funcionário #" + i + ":");
            System.out.println("Ele é terceirizado? (s/n)");
            char resposta = sc.next().charAt(0);
            System.out.println("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Quantidade de horas de trabalho: ");
            int horas = sc.nextInt();
            System.out.println("Valor por hora: ");
            double valorPorHora = sc.nextDouble();

                if (resposta == 's'){
                    System.out.println("Valor do pagamento adicional: ");
                    double pagamentoAdicional = sc.nextDouble();
                    funcionario.add(new FuncionarioTerceirizado(nome, horas, valorPorHora, pagamentoAdicional));
                }
                else {
                    funcionario.add(new Funcionario(nome, horas, valorPorHora));
                }
        }

        System.out.println();
        System.out.println("Pagamentos: ");
        for (Funcionario emp: funcionario){
            System.out.println(emp.getNome() + " - $" + String.format("%.2f", emp.pagamento()));
        }

        sc.close();
    }
}
