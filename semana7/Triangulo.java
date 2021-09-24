public class Triangulo extends Forma {

    private Double base;
    private Double altura;

    public Triangulo(Double param1, Double param2)
    {
        this.base = param1;
        this.altura = param2;
    }

    @Override
    public Double getArea() {
        
        return (this.base * this.altura)/2 ;
    }

    
    
}
