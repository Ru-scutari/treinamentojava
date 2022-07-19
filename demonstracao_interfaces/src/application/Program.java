package application;

import model.entities.AluguelDeCarros;
import model.entities.Veiculo;
import model.services.ServicoDeAluguelDeCarros;
import model.services.ServicoDeTaxaBrasil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        System.out.println("Enter rental data");
        System.out.print("Car model: ");
        String modelo = sc.nextLine();
        System.out.print("Pickup (dd/MM/yyyy HH:mm): ");
        Date dataDeRetirada = sdf.parse(sc.nextLine());
        System.out.print("Return (dd/MM/yyyy HH:mm): ");
        Date dataDeDevolucao = sdf.parse(sc.nextLine());

        AluguelDeCarros aluguelDeCarros = new AluguelDeCarros(dataDeRetirada, dataDeDevolucao, new Veiculo(modelo));

        System.out.print("Digite o valor por hora: ");
        double valorPorHora = sc.nextDouble();
        System.out.print("Digite o valor por dia: ");
        double valorPorDia = sc.nextDouble();

        ServicoDeAluguelDeCarros servicoDeAluguelDeCarros = new ServicoDeAluguelDeCarros(valorPorHora, valorPorDia, new ServicoDeTaxaBrasil());

        servicoDeAluguelDeCarros.ProcessoDeNotaDePedido(aluguelDeCarros);

        System.out.println("Nota de Pagamento: ");
        System.out.println("Pagamento mínimo: "
                + String.format("%.2f", aluguelDeCarros.getNotaDePedido().getPagamentoMinimo()));
        System.out.println("Taxa: "
                + String.format("%.2f", aluguelDeCarros.getNotaDePedido().getTaxa()));
        System.out.println("Pagamento Total: "
                + String.format("%.2f", aluguelDeCarros.getNotaDePedido().getPagamentoTotal()));






        sc.close();

    }
}
