public class IdiomaPortuguesStrategy implements IdiomaStrategy {

    @Override
    public void imprimirBienvenida() {
        System.out.println("Bem-vindo ao CheemsMart");
    }

    @Override
    public void imprimirMensajeUsuario() {
        System.out.println("Por favor, insira seu nome de usuário:");
    }

    @Override
    public void imprimirMensajeUsuarioNoEncontrado() {
        System.out.println("Usuário não encontrado. Tente novamente.");
    }

    @Override
    public void imprimirMensajeContrasenia() {
        System.out.println("Por favor, insira sua senha:");
    }

    @Override
    public void imprimirMensajeAccesoConcedido(String nombreCliente) {
        System.out.println("Acesso concedido. Bem-vindo " + nombreCliente + "!");
    }

    @Override
    public void imprimirMensajeContraseniaIncorrecta(int intentosRestantes) {
        System.out.println("Senha incorreta. Tentativas restantes: " + intentosRestantes);
    }

    @Override
    public void imprimirMensajeIntentosFallidos() {
        System.out.println("Muitas tentativas falhas. O programa será encerrado.");
    }

    @Override
    public void imprimirMensajeDescuento(double cantidadDescuento, String departamentoDesc) {
        System.out.println("Parabéns, você tem um desconto de " + (int) (cantidadDescuento * 100) + "% em " + departamentoDesc + ".");
    }

    @Override
    public void imprimirMensajeSinDescuento() {
        System.out.println("Você não tem desconto desta vez.");
    }

    @Override
    public void imprimirMenuOpciones() {
        System.out.println("Selecione uma opção:");
        System.out.println("1. Consultar catálogo");
        System.out.println("2. Adicionar ao carrinho de compras");
        System.out.println("3. Ver carrinho de compras");
        System.out.println("4. Ver saldo");
        System.out.println("5. Pagar");
        System.out.println("6. Sair da loja");
    }

    @Override
    public void imprimirMensajeAgregarCarrito() {
        System.out.println("Opção para adicionar ao carrinho selecionada.");
    }

    @Override
    public void imprimirMensajeCodigoNoValido() {
        System.out.println("O código de barras não corresponde a nenhum item.");
    }

    @Override
    public void imprimirMensajeRevisarCarrito() {
        System.out.println("Opção para revisar o carrinho de compras selecionada.");
    }

    @Override
    public void imprimirMensajeSaldoDisponible(double saldo) {
        System.out.println("Saldo disponível: $" + saldo);
    }

    @Override
    public void imprimirMensajeDespedida() {
        System.out.println("Obrigado por visitar CheemsMart. Até breve!");
    }

    public void departamentosDisponibles(){
        System.out.println("Departamentos disponiveis:");
    }
    public void seleccionarDepartamento(){
        System.out.println("Selecione um departamento:");
    }
    public void productosEnDepartamentoSelec(String departamentoSeleccionado){
        System.out.println("Produtos no departamento de " + departamentoSeleccionado + ":");
    }
    public void ingresarCodigoDeBarras(){
        System.out.println("Por favor, insira o código de barras do produto que deseja adicionar ao carrinho:");
    }
    public void elCarritoEstaVacio(){
        System.out.println("O carrinho está vazio.");
    }
    public void productosEnCarrito(){
        System.out.println("Produtos no carrinho:");
    }
    public void totalAPagar(double totalPagar){
        System.out.println("Total a pagar (sem desconto aplicado a tudo): $" + totalPagar);
    }
    public void ingresarCuentaBancaria(){
        System.out.println("or favor, insira o número da sua conta bancária para efetuar o pagamento:");
    }
    public void cuentaVerificada(){
        System.out.println("Conta bancária verificada com sucesso.");
    }
    public void cuentaIncorrecta(int intentosCuenta){
        System.out.println("Número de conta incorreto. Tentativas restantes: " + intentosCuenta);
    }
    public void tarjetaBloqueada(){
        System.out.println("Cartão bloqueado. O número de tentativas foi excedido. Saindo da loja...");
    }
    public void pagoRealizado(double saldo){
        System.out.println("Pagamento realizado com sucesso. Seu novo saldo disponível é: $" + saldo);
    }
    public void saldoInsuficiente(){
        System.out.println("Saldo insuficiente. Não é possível realizar o pagamento.");
    }
}
