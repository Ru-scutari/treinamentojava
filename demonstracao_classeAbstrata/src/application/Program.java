package application;

import utilities.Circulo;
import utilities.Forma;
import utilities.Retangulo;
import utilities.enums.Cor;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Forma> formas = new ArrayList<>();

        System.out.println("Informe a quantidade de formas: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){

            System.out.println("Digite os dados para a #" + i + " figura:");
            System.out.println("Retângulo ou Círculo (r/c)? ");
            char resposta = sc.next().charAt(0);
            System.out.println("Cor:");
            Cor cor = Cor.valueOf(sc.next());

            if (resposta == 'r'){
                System.out.println("Digite o comprimento: ");
                double comprimento = sc.nextDouble();
                System.out.println("Digite a largura: ");
                double largura = sc.nextDouble();

                formas.add(new Retangulo(cor, comprimento, largura));
            }
            else {
                System.out.println("Digite o raio: ");
                double raio = sc.nextDouble();

                formas.add(new Circulo(cor, raio));
            }
        }

        System.out.println();
        System.out.println("Áreas das formas: ");
        for (Forma shape: formas){
            System.out.println(String.format("%.2f",shape.area()));
        }

        sc.close();
    }
}
