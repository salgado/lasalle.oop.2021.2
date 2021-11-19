package controller;

import java.util.ArrayList;
import java.util.List;

import dao.AlunoDAO;
import model.Aluno;

public class AlunoController {

    public void create(Aluno aluno)
    {
        try {

            AlunoDAO dao = new AlunoDAO();
            dao.create(aluno);

            
        } catch (Exception e) {
            System.out.println(" Erro no controller");
        }
        
    }

    public List<Aluno> readAll()
    {
        List<Aluno> alunos = new ArrayList<Aluno>();
        try{
            AlunoDAO dao = new AlunoDAO();
            alunos = dao.readAll();
        }
        catch(Exception e)
        {
            System.out.println(" Erro ao ler aluno");
        }

        return alunos;

    }
    
}
