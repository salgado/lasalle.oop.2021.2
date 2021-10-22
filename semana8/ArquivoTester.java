import java.util.Collections;
import java.util.List;

public class ArquivoTester {

    public static void main(String[] args) {

        Arquivo arq = new Arquivo("votos.csv");
        List<Voto> votos = arq.apurarVotos();

        // imprime votos lidos
        for (Voto voto : votos) {
            System.out.println(voto);
        }

        Collections.sort(votos);

        System.out.println("Votos ordenados ****");
        // imprime votos lidos ORDENADA
        for (Voto voto : votos) {
            System.out.println(voto);
        }

        // Definir o candidato vencedor!!!

        // Imprimir ranking final

    }

}
