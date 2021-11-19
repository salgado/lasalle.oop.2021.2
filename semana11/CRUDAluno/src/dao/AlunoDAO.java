package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.ConnectionFactory;
import model.Aluno;

public class AlunoDAO{

    public void create(Aluno aluno)
    {
        Connection conexaoBD = null;
        PreparedStatement stmt = null;
        String sql = "insert into aluno(matricula, nome, telefone) values (?, ?, ?)";
        
        try {
            conexaoBD = ConnectionFactory.getConnection();

            stmt = conexaoBD.prepareStatement(sql) ; //sql
            stmt.setString(1, aluno.getMatricula());
            stmt.setString(2, aluno.getNome());
            stmt.setString(3, aluno.getTelefone());

            //executar query no banco
            stmt.executeUpdate();

            System.out.println("[AlunoDAO] Aluno inserido no banco com sucesso!");
        
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally
        {
            System.out.println(" Fechando conexao!!");
            ConnectionFactory.closeConnection(conexaoBD, stmt);
        }

    }


    public List<Aluno> readAll()
    {
        Connection conexaoBD = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = " select matricula, nome, telefone from aluno ";
        List<Aluno> alunos = new ArrayList<Aluno>();
        
        try {
            
            conexaoBD = ConnectionFactory.getConnection();
         
            stmt = conexaoBD.prepareStatement(sql);
            rs = stmt.executeQuery();

            while(rs.next())
            {
                Aluno aluno = new Aluno();
                aluno.setMatricula(rs.getString("matricula"));
                aluno.setNome(rs.getString("nome"));
                aluno.setTelefone(rs.getString("telefone"));

                alunos.add(aluno);
            }
           
            


        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
            ConnectionFactory.closeConnection(conexaoBD, stmt);
        }

        return alunos;

    }
}