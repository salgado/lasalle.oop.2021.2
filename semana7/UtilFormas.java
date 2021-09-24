import java.util.ArrayList;

public class UtilFormas {

    /*
    public static void imprimeArea(Circulo param)
    {
        System.out.println("Área do Circulo = " + param.getArea());
    }

    public static void imprimeArea(Quadrado param)
    {
        System.out.println("Área do Quadrado = " + param.getArea());
    }
    */

    public static void imprimeArea(Forma forma)
    {

        if ( forma instanceof Retangulo )
            System.out.println("Dia do Sorvete: Área do Retangulo = " + forma.getArea());
        else if ( forma instanceof Circulo)
            System.out.println("Dia do Sorvete: Área do Circulo = " + forma.getArea());
        else if ( forma instanceof Quadrado)
            System.out.println("Dia do Sorvete: Área do Quadrado = " + forma.getArea());
        else if ( forma instanceof Triangulo)
            System.out.println("Dia do Sorvete: Área do Triangulo = " + forma.getArea());
            
    }

    public static void imprimeFormas(ArrayList<Forma> list)
    {
        System.out.println("Lista de Figuras");
        System.out.println("****************");
        for (Forma forma : list) {

            imprimeArea(forma);
        }

    }
    
}
