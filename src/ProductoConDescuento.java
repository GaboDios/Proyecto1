public class ProductoConDescuento extends Producto {
    private Producto producto;
    private double descuento; // Valor del descuento en porcentaje (ej. 0.10 para 10% de descuento)

    // Constructor
    public ProductoConDescuento(Producto producto, double descuento) {
        super(producto.getCodigoBarras(), producto.getNombre(), producto.getDepartamento(), producto.getPrecio());
        this.producto = producto;
        this.descuento = descuento;
    }

    // Método para obtener el precio con descuento
    public double getPrecioConDescuento() {
        double precioOriginal = producto.getPrecio();
        return precioOriginal - (precioOriginal * descuento);
    }

    // Sobrescribir el método para mostrar los detalles del producto
    @Override
    public void mostrarDetalles() {
        System.out.println("Producto con Descuento: " + producto.getNombre());
        System.out.println("Código de Barras: " + producto.getCodigoBarras());
        System.out.println("Departamento: " + producto.getDepartamento());
        System.out.println("Precio Original: $" + producto.getPrecio());
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio con Descuento: $" + getPrecioConDescuento());
    }
}
