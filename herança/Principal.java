package heranca;

public class Principal {

    public static void main(String[] args) {

        Funcionario f;
        f = new Funcionario("Yasmin", "5585785", 19);

        System.out.println("Nome do funcionario " + f.getNome());
        System.out.println("CPF do funcionario " + f.getCpf());
        f.salario=500;

    }
}
