package Test;

import Dominio.Mesa;
import Serviços.CalcularValorTotal;
import Serviços.MostrarTodasAsMesas;

public class OrganizadorDeMesaTest {
    static void main() {
        Mesa mesa01 = new Mesa("Pedro Belo Nogueira",101,200);
        Mesa mesa02 = new Mesa("Pedro Belo Nogueira",101,200);
        Mesa[] pedidos = {mesa01, mesa02};
        CalcularValorTotal mostrarValorTotal = new CalcularValorTotal();
        MostrarTodasAsMesas mostrarTodasAsMesas = new MostrarTodasAsMesas();
        System.out.println(mostrarValorTotal.calcularValorTotal(pedidos));

    }
}
