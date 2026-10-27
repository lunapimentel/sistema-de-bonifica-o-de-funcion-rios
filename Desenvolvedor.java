public class Desenvolvedor extends Funcionario {
    private int quantProjetos;

    //construtor
    public Desenvolvedor (String nome, double salarioBase, int quantProjetos)
    {
        super(nome, salarioBase);
        this.quantProjetos = quantProjetos;
    }

    //metodos getters/setters
    public int getQuantProjetos () {
        return quantProjetos;
    }
    public void setQuantProjetos (int quantProjetos) {
        this.quantProjetos = quantProjetos;
    }

    //sobescrevendo metodo
    @Override 
    public double calcularSalario () {
        double comissao;
        comissao = quantProjetos * 300;
        return getSalarioBase() + comissao;
    }
}
