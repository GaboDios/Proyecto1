// Implementación para clientes de Brasil
public class ClienteBrasilFactory extends ClienteFactory {
    @Override
    public Cliente crearCliente(String nombreUsuario, String contraseña, String nombre, String telefono, String direccion, String cuentaBancaria) {
        return new Cliente(nombreUsuario, contraseña, nombre, telefono, direccion, cuentaBancaria, "Brasil");
    }
}
