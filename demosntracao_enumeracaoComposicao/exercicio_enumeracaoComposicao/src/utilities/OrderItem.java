package utilities;

public class OrderItem {

    private Integer quantidade;
    private Double preco;
    private Product produto;

    public OrderItem(){
    }

    public OrderItem(Integer quantidade, Double preco, Product produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Product getProduto() {
        return produto;
    }

    public void setProduto(Product produto) {
        this.produto = produto;
    }

    public Double subTotal(){

        return quantidade * preco;
    }

    public String toString(){
        return produto.getNome() +
                ", " +
                String.format("%.2f", produto.getPrice())
                + ", Quantidade: "
                + quantidade
                + ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }
}
