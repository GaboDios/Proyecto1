import java.util.Random;

/**
 * La clase IdiomaPortuguesStrategy implementa la interfaz IdiomaStrategy y proporciona
 * implementaciones de los mensajes en portugues para interactuar con el usuario en el sistema CheemsMart.
 * Esta clase se utiliza para mostrar mensajes de bienvenida, opciones de menu, mensajes de error y mas, en portugues.
 *
 * @author Gabo, Pedro Yamil, Isaac (Los Hijos de Korhal)
 */
public class IdiomaPortuguesStrategy implements IdiomaStrategy {

    /**
     * Imprime un mensaje de bienvenida en portugues.
     */
    @Override
    public void imprimirBienvenida() {
        System.out.println("Bem-vindo ao CheemsMart");
    }

    /**
     * Imprime el mensaje solicitando el nombre de usuario en portugues.
     */
    @Override
    public void imprimirMensajeUsuario() {
        System.out.println("Por favor, insira seu nome de usuario:");
    }

    /**
     * Imprime el mensaje indicando que el usuario no fue encontrado, en portugues.
     */
    @Override
    public void imprimirMensajeUsuarioNoEncontrado() {
        System.out.println("Usuario nao encontrado. Tente novamente.");
    }

    /**
     * Imprime el mensaje solicitando la contrasenia en portugues.
     */
    @Override
    public void imprimirMensajeContrasenia() {
        System.out.println("Por favor, insira sua senha:");
    }

    /**
     * Imprime un mensaje cuando el acceso es concedido, personalizando con el nombre del cliente en portugues.
     *
     * @param nombreCliente El nombre del cliente que ha accedido exitosamente.
     */
    @Override
    public void imprimirMensajeAccesoConcedido(String nombreCliente) {
        System.out.println("Acesso concedido. Bem-vindo " + nombreCliente + "!");
    }

    /**
     * Imprime un mensaje cuando la contrasenia es incorrecta, indicando el numero de intentos restantes en portugues.
     *
     * @param intentosRestantes El numero de intentos restantes antes de bloquear el acceso.
     */
    @Override
    public void imprimirMensajeContraseniaIncorrecta(int intentosRestantes) {
        System.out.println("Senha incorreta. Tentativas restantes: " + intentosRestantes);
    }

    /**
     * Imprime un mensaje cuando se han excedido los intentos de acceso fallidos, en portugues.
     */
    @Override
    public void imprimirMensajeIntentosFallidos() {
        System.out.println("Muitas tentativas falhas. O programa sera encerrado.");
    }

    /**
     * Imprime un mensaje indicando el descuento aplicado al cliente en un departamento especifico, en portugues.
     *
     * @param cantidadDescuento  El porcentaje de descuento aplicado.
     * @param departamentoDesc   El departamento donde aplica el descuento.
     */
    @Override
    public void imprimirMensajeDescuento(double cantidadDescuento, String departamentoDesc) {
        System.out.println("Parabens, voce tem um desconto de " + (int) (cantidadDescuento * 100) + "% em " + departamentoDesc + ".");
    }

    /**
     * Imprime un mensaje indicando que no hay descuentos disponibles para el cliente, en portugues.
     */
    @Override
    public void imprimirMensajeSinDescuento() {
        System.out.println("Voce nao tem desconto desta vez.");
    }

    /**
     * Imprime el menu de opciones disponibles en la tienda, en portugues.
     */
    @Override
    public void imprimirMenuOpciones() {
        System.out.println("Selecione uma opcao:");
        System.out.println("1. Consultar catalogo");
        System.out.println("2. Adicionar ao carrinho de compras");
        System.out.println("3. Ver carrinho de compras");
        System.out.println("4. Ver saldo");
        System.out.println("5. Pagar");
        System.out.println("6. Sair da loja");
    }

    /**
     * Imprime un mensaje indicando que se selecciono la opcion para agregar productos al carrito de compras, en portugues.
     */
    @Override
    public void imprimirMensajeAgregarCarrito() {
        System.out.println("Opcao para adicionar ao carrinho selecionada.");
    }

    /**
     * Imprime un mensaje indicando que el codigo de barras ingresado no es valido, en portugues.
     */
    @Override
    public void imprimirMensajeCodigoNoValido() {
        System.out.println("O codigo de barras nao corresponde a nenhum item.");
    }

    /**
     * Imprime un mensaje indicando que se selecciono la opcion para revisar el carrito de compras, en portugues.
     */
    @Override
    public void imprimirMensajeRevisarCarrito() {
        System.out.println("Opcao para revisar o carrinho de compras selecionada.");
    }

    /**
     * Imprime el saldo disponible del cliente en portugues.
     *
     * @param saldo El saldo disponible del cliente.
     */
    @Override
    public void imprimirMensajeSaldoDisponible(double saldo) {
        System.out.println("Saldo disponivel: $" + saldo);
    }

