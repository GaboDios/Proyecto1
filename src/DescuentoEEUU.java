public class DescuentoEEUU implements DescuentoStrategy {
    @Override
    public double aplicarDescuento(Producto producto, double descuento) {
        // Por ejemplo, un 10% de descuento en productos de electrónica
        if (producto.getDepartamento().equalsIgnoreCase("Electrónica")) {
            return producto.getPrecio() * (1 - descuento); // % de descuento
        }
        return 0.0; // Sin descuento para otros departamentos
    }
}
