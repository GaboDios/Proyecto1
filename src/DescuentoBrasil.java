public class DescuentoBrasil implements DescuentoStrategy {
    @Override
    public double aplicarDescuento(Producto producto, double descuento) {
        // Por ejemplo, un 20% de descuento en productos alimenticios
        if (producto.getDepartamento().equalsIgnoreCase("Alimentos")) {
            return producto.getPrecio() * (1 - descuento); // % de descuento
        }
        return 0.0; // Sin descuento para otros departamentos
    }
}
