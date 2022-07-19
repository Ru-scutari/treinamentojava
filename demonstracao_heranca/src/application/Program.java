package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 100.00);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 200.0);

        //UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Rita", 0.0, 100.0);
        Account acc3 = new SavingsAccount(1004, "Joana", 0.0, 0.5);

        //DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.setEmprestimo(100.0);

        //BusinessAccount acc5 = (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.pegarEmprestimo(200.0);
            System.out.println("Empréstimo!");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.atualizacaoDeSaldo();
            System.out.println("Update");
        }

        Account acc6 = new Account(1005, "Alexx", 1000.00);
        acc6.saque(200.0);
        System.out.println(acc6.getSaldo());

        Account acc7 = new SavingsAccount(1005, "Maria", 1000.00, 0.01);
        acc7.saque(200.00);
        System.out.println(acc7.getSaldo());


        Account acc8 = new BusinessAccount(1006, "Beth", 1000.00,500.00);
        acc8.saque(200.00);
        System.out.println(acc8.getSaldo());
    }
}
