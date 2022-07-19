package utilities;

public class PessoaJuridica extends Contribuintes{

    private Integer funcionarios;

    public PessoaJuridica(){
        super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, int funcionarios) {
        super(nome, rendaAnual);
        this.funcionarios = funcionarios;
    }

    public int getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(int funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public double imposto(){

        if (funcionarios < 10){
            return super.getRendaAnual() * 0.16;
        }
        else {
            return super.getRendaAnual() * 0.14;
        }
    }
}
