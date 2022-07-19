package entidades;

public class Alunos {
        private String nome;
        private int cpf;
        private int idade;

        public Alunos(String nome, int cpf, int idade) {
                this.nome = nome;
                this.cpf = cpf;
                this.idade = idade;
        }

        public Alunos() {

        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public int getCpf() {
                return cpf;
        }

        public void setCpf(int cpf) {
                this.cpf = cpf;
        }

        public int getIdade() {
                return idade;
        }

        public void setIdade(int idade) {
                this.idade = idade;
        }
}

