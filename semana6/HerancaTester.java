public class HerancaTester {

    public static void main(String[] args) {
        
        //Pessoa pessoa = new Pessoa("Alex");
        //Pessoa pessoa = new Pessoa();
        //pessoa.fazerAniversario();

        //Aluno
        AlunoBolsista aluno = new AlunoBolsista("Salim");
        //aluno.setNome("Aluno Novo");
        aluno.fazerAniversario();


        //Professor
        Professor professor = new Professor();
        professor.setSalario(100.0f);
        professor.setNome("Alex");
        System.out.println("Salario:" + professor.getSalario());
        professor.receberAumento();
        System.out.println("Salario:" + professor.getSalario());

        aluno.saudacao();
        professor.saudacao();
        

    }
    
}
