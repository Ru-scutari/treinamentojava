package entities;

public class SavingsAccount extends Account{

    private Double taxaDeJuros;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer numeroDaConta, String titular, Double saldo, Double taxaDeJuros) {
        super(numeroDaConta, titular, saldo);
        this.taxaDeJuros = taxaDeJuros;
    }

    public Double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(Double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }

    public void atualizacaoDeSaldo(){
        saldo += saldo * taxaDeJuros;
    }

    @Override
    public void saque (double valor){
        saldo -= valor;
    }
}
