package entidades;

public class Materias {

    private int idTarefa;
    private String nomeDaMateria;

    public Materias(int idTarefa, String nomeDaMateria) {
        this.idTarefa = idTarefa;
        this.nomeDaMateria = nomeDaMateria;
    }

    public Materias() {

    }

    public int getIdTarefa() {
        return idTarefa;
    }

    public void setIdTarefa(int idTarefa) {
        this.idTarefa = idTarefa;
    }

    public String getNomeDaMateria() {
        return nomeDaMateria;
    }

    public void setNomeDaMateria(String nomeDaMateria) {
        this.nomeDaMateria = nomeDaMateria;
    }
}


