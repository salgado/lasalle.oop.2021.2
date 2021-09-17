public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    public Aluno(String nome) {
        super(nome);
    }

    public void cancelarMatricula()
    {
        System.out.println("Matrícula Cancelada!!!");
    }

    //getters/setters

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void saudacao() {
        System.out.println("Oi, eu sou um aluno");
        
    }

    public final void comecarAula()
    {
        System.out.println("Aula começa as 19:15h");
    }
    
}
