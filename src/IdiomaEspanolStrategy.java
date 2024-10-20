import java.util.Random;
/**
 * La clase IdiomaEspanolStrategy implementa la interfaz IdiomaStrategy y proporciona
 * implementaciones de los mensajes en espanol para interactuar con el usuario en el sistema CheemsMart.
 * Esta clase se utiliza para mostrar mensajes de bienvenida, opciones de menu, mensajes de error y mas, en espanol.
 *
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public class IdiomaEspanolStrategy implements IdiomaStrategy {

    /**
     * Imprime un mensaje de bienvenida en espanol.
     */
    @Override
    public void imprimirBienvenida() {
        System.out.println("Bienvenido a CheemsMart");
    }

    /**
     * Imprime el mensaje solicitando el nombre de usuario.
     */
    @Override
    public void imprimirMensajeUsuario() {
        System.out.println("Por favor, introduce tu nombre de usuario:");
    }

    /**
     * Imprime el mensaje indicando que el usuario no fue encontrado.
     */
    @Override
    public void imprimirMensajeUsuarioNoEncontrado() {
        System.out.println("Usuario no encontrado. Intenta nuevamente.");
    }

    /**
     * Imprime el mensaje solicitando la contrasenia.
     */
    @Override
    public void imprimirMensajeContrasenia() {
        System.out.println("Por favor, introduce tu contrasenia:");
    }

    /**
     * Imprime un mensaje cuando el acceso es concedido, personalizando con el nombre del cliente.
     *
     * @param nombreCliente El nombre del cliente que ha accedido exitosamente.
     */
    @Override
    public void imprimirMensajeAccesoConcedido(String nombreCliente) {
        System.out.println("Acceso concedido. Bienvenido " + nombreCliente + "!");
    }

    /**
     * Imprime un mensaje cuando la contrasenia es incorrecta, indicando el numero de intentos restantes.
     *
     * @param intentosRestantes El numero de intentos restantes antes de bloquear el acceso.
     */
    @Override
    public void imprimirMensajeContraseniaIncorrecta(int intentosRestantes) {
        System.out.println("Contrasenia incorrecta. Intentos restantes: " + intentosRestantes);
    }

    /**
     * Imprime un mensaje cuando se han excedido los intentos de acceso fallidos.
     */
    @Override
    public void imprimirMensajeIntentosFallidos() {
        System.out.println("Demasiados intentos fallidos. El programa se cerrara.");
    }

    /**
     * Imprime un mensaje indicando el descuento aplicado al cliente en un departamento especifico.
     *
     * @param cantidadDescuento  El porcentaje de descuento aplicado.
     * @param departamentoDesc   El departamento donde aplica el descuento.
     */
    @Override
    public void imprimirMensajeDescuento(double cantidadDescuento, String departamentoDesc) {
        System.out.println("Felicidades, tienes un descuento del " + (int) (cantidadDescuento * 100) + "% en " + departamentoDesc + ".");
    }

    /**
     * Imprime un mensaje indicando que no hay descuentos disponibles para el cliente.
     */
    @Override
    public void imprimirMensajeSinDescuento() {
        System.out.println("No tienes descuento en esta ocasion.");
    }

    /**
     * Imprime el menu de opciones disponibles en la tienda.
     */
    @Override
    public void imprimirMenuOpciones() {
        System.out.println("Seleccione una opcion:");
        System.out.println("1. Consultar catalogo");
        System.out.println("2. Agregar al carrito de compras");
        System.out.println("3. Revisar el carrito de compras");
        System.out.println("4. Revisar saldo");
        System.out.println("5. Pagar");
        System.out.println("6. Salir de la tienda");
    }

    /**
     * Imprime un mensaje indicando que se selecciono la opcion para agregar productos al carrito de compras.
     */
    @Override
    public void imprimirMensajeAgregarCarrito() {
        System.out.println("Opcion para agregar al carrito de compras seleccionada.");
    }

    /**
     * Imprime un mensaje indicando que el codigo de barras ingresado no es valido.
     */
    @Override
    public void imprimirMensajeCodigoNoValido() {
        System.out.println("El codigo de barras no concuerda con ningun articulo.");
    }

    /**
     * Imprime un mensaje indicando que se selecciono la opcion para revisar el carrito de compras.
     */
    @Override
    public void imprimirMensajeRevisarCarrito() {
        System.out.println("Opcion para revisar el carrito de compras seleccionada.");
    }

    /**
     * Imprime el saldo disponible del cliente.
     *
     * @param saldo El saldo disponible del cliente.
     */
    @Override
    public void imprimirMensajeSaldoDisponible(double saldo) {
        System.out.println("Saldo disponible: $" + saldo);
    }

    /**
     * Imprime un mensaje de despedida al salir de la tienda.
     */
    @Override
    public void imprimirMensajeDespedida() {
        System.out.println("Gracias por visitar CheemsMart. ¡Hasta pronto!");
    }

    /**
     * Imprime un mensaje mostrando los departamentos disponibles.
     */
    @Override
    public void departamentosDisponibles(){
        System.out.println("Departamentos disponibles:");
    }

    /**
     * Imprime un mensaje solicitando seleccionar un departamento.
     */
    @Override
    public void seleccionarDepartamento(){
        System.out.println("Seleccione un departamento:");
    }

    /**
     * Imprime un mensaje mostrando los productos disponibles en el departamento seleccionado.
     *
     * @param departamentoSeleccionado El nombre del departamento seleccionado.
     */
    @Override
    public void productosEnDepartamentoSelec(String departamentoSeleccionado){
        System.out.println("Productos en el departamento de " + departamentoSeleccionado + ":");
    }

    /**
     * Imprime un mensaje solicitando ingresar el codigo de barras de un producto.
     */
    @Override
    public void ingresarCodigoDeBarras(){
        System.out.println("Por favor, ingrese el codigo de barras del producto que desea agregar al carrito:");
    }

    /**
     * Imprime un mensaje indicando que el carrito esta vacio.
     */
    @Override
    public void elCarritoEstaVacio(){
        System.out.println("El carrito esta vacio.");
    }

    /**
     * Imprime un mensaje mostrando los productos en el carrito de compras.
     */
    @Override
    public void productosEnCarrito(){
        System.out.println("Productos en el carrito:");
    }

    /**
     * Imprime el total a pagar sin descuento.
     *
     * @param totalPagar El monto total a pagar.
     */
    @Override
    public void totalAPagar(double totalPagar){
        System.out.println("Total a pagar (sin descuento aplicado a todo): $" + totalPagar);
    }

    /**
     * Imprime un mensaje solicitando ingresar el numero de cuenta bancaria.
     */
    @Override
    public void ingresarCuentaBancaria(){
        System.out.println("Por favor, ingrese su numero de cuenta bancaria para realizar el pago:");
    }

    /**
     * Imprime un mensaje indicando que la cuenta bancaria fue verificada correctamente.
     */
    @Override
    public void cuentaVerificada(){
        System.out.println("Cuenta bancaria verificada con exito.");
    }

    /**
     * Imprime un mensaje indicando que el numero de cuenta es incorrecto y muestra los intentos restantes.
     *
     * @param intentosCuenta El numero de intentos restantes.
     */
    @Override
    public void cuentaIncorrecta(int intentosCuenta){
        System.out.println("Numero de cuenta incorrecto. Intentos restantes: " + intentosCuenta);
    }

    /**
     * Imprime un mensaje indicando que la tarjeta ha sido bloqueada debido a demasiados intentos fallidos.
     */
    @Override
    public void tarjetaBloqueada(){
        System.out.println("Tarjeta bloqueada. Se ha excedido el numero de intentos. Saliendo de la tienda...");
    }

    /**
     * Imprime un mensaje indicando que el pago fue realizado exitosamente y muestra el nuevo saldo disponible.
     *
     * @param saldo El saldo disponible despues del pago.
     */
    @Override
    public void pagoRealizado(double saldo){
        System.out.println("Pago realizado con exito. Su nuevo saldo disponible es: $" + saldo);
    }

    /**
     * Imprime un mensaje indicando que el saldo es insuficiente para realizar el pago.
     */
    @Override
    public void saldoInsuficiente(){
        System.out.println("Saldo insuficiente. No se puede realizar el pago.");
    }

    /**
     * Imprime el total a pagar con los descuentos aplicados.
     *
     * @param totalCarritoConDescuento El total del carrito con el descuento aplicado.
     */
    @Override
    public void totalPagarNeto(double totalCarritoConDescuento){
        System.out.println("Total a pagar: $" + totalCarritoConDescuento);
    }

    /**
     * Imprime la informacion detallada de un producto en el carrito de compras.
     *
     * @param codigoBarras   El codigo de barras del producto.
     * @param nombreProd     El nombre del producto.
     * @param precioOrig     El precio original del producto.
     * @param cantDesc       El porcentaje de descuento aplicado al producto.
     * @param precioDesc     El precio del producto con el descuento aplicado.
     */
    @Override
    public void informacionProducto(String codigoBarras, String nombreProd, double precioOrig, double cantDesc, double precioDesc){
        System.out.println("Codigo de Barras: " + codigoBarras +
            ", Articulo: " + nombreProd +
            ", Precio Original: $" + precioOrig +
            (cantDesc != 1 ? ", Precio con Descuento: $" + precioDesc : ""));
    }

    public void tiempoDeEntrega(String direccion){
        Random random = new Random();
        int numeroDias = random.nextInt(7) + 2;
        System.out.println("Su pedido se entregara en la dirección: " + direccion + " en " + numeroDias + " dias.");
    }
}
