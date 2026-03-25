import java.util.ArrayList;

public class Pizzeria {
    private String nombre;
    private ArrayList<Cliente> clientes;
    private ArrayList<Item> items;
    private ArrayList<Pedido> pedidos;

    public Pizzeria() {
        this.nombre = "Pizzeria";
        this.clientes = new ArrayList<>();
        this.items = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public Pizzeria(String nombre) {
        this.nombre = nombre;
        this.clientes = new ArrayList<>();
        this.items = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public boolean addCliente(Cliente cliente) {
        if (cliente == null) {
            return false;
        }
        clientes.add(cliente);
        return true;
    }

    public boolean addItem(Item item) {
        if (item == null) {
            return false;
        }
        items.add(item);
        return true;
    }

    public boolean addPedido(Pedido pedido) {
        if (pedido == null) {
            return false;
        }

        pedidos.add(pedido);

        // También se agrega al cliente correspondiente
        Cliente clienteDelPedido = pedido.getCliente();
        if (clienteDelPedido != null) {
            clienteDelPedido.addPedido(pedido);
        }

        return true;
    }

    public Cliente getCliente(int index) {
        if (index < 0 || index >= clientes.size()) {
            return null;
        }
        return clientes.get(index);
    }

    public Item getItem(int index) {
        if (index < 0 || index >= items.size()) {
            return null;
        }
        return items.get(index);
    }

    public int calcProdMasVendidoCliente(int numCliente) {
        if (numCliente < 0 || numCliente >= clientes.size()) {
            return -1;
        }

        Cliente cliente = clientes.get(numCliente);

        // arreglo para contar ventas de cada item
        int[] contador = new int[items.size()];

        // recorrer solo pedidos online del cliente
        for (Pedido pedido : cliente.getPedidos()) {
            if (pedido instanceof PedidoOnLine) {
                for (Item itemPedido : pedido.getItems()) {
                    int posicionItem = items.indexOf(itemPedido);
                    if (posicionItem != -1) {
                        contador[posicionItem]++;
                    }
                }
            }
        }

        // Mostrar resultados como en el ejemplo del profesor
        System.out.println("num_cliente = " + numCliente);
        for (int i = 0; i < items.size(); i++) {
            System.out.println("El producto " + items.get(i).getNombre() + " se vendio " + contador[i]);
        }

        // buscar el índice con mayor cantidad
        int max = 0;
        int indiceMax = -1;

        for (int i = 0; i < contador.length; i++) {
            if (contador[i] > max) {
                max = contador[i];
                indiceMax = i;
            }
        }

        return indiceMax;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}