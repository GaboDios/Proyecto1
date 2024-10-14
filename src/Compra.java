public class Compra {
    private Cliente cliente;
    private CarritoCompras carrito;
    private String cuentaBancaria;
    private boolean pagoValidado;

    // Constructor
    public Compra(Cliente cliente, CarritoCompras carrito, String cuentaBancaria) {
        this.cliente = cliente;
        this.carrito = carrito;
        this.cuentaBancaria = cuentaBancaria;
        this.pagoValidado = false; // Inicialmente, el pago no está validado
    }

    // Método para calcular el total de la compra
    public double calcularTotal() {
        return carrito.calcularTotal();
    }

    // Método para validar la cuenta bancaria del cliente antes de procesar la compra
    public boolean validarCuentaBancaria() {
        if (cliente.getCuentaBancaria().equals(this.cuentaBancaria)) {
            this.pagoValidado = true;
            System.out.println("Cuenta bancaria validada exitosamente.");
        } else {
            this.pagoValidado = false;
            System.out.println("Error en la validación de la cuenta bancaria.");
        }
        return pagoValidado;
    }

    // Método para procesar la compra si el pago ha sido validado
    public boolean procesarCompra() {
        if (pagoValidado) {
            double total = calcularTotal();
            System.out.println("Compra procesada exitosamente.");
            System.out.println("Total de la compra: $" + total);
            return true;
        } else {
            System.out.println("Compra no procesada. El pago no ha sido validado.");
            return false;
        }
    }

    // Método para mostrar los detalles de la compra
    public void mostrarDetallesCompra() {
        System.out.println("Detalles de la compra para el cliente: " + cliente.getNombre());
        carrito.mostrarCarrito();
        System.out.println("Cuenta bancaria usada: " + cuentaBancaria);
        if (pagoValidado) {
            System.out.println("El pago ha sido validado.");
        } else {
            System.out.println("El pago no ha sido validado.");
        }
    }
}
