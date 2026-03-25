public class Item {
    private static int contadorId = 1;

    private int id;
    private String nombre;
    private int valor;

    public Item(String nombre, int valor) {
        this.id = contadorId++;
        this.nombre = nombre;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getValor() {
        return valor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Item{id=" + id + ", nombre='" + nombre + "', valor=" + valor + "}";
    }
}