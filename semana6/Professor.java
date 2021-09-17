public final class Professor extends Pessoa {
    private String especialidade;
    private Float salario;

    public void receberAumento()
    {
        salario *= 1.1f;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }


    @Override
    public void saudacao() {
        System.out.println("Oi, eu sou um professor");
        
    }

    
}
