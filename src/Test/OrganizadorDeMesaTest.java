package Test;

import Dominio.Mesa;
import Serviços.CalcularValorTotal;
import Serviços.MostrarPedidoMaisCaro;
import Serviços.MostrarTodasAsMesas;
import Serviços.MostrarPedidoMaisCaro;

public class OrganizadorDeMesaTest {
    static void main() {
        Mesa mesa01 = new Mesa("Cliente 01",101,60);
        Mesa mesa02 = new Mesa("Cliente 02",102,80);
        Mesa mesa03 = new Mesa("Cliente 03",103,20);
        Mesa[] pedidos = {mesa01, mesa02, mesa03};
        CalcularValorTotal mostrarValorTotal = new CalcularValorTotal();
        MostrarTodasAsMesas mostrarTodasAsMesas = new MostrarTodasAsMesas();
        MostrarPedidoMaisCaro mostrarPedidoMaisCaro = new MostrarPedidoMaisCaro();
        mostrarTodasAsMesas.MostrarTodasAsMesas(pedidos);
        System.out.println("--------------------------------------");
        mostrarValorTotal.MostrarValorTotal(pedidos);
        System.out.println("--------------------------------------");
        mostrarPedidoMaisCaro.MostrarPedidoMaisCaro(pedidos);

    }
}
