package model.utilities;

import model.Exceptions.ExcedeuLimiteException;
import model.Exceptions.SaldoInsuficienteException;

public class Conta {

    private Integer numeroDaConta;
    private String titularDaConta;
    private Double saldo;
    private Double limiteDeSaque;

    public Conta (){
    }

    public Conta(Integer numeroDaConta, String titularDaConta, Double saldo, Double limiteDeSaque) {
        this.numeroDaConta = numeroDaConta;
        this.titularDaConta = titularDaConta;
        this.saldo = saldo;
        this.limiteDeSaque = limiteDeSaque;
    }

    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(Integer numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTitularDaConta() {
        return titularDaConta;
    }

    public void setTitularDaConta(String titularDaConta) {
        this.titularDaConta = titularDaConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimiteDeSaque() {
        return limiteDeSaque;
    }

    public void setLimiteDeSaque(Double limiteDeSaque) {
        this.limiteDeSaque = limiteDeSaque;
    }

    public void deposito (Double valor){
        saldo += valor;
    }

    public void saque (Double valor) throws SaldoInsuficienteException, ExcedeuLimiteException {
        if (!(getSaldo() > valor)){
            throw new SaldoInsuficienteException("Saldo não suficiente");
        }
        else if (valor > getLimiteDeSaque()){
            throw new ExcedeuLimiteException("O valor de saque excede o limite.");
        }
        else {
            this.saldo = saldo - valor;
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(" $ ");
        sb.append(getSaldo());
        return sb.toString();
    }
}
