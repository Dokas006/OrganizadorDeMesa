package Operations;
import Dominio.Mesa;

public class CalcularValorTotal {
   private double valorTotal;
   public double valorTotal(Mesa[] pedido){
       ;
       for(Mesa m: pedido){
           m.getValorDoPedido();
           valorTotal += m.getValorDoPedido();
       }
       return valorTotal;
   }
   public void MostrarValorTotal(Mesa[] pedido){
       valorTotal(pedido);
       System.out.println("Valor Total: R$" + valorTotal);
   }


}
