package utilities;

import utilities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private Date momento;
    private OrderStatus status;

    private Client cliente;
    private List<OrderItem> items = new ArrayList<OrderItem>();

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");

    public Order(){
    }

    public Order(Date momento, OrderStatus status, Client cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem (OrderItem item){
        items.remove(item);
    }

    public Double total (){
        int sum = 0;
        for (OrderItem item: items){
            sum += item.subTotal();
        }
        return Double.valueOf(sum);
    }

    public String toString (){
        StringBuilder sb = new StringBuilder();
        sb.append("Momento do pedido: ");
        sb.append(sdf.format(momento) + "\n");
        sb.append("Status do Pedido: ");
        sb.append(status + "\n");
        sb.append("Cliente: ");
        sb.append(cliente+ "\n" );
        sb.append("Itens do pedido: ");
            for (OrderItem item: items){
                System.out.println(item + "\n");
            }
        sb.append("Preço total: $");
        sb.append(String.format("%.2f", total()));

        return sb.toString();
    }
}
