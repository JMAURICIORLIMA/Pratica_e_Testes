package academia.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados... ");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados... ");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados... ");
    }

    public static void retriveMaxDataSize() {
        System.out.println("Dentro do retribeMaxDataSite na classe DatabaseLoader");
    }
}
