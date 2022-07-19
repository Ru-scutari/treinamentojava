package entities;

public class Funcionario {

    private int id;
    private String nome;
    private double salario;

    public Funcionario(int id, String nome, double salario){
        this.id = id;
        this.nome = nome;
        this. salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentoSalario(double porcentagem){
        salario += (salario * porcentagem)/100.0;
    }

    @Override
    public String toString() {
        return "Funcionario #" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", salario=" + salario
                ;
    }
}
