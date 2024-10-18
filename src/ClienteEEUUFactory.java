// Implementación para clientes de EEUU
public class ClienteEEUUFactory extends ClienteFactory {
    @Override
    public Cliente crearCliente(String nombreUsuario, String contrasenia, String nombre, String telefono, String direccion, String cuentaBancaria, double saldoInicial) {
        return new Cliente(nombreUsuario, contrasenia, nombre, telefono, direccion, cuentaBancaria, "EEUU", saldoInicial, "Electrónica");
    }
}