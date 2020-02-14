abstract public class Peca {
    public String modelo;
    public String marca;


    public Peca(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
