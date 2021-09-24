import java.util.ArrayList;

public class TesterForma {

    public static void main(String[] args) {
        
        //Forma forma = new Forma();
        Circulo circulo = new Circulo(10.0);
        UtilFormas.imprimeArea(circulo);

        Quadrado quadrado = new Quadrado(10.0);
        UtilFormas.imprimeArea(quadrado);

        Retangulo retangulo = new Retangulo(10.0, 5.0);
        UtilFormas.imprimeArea(retangulo);

        Triangulo triangulo = new Triangulo(10.0, 5.0);
        UtilFormas.imprimeArea(triangulo);


        //cria uma lista de figuras geometricas
        ArrayList<Forma> listaFiguras = new ArrayList<Forma>();
        listaFiguras.add(circulo);
        listaFiguras.add(quadrado);

        //imprimir formas
        UtilFormas.imprimeFormas(listaFiguras);
        

    }
    
}
