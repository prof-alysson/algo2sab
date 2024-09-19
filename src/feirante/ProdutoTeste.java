package src.feirante;

import java.util.Scanner;

public class ProdutoTeste {

    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Boneca de pano");
        produto.setPreco(38.43);
        produto.setQuantidadeEmEstoque(10);

        Produto outroProduto = new Produto();
        outroProduto.setNome("mesa para boneca");
        outroProduto.setPreco(98.00);
        outroProduto.setQuantidadeEmEstoque(4);

        Produto maisUmProduto = new Produto();
        maisUmProduto.setNome("Vestido de boneca");
        maisUmProduto.setPreco(15.00);
        maisUmProduto.setQuantidadeEmEstoque(50);

        produto.vender(2);
        outroProduto.vender(1);
        maisUmProduto.vender(10);

        outroProduto.vender(10);

        produto.verFaturamento();
        outroProduto.verFaturamento();
        maisUmProduto.verFaturamento();

    }
}

