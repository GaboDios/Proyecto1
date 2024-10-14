public class CompraCliente extends CompraSegura {
    private Cliente cliente;
    private CarritoCompras carrito;
    private String cuentaBancaria;

    // Constructor
    public CompraCliente(Cliente cliente, CarritoCompras carrito, String cuentaBancaria) {
        this.cliente = cliente;
        this.carrito = carrito;
        this.cuentaBancaria = cuentaBancaria;
    }

    @Override
    protected boolean validarCuentaBancaria() {
        System.out.println("Validando la cuenta bancaria del cliente...");
        if (cliente.getCuentaBancaria().equals(cuentaBancaria)) {
            System.out.println("Cuenta bancaria validada exitosamente.");
            return true;
        } else {
            System.out.println("Error: La cuenta bancaria no coincide.");
            return false;
        }
    }

    @Override
    protected void validarCarrito() {
        System.out.println("Validando el carrito del cliente...");
        if (carrito.obtenerProductos().isEmpty()) {
            System.out.println("Error: El carrito está vacío.");
        } else {
            System.out.println("El carrito ha sido validado.");
        }
    }

    @Override
    protected void generarFactura() {
        System.out.println("Generando factura para el cliente " + cliente.getNombre());
        // Se puede agregar aquí más lógica para generar la factura
    }
}
