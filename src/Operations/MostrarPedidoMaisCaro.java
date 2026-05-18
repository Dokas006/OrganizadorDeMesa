package Operations;
import Dominio.Mesa;
import Test.OrganizadorDeMesaTest;

public class MostrarPedidoMaisCaro {
    private Mesa MesaMaisCara(Mesa[] pedidos){
       Mesa maiorValor = pedidos[0];
       for(int i=1;i<pedidos.length;i++){
           if (pedidos[1].getValorDoPedido()>maiorValor.getValorDoPedido()){
               maiorValor = pedidos[i];
           }
       }
        return maiorValor;
    }

    public void MostrarPedidoMaisCaro(Mesa[] pedidos ){
        MesaMaisCara(pedidos);
        System.out.println("Pedido Mais caro: " +  MesaMaisCara(pedidos));

    }
}
