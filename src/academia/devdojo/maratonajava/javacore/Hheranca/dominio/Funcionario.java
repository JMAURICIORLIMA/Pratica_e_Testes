package academia.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estático de Funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Funcionario - 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Funcionario - 2");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do contrutor Funcionario");
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Salário: " + this.salario);
        System.out.println("Eu " + this.nome + ", recebí o salário no valor de R$ " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
