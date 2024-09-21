package src.entregador;

public class PedidoTest {

    public static void main (String[] args){
        Pedido pedido = new Pedido();
        pedido.setCliente("Antonio");
        pedido.setProduto("Almoço");
        pedido.setRota("110N", "Alameda 5", "26");

        ListaPedidos listaPedidos = new ListaPedidos();
        listaPedidos.adiconar(pedido);

        Pedido outroPedido = new Pedido();
        outroPedido.setCliente("Luiz");
        outroPedido.setProduto("Almoço");
        outroPedido.setRota("112N", "Alameda 35", "26");
        listaPedidos.adiconar(outroPedido);

        Pedido maisPedidos = new Pedido();
        maisPedidos.setCliente("Joaquim");
        maisPedidos.setProduto("Almoço");
        maisPedidos.setRota("110N", "Alameda 4", "1");
        listaPedidos.adiconar(maisPedidos);

        listaPedidos.montarRotaEntrega("110N");

    }
}
