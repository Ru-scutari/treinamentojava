package utilities;

public class PessoaFisica extends Contribuintes{

    private Double gastoComSaude;

    public PessoaFisica (){
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastoComSaude) {
        super(nome, rendaAnual);
        this.gastoComSaude = gastoComSaude;
    }

    public Double getGastoComSaude() {
        return gastoComSaude;
    }

    public void setGastoComSaude(Double gastoComSaude) {
        this.gastoComSaude = gastoComSaude;
    }

    @Override
    public double imposto(){
        if (super.getRendaAnual() <= 2000.00) {
            return super.getRendaAnual() * 0.15 - gastoComSaude * 0.5;
        }
        else {
            return super.getRendaAnual() * 0.25 - gastoComSaude *0.5;
        }
    }
}
