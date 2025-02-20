public abstract class Smartphone {

    private String modelo;
    private String numero;

    public Smartphone(String modelo, String numero) {
        this.modelo = modelo;
        this.numero = numero;
    }

    public abstract void ligar();
    public abstract void atender();
    public abstract void iniciarCorreioVoz();

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "modelo='" + modelo + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
