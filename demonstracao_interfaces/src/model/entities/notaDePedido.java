package model.entities;

public class notaDePedido {

    private Double pagamentoMinimo;
    private Double taxa;

    public notaDePedido(){
    }

    public notaDePedido(Double pagamentoMinimo, Double taxa) {
        this.pagamentoMinimo = pagamentoMinimo;
        this.taxa = taxa;
    }

    public Double getPagamentoMinimo() {
        return pagamentoMinimo;
    }

    public void setPagamentoMinimo(Double pagamentoMinimo) {
        this.pagamentoMinimo = pagamentoMinimo;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public Double getPagamentoTotal(){
        return getPagamentoMinimo() + getTaxa();
    }
}
