package academia.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academia.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Benjamin";
        estudante01.idade = 6;
        estudante01.sexo = 'M';

        estudante02.nome = "Ellen";
        estudante02.idade = 4;
        estudante02.sexo = 'F';

        estudante01.imprime();

        System.out.println("----------------------------");

        estudante02.imprime();
    }
}
