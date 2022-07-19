package entities;

public class Account {

    private Integer numeroDaConta;
    private String titular;
    protected Double saldo;

    public Account(){
    }

    public Account(Integer numeroDaConta, String titular, Double saldo) {
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(Integer numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void saque (double valor){
        saldo -= valor + 5.0;
    }

    public void deposito (Double valor){
        saldo += valor;
    }
}
