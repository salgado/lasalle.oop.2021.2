public class AlunoBolsista extends Aluno {

    public AlunoBolsista(String nome) {
        super(nome);
        
    }
    
    @Override
    public void saudacao()
    {
        System.out.println("Oi, eu sou um aluno bolsista.");
    }


}
