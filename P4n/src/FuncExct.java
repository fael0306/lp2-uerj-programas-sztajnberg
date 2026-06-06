public class FuncExct extends FuncCntrd {
    private float grat;

    public FuncExct(String nome, String cdemp, float salario, int dependentes, float grat) {
        super(nome, cdemp, salario, dependentes);
        this.grat = grat;
    }

    // Executivo: salario liquido = (salario base - IR) + gratificacao
    // Obs.: nao recebe salario-familia (ignora dependentes)
    @Override
    public float calculaSalario() {
        float salarioAposIR = this.salario * (1 - (aliquotaIR / 100));
        this.salarioliq = salarioAposIR + this.grat;
        return this.salarioliq;
    }

    public float getGrat() {
        return grat;
    }

    public void setGrat(float grat) {
        this.grat = grat;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nCodigo: %s\nSalario-base: %.2f\nGratificacao: %.2f\nSalario-liquido: %.2f",
                this.nome, this.cdemp, this.salario, this.grat, this.calculaSalario());
    }
}