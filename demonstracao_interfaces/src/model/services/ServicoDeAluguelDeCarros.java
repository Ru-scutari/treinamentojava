package model.services;

import model.entities.AluguelDeCarros;
import model.entities.notaDePedido;

public class ServicoDeAluguelDeCarros {

    private Double valorPorHora;
    private Double valorPorDia;

    private ServicoDeTaxa servicoDeTaxa;

    public ServicoDeAluguelDeCarros(Double valorPorHora, Double valorPorDia, ServicoDeTaxa servicoDeTaxaBrasil) {
        this.valorPorHora = valorPorHora;
        this.valorPorDia = valorPorDia;
        this.servicoDeTaxa = servicoDeTaxaBrasil;
    }

    public void ProcessoDeNotaDePedido(AluguelDeCarros aluguelDeCarros){
        long t1 = aluguelDeCarros.getDataDeRetirada().getTime();
        long t2 = aluguelDeCarros.getDataDeDevolucao().getTime();
        double horas = (double) (t2 - t1)/60/60;

        double pagamentoMinimo;

        if (horas <= 12.0){
            pagamentoMinimo = Math.ceil(horas) * valorPorHora;
        }
        else {
            pagamentoMinimo = Math.ceil(horas /24) * valorPorDia;
        }

        double taxa = servicoDeTaxa.taxa(pagamentoMinimo);

        aluguelDeCarros.setNotaDePedido(new notaDePedido(pagamentoMinimo, taxa));
    }
}
