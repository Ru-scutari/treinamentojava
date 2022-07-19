import entities.Funcionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o caminho do arquivo a ser lido: ");
        String path = sc.nextLine();


        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Funcionario> funcionarios = new ArrayList<>();

            String line = br.readLine();
            while (line != null){
                String[] camposDoArquivo = line.split(",");
                funcionarios.add(new Funcionario(camposDoArquivo[0], camposDoArquivo[1], Double.parseDouble(camposDoArquivo[2])));
                line = br.readLine();
            }

            System.out.println("Digite salário limite: ");
            Double salarioLimite = sc.nextDouble();

            System.out.println();
            System.out.println("Email das pessoas cujo salário é maior que " + String.format("%.2f", salarioLimite) + " : ");

            List<String> emails = funcionarios.stream()
                    .filter(x -> x.getSalario() > salarioLimite)
                    .map(x -> x.getEmail())
                    .sorted()
                    .collect(Collectors.toList());

            for (String email : emails) {
                System.out.println(email);
            }

            double soma = funcionarios.stream()
                    .filter(p -> p.getNome().charAt(0) == 'M')
                    .map(p -> p.getSalario())
                    .reduce(0.0, (x,y) -> x + y);

            sou
            System.out.println("Soma do salário das pessoas que começam com M: " + String.format("%.2f", soma));


        } catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}
