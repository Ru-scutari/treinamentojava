package utilities;

import utilities.enums.Cor;

public class Retangulo extends Forma{

    private double comprimento;
    private double largura;

    public Retangulo(){
        super();
    }

    public Retangulo(Cor cor, double comprimento, double largura) {
        super(cor);
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public double area (){
        return comprimento * largura;
    }
}
