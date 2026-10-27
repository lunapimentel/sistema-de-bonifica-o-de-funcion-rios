import java.util.List;
import java.util.ArrayList;

public class Empresa {
    public static void main (String[] args) {

        //criando lista
        List<Funcionario> funcionario = new ArrayList<>();

        Gerente g1 = new Gerente("Carlos", 5000, 1000);
        Desenvolvedor d1 = new Desenvolvedor("Luna", 3000, 5);
        Desenvolvedor d2 = new Desenvolvedor("Beatriz", 3000, 3);

        funcionario.add(g1);
        funcionario.add(d1);
        funcionario.add(d2);

        for (Funcionario f : funcionario) {
            System.out.println("Nome: " + f.getNome() + " | Salario: R$" + f.calcularSalario());
        }
    }
}
