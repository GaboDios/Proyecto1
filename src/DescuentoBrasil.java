public class DescuentoBrasil implements DescuentoStrategy {
    @Override
    public double aplicarDescuento(Producto producto) {
        // Por ejemplo, un 20% de descuento en productos alimenticios
        if (producto.getDepartamento().equalsIgnoreCase("Alimentos")) {
            return producto.getPrecio() * 0.20; // 20% de descuento
        }
        return 0.0; // Sin descuento para otros departamentos
    }
}
