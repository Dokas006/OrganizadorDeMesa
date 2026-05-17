package Serviços;
import Dominio.Mesa;
import Test.OrganizadorDeMesaTest;

public class MostrarTodasAsMesas {

    public void MostrarTodasAsMesas(Mesa[] mesas) {
        System.out.println("=== LISTA DE PEDIDOS ===");
        for (Mesa mesa : mesas) {
            System.out.println(mesa.toString());
        }

    }
}
