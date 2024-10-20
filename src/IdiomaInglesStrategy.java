import java.util.Random;

/**
 * La clase IdiomaInglesStrategy implementa la interfaz IdiomaStrategy y proporciona
 * implementaciones de los mensajes en ingles para interactuar con el usuario en el sistema CheemsMart.
 * Esta clase se utiliza para mostrar mensajes de bienvenida, opciones de menu, mensajes de error y mas, en ingles.
 *
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public class IdiomaInglesStrategy implements IdiomaStrategy {

    /**
     * Imprime un mensaje de bienvenida en ingles.
     */
    @Override
    public void imprimirBienvenida() {
        System.out.println("Welcome to CheemsMart");
    }

    /**
     * Imprime el mensaje solicitando el nombre de usuario en ingles.
     */
    @Override
    public void imprimirMensajeUsuario() {
        System.out.println("Please enter your username:");
    }

    /**
     * Imprime el mensaje indicando que el usuario no fue encontrado, en ingles.
     */
    @Override
    public void imprimirMensajeUsuarioNoEncontrado() {
        System.out.println("User not found. Please try again.");
    }

    /**
     * Imprime el mensaje solicitando la contrasenia en ingles.
     */
    @Override
    public void imprimirMensajeContrasenia() {
        System.out.println("Please enter your password:");
    }

    /**
     * Imprime un mensaje cuando el acceso es concedido, personalizando con el nombre del cliente en ingles.
     *
     * @param nombreCliente El nombre del cliente que ha accedido exitosamente.
     */
    @Override
    public void imprimirMensajeAccesoConcedido(String nombreCliente) {
        System.out.println("Access granted. Welcome " + nombreCliente + "!");
    }

    /**
     * Imprime un mensaje cuando la contrasenia es incorrecta, indicando el numero de intentos restantes en ingles.
     *
     * @param intentosRestantes El numero de intentos restantes antes de bloquear el acceso.
     */
    @Override
    public void imprimirMensajeContraseniaIncorrecta(int intentosRestantes) {
        System.out.println("Incorrect password. Remaining attempts: " + intentosRestantes);
    }

    /**
     * Imprime un mensaje cuando se han excedido los intentos de acceso fallidos, en ingles.
     */
    @Override
    public void imprimirMensajeIntentosFallidos() {
        System.out.println("Too many failed attempts. The program will close.");
    }

    /**
     * Imprime un mensaje indicando el descuento aplicado al cliente en un departamento especifico, en ingles.
     *
     * @param cantidadDescuento  El porcentaje de descuento aplicado.
     * @param departamentoDesc   El departamento donde aplica el descuento.
     */
    @Override
    public void imprimirMensajeDescuento(double cantidadDescuento, String departamentoDesc) {
        System.out.println("Congratulations, you have a discount of " + (int) (cantidadDescuento * 100) + "% on " + departamentoDesc + ".");
    }

    /**
     * Imprime un mensaje indicando que no hay descuentos disponibles para el cliente, en ingles.
     */
    @Override
    public void imprimirMensajeSinDescuento() {
        System.out.println("You don't have a discount this time.");
    }

    /**
     * Imprime el menu de opciones disponibles en la tienda, en ingles.
     */
    @Override
    public void imprimirMenuOpciones() {
        System.out.println("Select an option:");
        System.out.println("1. Browse catalog");
        System.out.println("2. Add to shopping cart");
        System.out.println("3. View shopping cart");
        System.out.println("4. Check balance");
        System.out.println("5. Pay");
        System.out.println("6. Exit the store");
    }

    /**
     * Imprime un mensaje indicando que se selecciono la opcion para agregar productos al carrito de compras, en ingles.
     */
    @Override
    public void imprimirMensajeAgregarCarrito() {
        System.out.println("Option to add to the shopping cart selected.");
    }

    /**
     * Imprime un mensaje indicando que el codigo de barras ingresado no es valido, en ingles.
     */
    @Override
    public void imprimirMensajeCodigoNoValido() {
        System.out.println("The barcode does not match any item.");
    }

    /**
     * Imprime un mensaje indicando que se selecciono la opcion para revisar el carrito de compras, en ingles.
     */
    @Override
    public void imprimirMensajeRevisarCarrito() {
        System.out.println("Option to view the shopping cart selected.");
    }

    /**
     * Imprime el saldo disponible del cliente en ingles.
     *
     * @param saldo El saldo disponible del cliente.
     */
    @Override
    public void imprimirMensajeSaldoDisponible(double saldo) {
        System.out.println("Available balance: $" + saldo);
    }

    /**
     * Imprime un mensaje de despedida al salir de la tienda, en ingles.
     */
    @Override
    public void imprimirMensajeDespedida() {
        System.out.println("Thank you for visiting CheemsMart. See you soon!");
    }

    /**
     * Imprime un mensaje mostrando los departamentos disponibles, en ingles.
     */
    @Override
    public void departamentosDisponibles(){
        System.out.println("Available departments:");
    }

    /**
     * Imprime un mensaje solicitando seleccionar un departamento, en ingles.
     */
    @Override
    public void seleccionarDepartamento(){
        System.out.println("Select a department:");
    }

    /**
     * Imprime un mensaje mostrando los productos disponibles en el departamento seleccionado, en ingles.
     *
     * @param departamentoSeleccionado El nombre del departamento seleccionado.
     */
    @Override
    public void productosEnDepartamentoSelec(String departamentoSeleccionado){
        System.out.println("Products in the department of " + departamentoSeleccionado + ":");
    }

    /**
     * Imprime un mensaje solicitando ingresar el codigo de barras de un producto, en ingles.
     */
    @Override
    public void ingresarCodigoDeBarras(){
        System.out.println("Please enter the barcode of the product you wish to add to the cart:");
    }

    /**
     * Imprime un mensaje indicando que el carrito esta vacio, en ingles.
     */
    @Override
    public void elCarritoEstaVacio(){
        System.out.println("The cart is empty.");
    }

    /**
     * Imprime un mensaje mostrando los productos en el carrito de compras, en ingles.
     */
    @Override
    public void productosEnCarrito(){
        System.out.println("Products in the cart:");
    }

    /**
     * Imprime el total a pagar sin descuento, en ingles.
     *
     * @param totalPagar El monto total a pagar.
     */
    @Override
    public void totalAPagar(double totalPagar){
        System.out.println("Total to pay (without discount applied to everything): $" + totalPagar);
    }

    /**
     * Imprime un mensaje solicitando ingresar el numero de cuenta bancaria, en ingles.
     */
    @Override
    public void ingresarCuentaBancaria(){
        System.out.println("Please enter your bank account number to make the payment:");
    }

    /**
     * Imprime un mensaje indicando que la cuenta bancaria fue verificada correctamente, en ingles.
     */
    @Override
    public void cuentaVerificada(){
        System.out.println("Bank account successfully verified.");
    }

    /**
     * Imprime un mensaje indicando que el numero de cuenta es incorrecto y muestra los intentos restantes, en ingles.
     *
     * @param intentosCuenta El numero de intentos restantes.
     */
    @Override
    public void cuentaIncorrecta(int intentosCuenta){
        System.out.println("Incorrect account number. Remaining attempts: " + intentosCuenta);
    }

    /**
     * Imprime un mensaje indicando que la tarjeta ha sido bloqueada debido a demasiados intentos fallidos, en ingles.
     */
    @Override
    public void tarjetaBloqueada(){
        System.out.println("Card blocked. The number of attempts has been exceeded. Exiting the store...");
    }

    /**
     * Imprime un mensaje indicando que el pago fue realizado exitosamente y muestra el nuevo saldo disponible, en ingles.
     *
     * @param saldo El saldo disponible despues del pago.
     */
    @Override
    public void pagoRealizado(double saldo){
        System.out.println("Payment successfully made. Your new available balance is: $" + saldo);
    }

    /**
     * Imprime un mensaje indicando que el saldo es insuficiente para realizar el pago, en ingles.
     */
    @Override
    public void saldoInsuficiente(){
        System.out.println("Insufficient funds. Payment cannot be processed.");
    }

    /**
     * Imprime el total a pagar con los descuentos aplicados, en ingles.
     *
     * @param totalCarritoConDescuento El total del carrito con el descuento aplicado.
     */
    @Override
    public void totalPagarNeto(double totalCarritoConDescuento){
        System.out.println("Total to pay: $" + totalCarritoConDescuento);
    }

    /**
     * Imprime la informacion detallada de un producto en el carrito de compras, en ingles.
     *
     * @param codigoBarras   El codigo de barras del producto.
     * @param nombreProd     El nombre del producto.
     * @param precioOrig     El precio original del producto.
     * @param cantDesc       El porcentaje de descuento aplicado al producto.
     * @param precioDesc     El precio del producto con el descuento aplicado.
     */
    @Override
    public void informacionProducto(String codigoBarras, String nombreProd, double precioOrig, double cantDesc, double precioDesc){
        System.out.println("Barcode: " + codigoBarras +
                ", Product: " + nombreProd +
                ", Original Price: $" + precioOrig +
                (cantDesc != 1 ? ", Discounted Price: $" + precioDesc : ""));
    }

    public void tiempoDeEntrega(String direccion){
        Random random = new Random();
        int numeroDias = random.nextInt(7) + 2;
        System.out.println("Your order will be delivered to the address: " + direccion + " in " + numeroDias + " days.");
    }
}
