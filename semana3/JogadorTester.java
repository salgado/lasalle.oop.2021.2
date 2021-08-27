public class JogadorTester {

    public static void main(String[] args) {
        
        Jogador jog1 = new Jogador();  //criar um objeto jog1 do tipo Jogador

        jog1.nome = "Neymar";
        jog1.sobreNome = "Junior";
        jog1.idade = 24;
        //jog1.time = "PSG";
        jog1.time.nome="PSG";
        //jog1.timeEscudo = "psg.jpg";
        jog1.time.escudo = "psg.jpg";

        jog1.mostrarNomeSobrenome();


    }
    
}
