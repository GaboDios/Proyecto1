public class DescuentoMexico implements DescuentoStrategy {
    @Override
    public double aplicarDescuento(Producto producto) {
        // Por ejemplo, un 15% de descuento en productos de electrodomésticos
        if (producto.getDepartamento().equalsIgnoreCase("Electrodomésticos")) {
            return producto.getPrecio() * 0.15; // 15% de descuento
        }
        return 0.0; // Sin descuento para otros departamentos
    }
}
