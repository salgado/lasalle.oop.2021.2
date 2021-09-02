public class Bike {

    //atributos da classe
    private String marca;
    private Integer qtdMarchas;
    private String cor;

    //estado
    private Integer marchaAtual = 1;
    private Boolean andando = false;

    //construtor
    public Bike(){

        this.marca = "caloi";
        this.qtdMarchas = 5;
        this.setCor("vermelha");

    }

    public Bike(String cor)
    {
        this.marca = "caloi";
        this.qtdMarchas = 5;
        this.setCor(cor);
    }

    //caracteristica ou metodos
    public void andar()
    {
        System.out.println("Estou andando com " + this.marchaAtual + " marchas." );
        this.andando = true;
    }

    public void frear()
    {
        System.out.println("Freiando...3,2,1!!");
        this.andando = false;
    }

    public void aumentarMarcha()
    {
        if(this.marchaAtual==this.qtdMarchas)
        {
            System.out.println("Já estou na marcha máxima." );
        }
        else
            this.marchaAtual++;
    }

    public void diminuirMarcha()
    {
        if(this.marchaAtual == 1)
            System.out.println("Já estou na marcha mínima.");
        else
            this.marchaAtual--;
    }


    //metodos getters/setters
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
   

}