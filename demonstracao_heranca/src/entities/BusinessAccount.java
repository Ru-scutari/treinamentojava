package entities;

public class BusinessAccount extends Account{

    private Double emprestimo;

    public BusinessAccount(){
        super();
    }

    public BusinessAccount(Integer numeroDaConta, String titular, Double saldo, Double emprestimo) {
        super(numeroDaConta, titular, saldo);
        this.emprestimo = emprestimo;
    }

    public Double getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo (Double emprestimo) {
        this.emprestimo = emprestimo;
    }

    public void pegarEmprestimo (Double valor){
        if (valor <= emprestimo) {
            saldo = saldo + valor - 10.0;
        }
    }

    @Override
    public void saque(double valor) {
        super.saque(valor);
        saldo -= 2.0;
    }
}
