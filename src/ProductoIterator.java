import java.util.List;

public class ProductoIterator implements Iterator {
    private List<Producto> productos;
    private int posicion = 0;

    // Constructor
    public ProductoIterator(List<Producto> productos) {
        this.productos = productos;
    }

    // Verifica si hay más productos en la lista
    @Override
    public boolean hasNext() {
        return posicion < productos.size();
    }

    // Retorna el siguiente producto en la lista
    @Override
    public Producto next() {
        if (this.hasNext()) {
            return productos.get(posicion++);
        }
        return null;
    }
}
