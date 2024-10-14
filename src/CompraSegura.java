public abstract class CompraSegura {
    // Método plantilla para procesar la compra segura
    public final void procesarCompra() {
        validarCarrito();
        if (validarCuentaBancaria()) {
            procesarPago();
            generarFactura();
        } else {
            System.out.println("Compra fallida: Validación de la cuenta bancaria fallida.");
        }
    }

    // Método para validar el carrito de compras (puede ser sobrescrito si es necesario)
    protected void validarCarrito() {
        System.out.println("Validando el carrito de compras...");
        // Se podría agregar lógica para verificar que el carrito no esté vacío, etc.
    }

    // Método abstracto para validar la cuenta bancaria (debe ser implementado por subclases)
    protected abstract boolean validarCuentaBancaria();

    // Método para procesar el pago
    protected void procesarPago() {
        System.out.println("Procesando el pago de manera segura...");
        // Aquí se puede agregar la lógica específica del procesamiento del pago
    }

    // Método para generar la factura
    protected void generarFactura() {
        System.out.println("Generando factura...");
        // Aquí se podría generar un documento o confirmación de compra
    }
}
