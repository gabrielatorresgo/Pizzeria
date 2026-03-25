import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private ArrayList<Pedido> pedidos;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.pedidos = new ArrayList<>();
    }

    public boolean addPedido(Pedido pedido) {
        if (pedido == null) {
            return false;
        }
        pedidos.add(pedido);
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente{nombre='" + nombre + "'}";
    }
}import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private ArrayList<Pedido> pedidos;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.pedidos = new ArrayList<>();
    }

    public boolean addPedido(Pedido pedido) {
        if (pedido == null) {
            return false;
        }
        pedidos.add(pedido);
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente{nombre='" + nombre + "'}";
    }
}