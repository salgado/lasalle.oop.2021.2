import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {

    private String nomeArq;

    public Arquivo(String nome) {
        this.nomeArq = nome;
    }

    public void imprimir() {
        try (BufferedReader reader = new BufferedReader(new FileReader(this.nomeArq))) {
            String linha = reader.readLine();

            while (linha != null) {
                System.out.println(linha);
                linha = reader.readLine();
            }

        } catch (Exception e) {
            System.out.println(("Erro ao tentar ler arquivo!!" + e.getMessage()));
        }
    }

    public List<Voto> apurarVotos() {

        List<Voto> listaVotos = new ArrayList<Voto>();

        try (BufferedReader reader = new BufferedReader(new FileReader(this.nomeArq))) {
            String linha = reader.readLine();

            while (linha != null) {
                // separar nome de votos (alex,30)
                String[] votoUrna = linha.split(",");
                Voto voto = new Voto(votoUrna[0], Integer.parseInt(votoUrna[1]));

                listaVotos.add(voto);

                // System.out.println(linha);
                linha = reader.readLine();
            }

        } catch (Exception e) {
            System.out.println(("Erro ao tentar ler arquivo!!" + e.getMessage()));
        }

        return listaVotos;

    }

}
