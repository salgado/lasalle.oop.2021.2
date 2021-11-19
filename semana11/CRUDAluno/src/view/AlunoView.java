package view;

import java.util.Scanner;

import controller.AlunoController;
import model.Aluno;

public class AlunoView {

    public void create()
    {
        try {
            Scanner teclado = new Scanner(System.in);

            Aluno aluno = new Aluno();
            
            AlunoController controller = new AlunoController();

            System.out.println("Inserir alunos -->");
            System.out.println("Matricula: ");
            aluno.setMatricula(teclado.nextLine());

            System.out.println("Nome: ");
            aluno.setNome(teclado.nextLine());

            System.out.println("Telefone: ");
            aluno.setTelefone(teclado.nextLine());

            //envio aluno para controler
            controller.create(aluno);


        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(" Erro ao ler aluno do teclado!");
        }
    }

    public void readAll()
    {
        AlunoController controller = new AlunoController();

        System.out.println(" Listagem de alunos");
        System.out.println(" **************** ");
        for (Aluno aluno:controller.readAll()) {

            System.out.println("Matricula: " + aluno.getMatricula());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Telefone: " + aluno.getTelefone());
            
        }
    }

    public static void main(String[] args) {
        AlunoView telaAluno = new AlunoView();

        telaAluno.create();

        telaAluno.readAll();
    }
}
