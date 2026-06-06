public class Funcionario {
    protected String nome;
    protected String cdemp;
    protected float salario;
    protected float salarioliq;

    public Funcionario(String nome, String cdemp, float salario) {
        this.nome = nome;
        this.cdemp = cdemp;
        this.salario = salario;
        this.salarioliq = salario;  // inicializa com o salario bruto
    }

    // Calcula salario liquido aplicando um desconto percentual
    public float calculaSalario(float descontoPercentual) {
        this.salarioliq = this.salario * (1 - (descontoPercentual / 100));
        return this.salarioliq;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCdemp() {
        return cdemp;
    }

    public void setCdemp(String cdemp) {
        this.cdemp = cdemp;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalarioliq() {
        return salarioliq;
    }

    public void setSalarioliq(float salarioliq) {
        this.salarioliq = salarioliq;
    }
}