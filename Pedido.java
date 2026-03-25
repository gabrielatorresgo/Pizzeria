import java.util.ArrayList;

public abstract class Pedido {
    protected Cliente cliente;
    protected ArrayList<Item> items;

    public Pedido(Cliente cliente, ArrayList<Item> items) {
        this.cliente = cliente;
        this.items = items;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}