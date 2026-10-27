public class Funcionario {
    private String nome;
    private double salarioBase;

    //construtor
    public Funcionario (String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    //metodos getters/setters
    public String getNome () {
        return nome;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    } 

    //metodo
    public double calcularSalario () {
        return salarioBase;
    }
}