    /**
     * Imprime un mensaje de despedida al salir de la tienda, en portugues.
     */
    @Override
    public void imprimirMensajeDespedida() {
        System.out.println("Obrigado por visitar CheemsMart. Ate breve!");
    }

    /**
     * Imprime un mensaje mostrando los departamentos disponibles, en portugues.
     */
    @Override
    public void departamentosDisponibles(){
        System.out.println("Departamentos disponiveis:");
    }

    /**
     * Imprime un mensaje solicitando seleccionar un departamento, en portugues.
     */
    @Override
    public void seleccionarDepartamento(){
        System.out.println("Selecione um departamento:");
    }

    /**
     * Imprime un mensaje mostrando los productos disponibles en el departamento seleccionado, en portugues.
     *
     * @param departamentoSeleccionado El nombre del departamento seleccionado.
     */
    @Override
    public void productosEnDepartamentoSelec(String departamentoSeleccionado){
        System.out.println("Produtos no departamento de " + departamentoSeleccionado + ":");
    }

    /**
     * Imprime un mensaje solicitando ingresar el codigo de barras de un producto, en portugues.
     */
    @Override
    public void ingresarCodigoDeBarras(){
        System.out.println("Por favor, insira o codigo de barras do produto que deseja adicionar ao carrinho:");
    }

    /**
     * Imprime un mensaje indicando que el carrito esta vacio, en portugues.
     */
    @Override
    public void elCarritoEstaVacio(){
        System.out.println("O carrinho esta vazio.");
    }

    /**
     * Imprime un mensaje mostrando los productos en el carrito de compras, en portugues.
     */
    @Override
    public void productosEnCarrito(){
        System.out.println("Produtos no carrinho:");
    }

    /**
     * Imprime el total a pagar sin descuento, en portugues.
     *
     * @param totalPagar El monto total a pagar.
     */
    @Override
    public void totalAPagar(double totalPagar){
        System.out.println("Total a pagar (sem desconto aplicado a tudo): $" + totalPagar);
    }

    /**
     * Imprime un mensaje solicitando ingresar el numero de cuenta bancaria, en portugues.
     */
    @Override
    public void ingresarCuentaBancaria(){
        System.out.println("or favor, insira o numero da sua conta bancaria para efetuar o pagamento:");
    }

    /**
     * Imprime un mensaje indicando que la cuenta bancaria fue verificada correctamente, en portugues.
     */
    @Override
    public void cuentaVerificada(){
        System.out.println("Conta bancaria verificada com sucesso.");
    }

    /**
     * Imprime un mensaje indicando que el numero de cuenta es incorrecto y muestra los intentos restantes, en portugues.
     *
     * @param intentosCuenta El numero de intentos restantes.
     */
    @Override
    public void cuentaIncorrecta(int intentosCuenta){
        System.out.println("Numero de conta incorreto. Tentativas restantes: " + intentosCuenta);
    }

    /**
     * Imprime un mensaje indicando que la tarjeta ha sido bloqueada debido a demasiados intentos fallidos, en portugues.
     */
    @Override
    public void tarjetaBloqueada(){
        System.out.println("Cartao bloqueado. O numero de tentativas foi excedido. Saindo da loja...");
    }

    /**
     * Imprime un mensaje indicando que el pago fue realizado exitosamente y muestra el nuevo saldo disponible, en portugues.
     *
     * @param saldo El saldo disponible despues del pago.
     */
    @Override
    public void pagoRealizado(double saldo){
        System.out.println("Pagamento realizado com sucesso. Seu novo saldo disponivel e: $" + saldo);
    }

    /**
     * Imprime un mensaje indicando que el saldo es insuficiente para realizar el pago, en portugues.
     */
    @Override
    public void saldoInsuficiente(){
        System.out.println("Saldo insuficiente. Nao e possivel realizar o pagamento.");
    }

    /**
     * Imprime el total a pagar con los descuentos aplicados, en portugues.
     *
     * @param totalCarritoConDescuento El total del carrito con el descuento aplicado.
     */
    @Override
    public void totalPagarNeto(double totalCarritoConDescuento){
        System.out.println("Total a pagar: $" + totalCarritoConDescuento);
    }

    /**
     * Imprime la informacion detallada de un producto en el carrito de compras, en portugues.
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
                ", Produto: " + nombreProd +
                ", Preco Original: R$" + precioOrig +
                (cantDesc != 1 ? ", Preco com Desconto: R$" + precioDesc : ""));
    }

    public void tiempoDeEntrega(String direccion){
        Random random = new Random();
        int numeroDias = random.nextInt(7) + 2;
        System.out.println("Seu pedido sera entregue no endereco: " + direccion + " em " + numeroDias + " dias.");
    }
}
