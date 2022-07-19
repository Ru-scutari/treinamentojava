import entities.Produto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o caminho para o arquivo: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Produto> lista = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] campos = line.split(",");
                lista.add(new Produto(campos[0], Double.parseDouble(campos[1])));
                line = br.readLine();
            }

            double avg = lista.stream()
                    .map(p -> p.getPreco())
                    .reduce(0.0, (x,y) -> x + y) / lista.size();

            System.out.println("Média de preço: " + String.format("%.2f", avg));

            Comparator<String> comparator = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> nomes = (List<String>) lista.stream()
                    .filter( p -> p.getPreco() < avg)
                    .map( p -> p.getNome())
                    .sorted(comparator.reversed())
                    .collect(Collectors.toList());

            nomes.forEach(System.out::println);


        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        sc.close();
    }
}
