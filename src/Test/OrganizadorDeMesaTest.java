package Test;

import Dominio.Mesa;
import Serviços.CalcularValorTotal;
import Serviços.MostrarPedidoMaisCaro;
import Serviços.MostrarTodasAsMesas;
import Serviços.MostrarPedidoMaisCaro;

public class OrganizadorDeMesaTest {
    static void main() {
        Mesa mesa01 = new Mesa("Pedro Belo Nogueira",101,60);
        Mesa mesa02 = new Mesa("Pedro Belo Nogueira",101,40);
        Mesa[] pedidos = {mesa01, mesa02};
        CalcularValorTotal mostrarValorTotal = new CalcularValorTotal();
        MostrarTodasAsMesas mostrarTodasAsMesas = new MostrarTodasAsMesas();
        MostrarPedidoMaisCaro mostrarPedidoMaisCaro = new MostrarPedidoMaisCaro();
        mostrarTodasAsMesas.MostrarTodasAsMesas(pedidos);

        mostrarValorTotal.MostrarValorTotal(pedidos);
        mostrarPedidoMaisCaro.MostrarPedidoMaisCaro(pedidos);

    }
}
