package application;

import model.entities.Reserva;
import model.exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println("Informe o numero do quarto: ");
            int numeroDoQuarto = sc.nextInt();
            System.out.println("Data de check-in (dd/mm/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.println("Data de check-out (dd/mm/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            Reserva reserva = new Reserva(numeroDoQuarto, checkIn, checkOut);

            System.out.println("Reserva: " + reserva);

            System.out.println();
            System.out.println("Entre com os dados da reserva atualizados: ");
            System.out.println("Entre com a nova data de check-in (dd/mm/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.println("Entre com a nova data de check-out (dd/mm/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reserva.atualizacaoDeDatas(checkIn, checkOut);

            System.out.println("Reserva: " + reserva);
        }
        catch (ParseException e){
            System.out.println("Data inválida");
        }
        catch (DomainException e){
            System.out.println("Erro na reserva." + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Erro inesperado.");
        }


        sc.close();
    }
}
