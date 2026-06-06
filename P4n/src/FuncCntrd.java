public class FuncCntrd extends Funcionario {
    private int dependentes;
    private float valorPorDep = 9.58f;
    protected float aliquotaIR = 15f; // 15% em percentual

    public FuncCntrd(String nome, String cdemp, float salario, int dependentes) {
        super(nome, cdemp, salario);
        this.dependentes = dependentes;
    }

    // Metodo que calcula o salario liquido considerando salario-familia e IR
    public float calculaSalario() {
        float salarioFamilia = dependentes * valorPorDep;
        float salarioBaseComFamilia = this.salario + salarioFamilia;
        this.salarioliq = salarioBaseComFamilia * (1 - (aliquotaIR / 100));
        return this.salarioliq;
    }

    // Metodo que retorna o salario base + salario familia (para exibicao)
    public float getSalarioBaseComFamilia() {
        return this.salario + (dependentes * valorPorDep);
    }

    public int getDependentes() {
        return dependentes;
    }

    public void setDependentes(int dependentes) {
        this.dependentes = dependentes;
    }

    public float getValorPorDep() {
        return valorPorDep;
    }

    public void setValorPorDep(float valorPorDep) {
        this.valorPorDep = valorPorDep;
    }

    public float getAliquotaIR() {
        return aliquotaIR;
    }

    public void setAliquotaIR(float aliquotaIR) {
        this.aliquotaIR = aliquotaIR;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nCodigo: %s\nSalario-base: %.2f\nSalario-familia: %.2f\nSalario-liquido: %.2f",
                this.nome, this.cdemp, this.salario, (dependentes * valorPorDep), this.calculaSalario());
    }
}