package src.entregador;

import java.util.ArrayList;

public class ListaPedidos {

    ArrayList<Pedido> pedidos  = new ArrayList<>();

    public void adiconar(Pedido pedido){
        this.pedidos.add(pedido);
    }

    public void montarRotaEntrega(String bairro){
        Integer tamanho = pedidos.size();
        for (int i = 0; i < tamanho; i++){
            Pedido pedido = pedidos.get(i);
            if(pedido.getBairro().equals(bairro)){
                System.out.println(pedido.getRota());
            }
        }
    }


}
