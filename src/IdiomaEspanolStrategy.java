public class IdiomaEspanolStrategy implements IdiomaStrategy {

    @Override
    public void imprimirBienvenida() {
        System.out.println("Bienvenido a CheemsMart");
    }

    @Override
    public void imprimirMensajeUsuario() {
        System.out.println("Por favor, introduce tu nombre de usuario:");
    }

    @Override
    public void imprimirMensajeUsuarioNoEncontrado() {
        System.out.println("Usuario no encontrado. Intenta nuevamente.");
    }

    @Override
    public void imprimirMensajeContrasenia() {
        System.out.println("Por favor, introduce tu contraseña:");
    }

    @Override
    public void imprimirMensajeAccesoConcedido(String nombreCliente) {
        System.out.println("Acceso concedido. Bienvenido " + nombreCliente + "!");
    }

    @Override
    public void imprimirMensajeContraseniaIncorrecta(int intentosRestantes) {
        System.out.println("Contraseña incorrecta. Intentos restantes: " + intentosRestantes);
    }

    @Override
    public void imprimirMensajeIntentosFallidos() {
        System.out.println("Demasiados intentos fallidos. El programa se cerrará.");
    }

    @Override
    public void imprimirMensajeDescuento(double cantidadDescuento, String departamentoDesc) {
        System.out.println("Felicidades, tienes un descuento del " + (int) (cantidadDescuento * 100) + "% en " + departamentoDesc + ".");
    }

    @Override
    public void imprimirMensajeSinDescuento() {
        System.out.println("No tienes descuento en esta ocasión.");
    }

    @Override
    public void imprimirMenuOpciones() {
        System.out.println("Seleccione una opción:");
        System.out.println("1. Consultar catálogo");
        System.out.println("2. Agregar al carrito de compras");
        System.out.println("3. Revisar el carrito de compras");
        System.out.println("4. Revisar saldo");
        System.out.println("5. Pagar");
        System.out.println("6. Salir de la tienda");
    }

    @Override
    public void imprimirMensajeAgregarCarrito() {
        System.out.println("Opción para agregar al carrito de compras seleccionada.");
    }

    @Override
    public void imprimirMensajeCodigoNoValido() {
        System.out.println("El código de barras no concuerda con ningún artículo.");
    }

    @Override
    public void imprimirMensajeRevisarCarrito() {
        System.out.println("Opción para revisar el carrito de compras seleccionada.");
    }

    @Override
    public void imprimirMensajeSaldoDisponible(double saldo) {
        System.out.println("Saldo disponible: $" + saldo);
    }

    @Override
    public void imprimirMensajeDespedida() {
        System.out.println("Gracias por visitar CheemsMart. ¡Hasta pronto!");
    }

    public void departamentosDisponibles(){
        System.out.println("Departamentos disponibles:");
    }
    public void seleccionarDepartamento(){
        System.out.println("Seleccione un departamento:");
    }
    public void productosEnDepartamentoSelec(String departamentoSeleccionado){
        System.out.println("Productos en el departamento de " + departamentoSeleccionado + ":");
    }
    public void ingresarCodigoDeBarras(){
        System.out.println("Por favor, ingrese el código de barras del producto que desea agregar al carrito:");
    }
    public void elCarritoEstaVacio(){
        System.out.println("El carrito está vacío.");
    }
    public void productosEnCarrito(){
        System.out.println("Productos en el carrito:");
    }
    public void totalAPagar(double totalPagar){
        System.out.println("Total a pagar (sin descuento aplicado a todo): $" + totalPagar);
    }
    public void ingresarCuentaBancaria(){
        System.out.println("Por favor, ingrese su número de cuenta bancaria para realizar el pago:");
    }
    public void cuentaVerificada(){
        System.out.println("Cuenta bancaria verificada con éxito.");
    }
    public void cuentaIncorrecta(int intentosCuenta){
        System.out.println("Número de cuenta incorrecto. Intentos restantes: " + intentosCuenta);
    }
    public void tarjetaBloqueada(){
        System.out.println("Tarjeta bloqueada. Se ha excedido el número de intentos. Saliendo de la tienda...");
    }
    public void pagoRealizado(double saldo){
        System.out.println("Pago realizado con éxito. Su nuevo saldo disponible es: $" + saldo);
    }
    public void saldoInsuficiente(){
        System.out.println("Saldo insuficiente. No se puede realizar el pago.");
    }
    public void totalPagarNeto(double totalCarritoConDescuento){
        System.out.println("Total a pagar: $" + totalCarritoConDescuento);
    }
    public void informacionProducto(String codigoBarras, String nombreProd, double precioOrig, double cantDesc, double precioDesc){
        System.out.println("Código de Barras: " + codigoBarras +
            ", Artículo: " + nombreProd +
            ", Precio Original: $" + precioOrig +
            (cantDesc != 1 ? ", Precio con Descuento: $" + precioDesc : ""));
    }
}
