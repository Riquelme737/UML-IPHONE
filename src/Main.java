public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("Iphone 8", "+55 (21) 4002-8902");
        System.out.println(iphone);
        iphone.selecionarMusica();
        iphone.tocarMusica();
        iphone.pausarMusica();

        System.out.println("===============================");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        System.out.println("===============================");
        iphone.iniciarCorreioVoz();
        iphone.atender();
        iphone.ligar();

    }
}