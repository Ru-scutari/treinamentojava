package model.entities;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class AluguelDeCarros {

    private Date dataDeRetirada;
    private Date dataDeDevolucao;

    private Veiculo veiculo;
    private notaDePedido notaDePedido;

    public AluguelDeCarros(){
    }

    public AluguelDeCarros(Date dataDeRetirada, Date dataDeDevolucao, Veiculo veiculo) {
        this.dataDeRetirada = dataDeRetirada;
        this.dataDeDevolucao = dataDeDevolucao;
        this.veiculo = veiculo;
    }

    public Date getDataDeRetirada() {
        return dataDeRetirada;
    }

    public void setDataDeRetirada(Date dataDeRetirada) {
        this.dataDeRetirada = dataDeRetirada;
    }

    public Date getDataDeDevolucao() {
        return dataDeDevolucao;
    }

    public void setDataDeDevolucao(Date dataDeDevolucao) {
        this.dataDeDevolucao = dataDeDevolucao;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public model.entities.notaDePedido getNotaDePedido() {
        return notaDePedido;
    }

    public void setNotaDePedido(model.entities.notaDePedido notaDePedido) {
        this.notaDePedido = notaDePedido;
    }
}
