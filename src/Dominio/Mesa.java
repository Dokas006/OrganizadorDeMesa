package Dominio;

public class Mesa {

    private String nomeDoCliente;
    private int numeroDaMesa;
    private double valorDoPedido;

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public int getNumeroDaMesa() {
        return numeroDaMesa;
    }

    public double getValorDoPedido() {
        return valorDoPedido;
    }

    public Mesa(String nomeDoCliente, int numeroDaMesa, double valorDoPedido) {
        this.nomeDoCliente = nomeDoCliente;
        this.numeroDaMesa = numeroDaMesa;
        this.valorDoPedido = valorDoPedido;
    }

    @Override
    public String toString() {
        return "{Mesa: "+numeroDaMesa + " - " + nomeDoCliente + " - " + valorDoPedido + "}";
    }

   public void mostrarMesa(){
       System.out.println(toString());
   }
}
