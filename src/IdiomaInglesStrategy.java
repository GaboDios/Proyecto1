public class IdiomaInglesStrategy implements IdiomaStrategy {

    @Override
    public void imprimirBienvenida() {
        System.out.println("Welcome to CheemsMart");
    }

    @Override
    public void imprimirMensajeUsuario() {
        System.out.println("Please enter your username:");
    }

    @Override
    public void imprimirMensajeUsuarioNoEncontrado() {
        System.out.println("User not found. Please try again.");
    }

    @Override
    public void imprimirMensajeContrasenia() {
        System.out.println("Please enter your password:");
    }

    @Override
    public void imprimirMensajeAccesoConcedido(String nombreCliente) {
        System.out.println("Access granted. Welcome " + nombreCliente + "!");
    }

    @Override
    public void imprimirMensajeContraseniaIncorrecta(int intentosRestantes) {
        System.out.println("Incorrect password. Remaining attempts: " + intentosRestantes);
    }

    @Override
    public void imprimirMensajeIntentosFallidos() {
        System.out.println("Too many failed attempts. The program will close.");
    }

    @Override
    public void imprimirMensajeDescuento(double cantidadDescuento, String departamentoDesc) {
        System.out.println("Congratulations, you have a discount of " + (int) (cantidadDescuento * 100) + "% on " + departamentoDesc + ".");
    }

    @Override
    public void imprimirMensajeSinDescuento() {
        System.out.println("You don't have a discount this time.");
    }

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

    @Override
    public void imprimirMensajeAgregarCarrito() {
        System.out.println("Option to add to the shopping cart selected.");
    }

    @Override
    public void imprimirMensajeCodigoNoValido() {
        System.out.println("The barcode does not match any item.");
    }

    @Override
    public void imprimirMensajeRevisarCarrito() {
        System.out.println("Option to view the shopping cart selected.");
    }

    @Override
    public void imprimirMensajeSaldoDisponible(double saldo) {
        System.out.println("Available balance: $" + saldo);
    }

    @Override
    public void imprimirMensajeDespedida() {
        System.out.println("Thank you for visiting CheemsMart. See you soon!");
    }

    public void departamentosDisponibles(){
        System.out.println("Available departments:");
    }
    public void seleccionarDepartamento(){
        System.out.println("Select a department:");
    }
    public void productosEnDepartamentoSelec(String departamentoSeleccionado){
        System.out.println("Products in the department of " + departamentoSeleccionado + ":");
    }
    public void ingresarCodigoDeBarras(){
        System.out.println("Please enter the barcode of the product you wish to add to the cart:");
    }
    public void elCarritoEstaVacio(){
        System.out.println("The cart is empty.");
    }
    public void productosEnCarrito(){
        System.out.println("Products in the cart:");
    }
    public void totalAPagar(double totalPagar){
        System.out.println("Total to pay (without discount applied to everything): $" + totalPagar);
    }
    public void ingresarCuentaBancaria(){
        System.out.println("Please enter your bank account number to make the payment:");
    }
    public void cuentaVerificada(){
        System.out.println("Bank account successfully verified.");
    }
    public void cuentaIncorrecta(int intentosCuenta){
        System.out.println("Incorrect account number. Remaining attempts: " + intentosCuenta);
    }
    public void tarjetaBloqueada(){
        System.out.println("Card blocked. The number of attempts has been exceeded. Exiting the store...");
    }
    public void pagoRealizado(double saldo){
        System.out.println("Payment successfully made. Your new available balance is: $" + saldo);
    }
    public void saldoInsuficiente(){
        System.out.println("Insufficient funds. Payment cannot be processed.");
    }
    public void totalPagarNeto(double totalCarritoConDescuento){
        System.out.println("Total to pay: $" + totalCarritoConDescuento);
    }
    public void informacionProducto(String codigoBarras, String nombreProd, double precioOrig, double cantDesc, double precioDesc){
        System.out.println("Barcode: " + codigoBarras +
                ", Product: " + nombreProd +
                ", Original Price: $" + precioOrig +
                (cantDesc != 1 ? ", Discounted Price: $" + precioDesc : ""));
    }
}
