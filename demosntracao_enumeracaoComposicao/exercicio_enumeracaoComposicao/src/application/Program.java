package application;

import utilities.Client;
import utilities.Order;
import utilities.OrderItem;
import utilities.Product;
import utilities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com os dados do trabalhador: ");
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Data de nascimento (dd/MM/YYYY): ");
        Date dataDeNascimento = sdf.parse(sc.next());
        Client cliente = new Client(nome, email, dataDeNascimento);

        System.out.println("Entre com os dados do pedido: ");
        System.out.print("Status: ");
        String statusString = sc.nextLine();
        OrderStatus status = OrderStatus.valueOf(statusString);

        Order pedido = new Order(new Date(), status, cliente);

        System.out.println("Quantos itens para este pedido? ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("Entre com os dados do pedido #" + i + ": ");
            System.out.println("Nome do produto: ");
            sc.nextLine();
            String nomeDoProduto = sc.nextLine();
            System.out.println("Preço do produto: ");
            Double preco = sc.nextDouble();
            Product produto = new Product(nomeDoProduto, preco);

            System.out.println("Quantidade: ");
            int quantidade = sc.nextInt();
            OrderItem itemDoPedido = new OrderItem(quantidade, preco, produto);
            pedido.addItem(itemDoPedido);
        }

        System.out.println();
        System.out.println("Resumo do pedido: " + pedido);

        sc.close();
    }
}
