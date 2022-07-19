package entidades;

public class Alunos_Materias {

    private int cpf;
    private int IdMateria;

    public Alunos_Materias(int cpf, int idMateria) {
        this.cpf = cpf;
        IdMateria = idMateria;
    }

    public Alunos_Materias() {

    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getIdMateria() {
        return IdMateria;
    }

    public void setIdMateria(int idMateria) {
        IdMateria = idMateria;
    }
}
