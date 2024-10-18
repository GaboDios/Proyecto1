// Implementación para clientes de México
public class ClienteMexicoFactory extends ClienteFactory {
    @Override
    public Cliente crearCliente(String nombreUsuario, String contrasenia, String nombre, String telefono, String direccion, String cuentaBancaria, double saldoInicial) {
        return new Cliente(nombreUsuario, contrasenia, nombre, telefono, direccion, cuentaBancaria, "México", saldoInicial, "Electrodomésticos");
    }
}