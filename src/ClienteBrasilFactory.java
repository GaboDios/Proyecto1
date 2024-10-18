// Implementación para clientes de Brasil
public class ClienteBrasilFactory extends ClienteFactory {
    @Override
    public Cliente crearCliente(String nombreUsuario, String contrasenia, String nombre, String telefono, String direccion, String cuentaBancaria, double saldoInicial) {
        return new Cliente(nombreUsuario, contrasenia, nombre, telefono, direccion, cuentaBancaria, "Brasil", saldoInicial, "Alimentos");
    }
}
