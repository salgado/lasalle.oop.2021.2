public class Quadrado extends Forma{

    protected Double lado;

    public Quadrado(Double param)
    {
        this.lado = param;
    }

    @Override
    public Double getArea() {

        return this.lado * this.lado;
    }
    
}
