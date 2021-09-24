public class Retangulo extends Quadrado {
    private Double lado2;

    public Retangulo(Double param1, Double param2) {
        super(param1);
        this.lado2 = param2;
    }

    public Double getArea()
    {
        return lado * this.lado2;
    }
    
}
