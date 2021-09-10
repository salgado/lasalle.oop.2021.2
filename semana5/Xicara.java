public class Xicara{

    private String cor;

    private Boolean cheia;

    //construtor
    public Xicara(){
        this.cor = "amarelo";
        this.cheia = false;
    }

    // getters/setters
    public String getCor() {
        return cor;
    }

    public Boolean getCheia() {
        return cheia;
    }
    
    //metodos
    public void encher()
    {
        this.cheia = true;
    }

    public void beberTudo()
    {
        this.cheia = false;
    }

    public void imprimir()
    {
        System.out.println(this);
    }

    @Override
    public String toString() {
        
        return "Cor:" + this.getCor() + "\nCheia:" + this.getCheia();
    }

}