package src.feirante;

public class Produto {

    private String nome;
    private Integer precoEmCentavos;
    private Integer quantidadeEmEstoque;
    private Integer faturamento = 0;

    void setNome(String nome) {
        this.nome = nome;
        return;
    }

    void setPreco(Double preco) {
        if (preco > 0.0) {
            preco = preco * 100;
            this.precoEmCentavos = preco.intValue();

        }
        else {
            System.out.println("O Preço deve ser maior que zero");
        }
    }

    void setQuantidadeEmEstoque(Integer quantidade) {
        if (quantidade > 0) {
            this.quantidadeEmEstoque = quantidade;
        }
        else{
            System.out.println("Quantidade tem que ser maior que 0");
        }
    }

    void vender(Integer quantidade) {
        if (quantidade <= quantidadeEmEstoque) {
            this.quantidadeEmEstoque = this.quantidadeEmEstoque - quantidade;
            this.faturamento = this.faturamento + (quantidade*this.precoEmCentavos);
        }
        else {
            System.out.println("Quantidade em estoque insuficiente!");
        }
    }

    void verFaturamento() {
        Double faturamentoEmReais = this.faturamento.doubleValue() / 100.0;
        System.out.println("Faturamento: " + faturamentoEmReais);
    }


}
