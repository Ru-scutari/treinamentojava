package utilities;

public class ProdutoImportado extends Produto {

    private Double taxaDeAlfandega;

    public ProdutoImportado (){
        super();
    }

   public ProdutoImportado(String nome, Double preco, Double taxaDeAlfandega) {
        super(nome, preco);
        this.taxaDeAlfandega = taxaDeAlfandega;
    }

    public Double getTaxaDeAlfandega() {
        return taxaDeAlfandega;
    }

    public void setTaxaDeAlfandega(Double taxaDeAlfandega) {
        this.taxaDeAlfandega = taxaDeAlfandega;
    }

    public Double precoTotal (){
        return super.getPreco() + taxaDeAlfandega;
    }

    @Override
    public String etiqueta (){
        return super.getNome() + " $ " + String.format("%.2f", precoTotal())
                + " (Taxa de Alfandega: $" + String.format("%.2f", taxaDeAlfandega) + ")";
    }
}
