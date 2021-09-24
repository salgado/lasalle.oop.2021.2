
public class Circulo extends Forma {

    private Double raio;

    //construtor
    public Circulo()
    {

    }

    public Circulo(Double param)
    {
        this.raio = param;
    }
    
    //metodos getters/setters
    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }


    @Override
    public Double getArea() {

        return Math.PI * this.raio * this.raio ;
    }
    
}
