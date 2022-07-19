package entidades;

public class Programa {

    public static void main(String[] args) {

        Alunos aluno1 = new Alunos();

        aluno1.setCpf(1234567);
        aluno1.setIdade(34);
        aluno1.setNome("Joao");

        Alunos aluno2 = new Alunos();

        aluno2.setCpf(89101112);
        aluno2.setIdade(17);
        aluno2.setNome("Joaquim");

        Materias materia1 = new Materias();
        materia1.setNomeDaMateria("Matematica");
        materia1.setIdTarefa(1);

        Materias materia2 = new Materias();
        materia2.setNomeDaMateria("Geografia");
        materia2.setIdTarefa(2);

        Materias materia3 = new Materias();
        materia3.setNomeDaMateria("Portugues");
        materia3.setIdTarefa(3);

        Alunos_Materias alunoMateria = new Alunos_Materias();

        alunoMateria.setCpf(aluno1.getCpf());
        alunoMateria.setIdMateria(materia1.getIdTarefa());

    }
}
