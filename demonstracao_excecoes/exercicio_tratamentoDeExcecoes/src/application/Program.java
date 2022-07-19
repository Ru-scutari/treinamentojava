package application;

import model.Exceptions.ExcedeuLimiteException;
import model.Exceptions.SaldoInsuficienteException;
import model.utilities.Conta;

import java.util.Locale;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Entre com os dados da conta: ");
        System.out.print("Número da conta: ");
        int numeroDaConta = sc.nextInt();
        System.out.print("Titular da Conta: ");
        String titularDaConta = sc.next();
        System.out.print("Saldo Inicial: ");
        double saldo = sc.nextDouble();
        System.out.print("Indique limite de saque: ");
        double limiteDeSaque = sc.nextDouble();

        Conta conta = new Conta(numeroDaConta, titularDaConta, saldo, limiteDeSaque);

        System.out.println();
        System.out.print("Entre com o valor para saque: ");
        double saque = sc.nextDouble();

        try {
            conta.saque(saque);
        }
        catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }
        catch (ExcedeuLimiteException e){
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("Saldo atualizado: " + conta);

        sc.close();

        }
    }

