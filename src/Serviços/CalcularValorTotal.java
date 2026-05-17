package Serviços;
import Dominio.Mesa;

public class CalcularValorTotal {
   private double valorTotal;
   public double calcularValorTotal(Mesa[] pedido){
       ;
       for(Mesa m: pedido){
           m.getValorDoPedido();
           valorTotal += m.getValorDoPedido();
       }
       return valorTotal;
   }


}
