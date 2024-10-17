public abstract class ClienteFactory {
    // Método abstracto que las subclases implementarán
    public abstract Cliente crearCliente(String nombreUsuario, String contraseña, String nombre, String telefono, String direccion, String cuentaBancaria, double saldoInicial);
}



