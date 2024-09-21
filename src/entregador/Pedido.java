package src.entregador;

public class Pedido {
    private String cliente;
    private String produto;
    private String bairro;
    private String rua;
    private String casa;

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void setRota(String bairro, String rua, String casa) {
        this.bairro = bairro;
        this.rua = rua;
        this.casa = casa;
    }

    public String getCliente() {
        return this.cliente;
    }

    public String getProduto() {
        return this.produto;
    }

    public String getRota(){
        return this.bairro + " " + this.rua + ", " + this.casa;
    }

    public String getBairro() {
        return this.bairro;
    }
}
