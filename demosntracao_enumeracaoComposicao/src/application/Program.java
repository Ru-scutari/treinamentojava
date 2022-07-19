package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import static entities.Worker.income;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");

        System.out.println("Entre com o nome do Departamento: ");
        String depart = sc.nextLine();
        System.out.printf("Digite os dados do trabalhador: %nNome: ");
        String nome = sc.nextLine();
        System.out.println("Level: ");
        String level = sc.nextLine();
        System.out.println("Base de Salário: ");
        double baseDeSalario = sc.nextDouble();
        Worker funcionario = new Worker(nome, WorkerLevel.valueOf(level),  baseDeSalario,  new Department(depart));

        System.out.println("Quantos contratos tem esse funcionário? ");
        int n = sc.nextInt();

        for (int i=1; i < n; i++){
            System.out.print("Entre com os dados do contrato #" + i + ": ");
            System.out.println("Data (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.println("Valor por hora: ");
            double value = sc.nextDouble();
            System.out.println("Duração em hora: ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, value, hours);
            funcionario.addContract(contract);
        }

        System.out.println();
        System.out.println("Entre com o mês e ano (MM/YYYY) desse funcionário para ver o total recebido: ");
        String monthAndYear = sc.nextLine();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Funcionário: " + Worker.getName());
        System.out.println("Departamento: " + Worker.getDepartment().getName());
        System.out.println("Recebeu: " + monthAndYear + ":" + String.valueOf(income(year, month)));

        sc.close();
    }
}
