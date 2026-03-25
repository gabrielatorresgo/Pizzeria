import java.util.ArrayList;

public class PedidoTelefono extends Pedido {
    private String telefono;

    public PedidoTelefono(Cliente cliente, String telefono, ArrayList<Item> items) {
        super(cliente, items);
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}