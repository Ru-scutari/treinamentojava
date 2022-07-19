package application;

import aluguel.Estudantes;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Estudantes[] quartos = new Estudantes[10];

        System.out.println("Quantos quartos serão alugados? ");
        int n = sc.nextInt();


        for (int i=0; i<n; i++) {
            sc.nextLine();
            System.out.println("Digite o nome do pensionista: ");
            String aluno = sc.nextLine();
            System.out.println("Digite o email do pensionista: ");
            String email = sc.nextLine();
            System.out.println("Digite o nome número do quarto: ");
            int quarto = sc.nextInt();
            quartos[i] = new Estudantes(aluno, email, quarto);
        }

        System.out.println("Quartos ocupados: ");
        for (int i=0; i<10; i++){
            if (quartos[i] != null){
                System.out.println(i + ":" + quartos[i]);
            }
        }

        sc.close();
    }
}
