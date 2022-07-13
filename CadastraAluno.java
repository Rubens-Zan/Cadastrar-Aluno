public class CadastraAluno {
    ListaEncadeada<Aluno> listaAlunos;

    public void insereAluno(String nome, String email, String grr) {
        Aluno novo = new Aluno();
        novo.setAluno(nome, email, grr);
        listaAlunos.insere(novo);
    }
}

class Aluno {
    private String nome;
    private String email;
    private String grr;

    Aluno() {
    };

    void setAluno(String nome, String email, String grr) {
        this.nome = nome;
        this.email = email;
        this.grr = grr;
    }

    String getAluno(){
        return this.nome+"("+this.email+")"+"["+this.grr+"]";
    }
}