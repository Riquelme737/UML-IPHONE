public class Iphone extends Smartphone implements ReprodutorMusical, NavegadorInternet{

    public Iphone(String modelo, String numero) {
        super(modelo, numero);
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página no Iphone.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada no Iphone.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada no Iphone.");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Reproduzindo música no Iphone.");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada no Iphone.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada no Iphone.");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando para outro número no Iphone.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada no Iphone.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no Iphone.");
    }
}
