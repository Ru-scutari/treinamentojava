package application;

import entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serão cadastradas: ");
        int x = sc.nextInt();

        List<Funcionario> cadastro = new ArrayList<>();

        for (int i = 0; i < x; i++){
            System.out.println("Qual ID do funcionário? ");
            int id = sc.nextInt();
            System.out.println("Qual o nome do funcionário? ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Qual seu salário? ");
            double salario = sc.nextDouble();
            Funcionario novo = new Funcionario(id, nome, salario);
            cadastro.add(novo);
        }

        System.out.println("Qual o id do funcionário que terá o salário aumentado? ");
        int idAumento = sc.nextInt();
        Integer confirmation = position(cadastro, idAumento);
        if (confirmation == null) {
            System.out.println("Não existe!");
        }
        else {
            System.out.println("Qual a porcentagem a ser acrescida?");
            double porcentagem = sc.nextDouble();
            cadastro.get(confirmation).aumentoSalario(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de Empregados: ");
        for (Funcionario ordem: cadastro){
            System.out.println(ordem);
        }

        sc.close();
    }

    public static Integer position (List<Funcionario> posicao, int id) {
        for (int i=0; i<posicao.size();i++){
            if (posicao.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }

}
