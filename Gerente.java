public class Gerente extends Funcionario {
    private double bonusAnual;

    //construtor
    public Gerente (String nome, double salarioBase, double bonusAnual)
    {
        super(nome, salarioBase);
        this.bonusAnual = bonusAnual;
    }

    //metodos getters/setters
    public double getBonusAnual () {
        return bonusAnual;
    }
    public void setBonusAnual (double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }

    //sobescrevendo o metodo
    @Override
    public double calcularSalario () {
        return getSalarioBase() + bonusAnual;
    }
}
