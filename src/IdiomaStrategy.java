/**
 * Estrategia para manejar la interfaz de usuario en diferentes idiomas.
 * Cada metodo imprime un mensaje correspondiente a una interaccion en el idioma configurado.
 *
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public interface IdiomaStrategy {
    /**
     * Imprime el mensaje de bienvenida en el idioma correspondiente.
     */
    void imprimirBienvenida();

    /**
     * Imprime el mensaje solicitando al usuario ingresar su nombre de usuario.
     */
    void imprimirMensajeUsuario();

    /**
     * Imprime el mensaje cuando el usuario no ha sido encontrado.
     */
    void imprimirMensajeUsuarioNoEncontrado();

    /**
     * Imprime el mensaje solicitando al usuario ingresar su contrasenia.
     */
    void imprimirMensajeContrasenia();

    /**
     * Imprime el mensaje cuando el acceso ha sido concedido, incluyendo el nombre del cliente.
     *
     * @param nombreCliente El nombre del cliente al que se le concede acceso.
     */
    void imprimirMensajeAccesoConcedido(String nombreCliente);

    /**
     * Imprime el mensaje cuando la contrasenia ingresada es incorrecta, mostrando los intentos restantes.
     *
     * @param intentosRestantes El numero de intentos restantes para ingresar la contrasenia correcta.
     */
    void imprimirMensajeContraseniaIncorrecta(int intentosRestantes);

    /**
     * Imprime el mensaje informando que se han agotado los intentos fallidos para ingresar la contrasenia.
     */
    void imprimirMensajeIntentosFallidos();

    /**
     * Imprime el mensaje notificando al cliente sobre un descuento en un departamento especifico.
     *
     * @param cantidadDescuento La cantidad de descuento que se aplica.
     * @param departamentoDesc El departamento donde se aplica el descuento.
     */
    void imprimirMensajeDescuento(double cantidadDescuento, String departamentoDesc);

    /**
     * Imprime el mensaje notificando que no se aplica ningun descuento.
     */
    void imprimirMensajeSinDescuento();

    /**
     * Imprime el menu de opciones disponibles para el cliente.
     */
    void imprimirMenuOpciones();

    /**
     * Imprime el mensaje solicitando al cliente agregar un producto al carrito de compras.
     */
    void imprimirMensajeAgregarCarrito();

    /**
     * Imprime el mensaje indicando que el codigo de barras ingresado no es valido.
     */
    void imprimirMensajeCodigoNoValido();

    /**
     * Imprime el mensaje solicitando al cliente revisar los productos en el carrito de compras.
     */
    void imprimirMensajeRevisarCarrito();

    /**
     * Imprime el mensaje mostrando el saldo disponible del cliente.
     *
     * @param saldo El saldo disponible del cliente.
     */
    void imprimirMensajeSaldoDisponible(double saldo);

    /**
     * Imprime el mensaje de despedida para el cliente.
     */
    void imprimirMensajeDespedida();

    /**
     * Imprime la lista de departamentos disponibles en la tienda.
     */
    void departamentosDisponibles();

    /**
     * Imprime el mensaje solicitando al cliente seleccionar un departamento.
     */
    void seleccionarDepartamento();

    /**
     * Imprime los productos disponibles en el departamento seleccionado.
     *
     * @param departamento El nombre del departamento seleccionado.
     */
    void productosEnDepartamentoSelec(String departamento);

    /**
     * Solicita al cliente ingresar el codigo de barras de un producto.
     */
    void ingresarCodigoDeBarras();

    /**
     * Imprime el mensaje informando que el carrito de compras esta vacio.
     */
    void elCarritoEstaVacio();

    /**
     * Imprime la lista de productos en el carrito de compras.
     */
    void productosEnCarrito();

    /**
     * Imprime el total a pagar sin aplicar descuentos generales.
     *
     * @param totalPagar El total antes de aplicar descuentos.
     */
    void totalAPagar(double totalPagar);

    /**
     * Solicita al cliente ingresar su cuenta bancaria para realizar el pago.
     */
    void ingresarCuentaBancaria();

    /**
     * Imprime el mensaje confirmando que la cuenta bancaria ha sido verificada.
     */
    void cuentaVerificada();

    /**
     * Imprime el mensaje indicando que la cuenta bancaria es incorrecta, mostrando los intentos restantes.
     *
     * @param intentosCuenta El numero de intentos restantes para ingresar la cuenta bancaria correcta.
     */
    void cuentaIncorrecta(int intentosCuenta);

    /**
     * Imprime el mensaje informando que la tarjeta ha sido bloqueada debido a demasiados intentos fallidos.
     */
    void tarjetaBloqueada();

    /**
     * Imprime el mensaje indicando que el pago se ha realizado con exito y muestra el saldo disponible del cliente.
     *
     * @param saldo El saldo disponible del cliente despues del pago.
     */
    void pagoRealizado(double saldo);

    /**
     * Imprime el mensaje indicando que no se puede realizar el pago debido a saldo insuficiente.
     */
    void saldoInsuficiente();

    /**
     * Imprime el total a pagar despues de aplicar los descuentos.
     *
     * @param totalCarritoConDescuento El total despues de aplicar los descuentos.
     */
    void totalPagarNeto(double totalCarritoConDescuento);

    /**
     * Imprime la informacion de un producto en el carrito de compras, incluyendo el precio original,
     * la cantidad de descuento y el precio con descuento si aplica.
     *
     * @param codigoBarras El codigo de barras del producto.
     * @param nombreProd El nombre del producto.
     * @param precioOrig El precio original del producto.
     * @param cantDesc La cantidad de descuento aplicada, si la hay.
     * @param precioDesc El precio del producto con descuento, si aplica.
     */
    void informacionProducto(String codigoBarras, String nombreProd, double precioOrig, double cantDesc, double precioDesc);

    /**
     * Imprime en pantalla cuando se entregará su pedido.
     */
    void tiempoDeEntrega(String direccion);
}
