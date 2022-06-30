package academia.devdojo.maratonajava.javacore.Npolimorfismo.Teste;

import academia.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academia.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academia.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("--------------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
