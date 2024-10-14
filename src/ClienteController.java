public class ClienteController {
    private Cliente cliente;
    private ClienteView vista;

    // Constructor
    public ClienteController(Cliente cliente, ClienteView vista) {
        this.cliente = cliente;
        this.vista = vista;
    }

    // Método para actualizar el nombre del cliente
    public void setNombreCliente(String nombre) {
        cliente.setNombre(nombre);
    }

    // Método para obtener el nombre del cliente
    public String getNombreCliente() {
        return cliente.getNombre();
    }

    // Método para actualizar la dirección del cliente
    public void setDireccionCliente(String direccion) {
        cliente.setDireccion(direccion);
    }

    // Método para obtener la dirección del cliente
    public String getDireccionCliente() {
        return cliente.getDireccion();
    }

    // Método para actualizar el teléfono del cliente
    public void setTelefonoCliente(String telefono) {
        cliente.setTelefono(telefono);
    }

    // Método para obtener el teléfono del cliente
    public String getTelefonoCliente() {
        return cliente.getTelefono();
    }

    // Método para actualizar la vista con los detalles del cliente
    public void actualizarVista() {
        vista.mostrarDetallesCliente(cliente);
    }
}
